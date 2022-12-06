
package JugadorInterFace;


import JugadorEntity.Jugador;
import java.util.List;

public interface IJugadorService {
    
    //Traer una lista de jugadores
    public List<Jugador> getJugador();
    
    //Guardar un objeto de tipo jugador
    public void saveJugador(Jugador jugador);
    
    //Eliminar objeto por ID
    public void deleteJugador(Long id);
    
    //Buscar un jugador
    public Jugador findJugador(Long id);
    
}
