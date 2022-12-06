
package JugadorService;
import JugadorEntity.Jugador;
import JugadorInterFace.IJugadorService;
import JugadorRepository.IJugadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpJugadorService implements IJugadorService {
    @Autowired IJugadorRepository ijugadorRepository;
    
    @Override
    public List<Jugador> getJugador() {
        List<Jugador> jugador = ijugadorRepository.findAll();
        return jugador;
    }
    
    @Override
    public void saveJugador(Jugador jugador) {
        ijugadorRepository.save(jugador);
    }

    @Override
    public void deleteJugador(Long id) {
        ijugadorRepository.deleteById(id);
    }

    @Override
    public Jugador findJugador(Long id) {
        Jugador jugador = ijugadorRepository.findById(id).orElse(null);
        return jugador;
    }
}
