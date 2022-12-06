
package JugadorEntity;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter @Setter
@Entity
public class Jugador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud, solo números")
    private Number edad;
    
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String equipo;
    
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String posicion;    

        
}
