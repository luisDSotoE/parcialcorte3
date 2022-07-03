
package co.edu.unicesar.modelo;

import Excepciones.ExcepcionArchivo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.PersistenciaObjetos;
import persistencia.ICrudPublicacion;

/**
 *
 * @author JAIRO
 */
public class ListaPublicacion implements ICrudPublicacion {
    
    private final ICrudPublicacion Publicaciones =new PersistenciaObjetos();
      
    @Override
    public void registrarPublicacion(Publicacion p) {
        
        try {
            this.Publicaciones.registrarPublicacion(p);
        } catch (ExcepcionArchivo ex) {
            Logger.getLogger(ListaPublicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Publicacion> leerPublicacion() {
        
        try {
            return this.Publicaciones.leerPublicacion();
        } catch (ExcepcionArchivo ex) {
            Logger.getLogger(ListaPublicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Publicacion buscarPublicacion(Publicacion p) {
        
        try {
            return this.Publicaciones.buscarPublicacion(p);
        } catch (ExcepcionArchivo ex) {
            Logger.getLogger(ListaPublicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Publicacion eliminarPublicacion(Publicacion p) {
        
        try {
            return this.Publicaciones.eliminarPublicacion(p);
        } catch (ExcepcionArchivo ex) {
            Logger.getLogger(ListaPublicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public List<Publicacion> filtrarPublicacion(String i) throws ExcepcionArchivo {
        return this.Publicaciones.filtrarPublicacion(i);
    }    

    @Override
    public List<Publicacion> buscarPublicacion(String serial) throws ExcepcionArchivo {
      return this.Publicaciones.buscarPublicacion(serial);
    }
}
