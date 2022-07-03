
package persistencia;

import Excepciones.ExcepcionArchivo;
import Excepciones.ExcepcionEscritura;
import Excepciones.ExcepcionLectura;
import java.util.List;
import co.edu.unicesar.modelo.Publicacion;

/**
 *
 * @author Jairo F
 */
public interface ICrudPublicacion {
    void registrarPublicacion(Publicacion a) throws ExcepcionArchivo;
    List<Publicacion> leerPublicacion() throws ExcepcionArchivo;
    Publicacion buscarPublicacion(Publicacion a)throws ExcepcionArchivo;
    Publicacion eliminarPublicacion(Publicacion a)throws ExcepcionArchivo;
    List<Publicacion> filtrarPublicacion(String serial) throws ExcepcionArchivo;
    List<Publicacion> buscarPublicacion(String serial) throws ExcepcionArchivo;
    
    
}
