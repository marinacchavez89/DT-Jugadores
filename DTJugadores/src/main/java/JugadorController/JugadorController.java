
package JugadorController;

import JugadorEntity.Jugador;
import JugadorInterFace.IJugadorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JugadorController {
    @Autowired IJugadorService ijugadorService;
    
    @GetMapping("jugador/listar")
    public List<Jugador> getJugador(){
        return ijugadorService.getJugador();
    }
    
    @PostMapping("/jugador/crear")
    public String createJugador(@RequestBody Jugador jugador){
        ijugadorService.saveJugador(jugador);
        return "El jugador fue creado correctamente";
    }
    
    @DeleteMapping("/jugador/borrar/{id}")
    public String deleteJugador(@PathVariable Long id){
    ijugadorService.deleteJugador(id);
    return "El jugador fue eliminado correctamente";
    }
    
    //URL:PUERTO/jugador/editar/1?nombre=nuevoNombre&apellido=nuevoApellido....
    @PutMapping("/jugador/editar/{id}")
    public Jugador editJugador(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,            
            @RequestParam("edad") Number nuevoEdad,
            @RequestParam("equipo") String nuevoEquipo,
            @RequestParam("posicion") String nuevoPosicion ){
     Jugador jugador = ijugadorService.findJugador(id);
     jugador.setNombre(nuevoNombre);
     jugador.setApellido(nuevoNombre);
     jugador.setEdad(nuevoEdad);
     jugador.setEquipo(nuevoEquipo);
     jugador.setPosicion(nuevoPosicion);
     
     
     ijugadorService.saveJugador(jugador);
     return jugador;
    }
    
    @GetMapping("/jugador/traer/info")
    public Jugador findJugador(){
        return ijugadorService.findJugador((long)1);
    }
}
