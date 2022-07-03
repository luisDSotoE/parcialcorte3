
package co.edu.unicesar.modelo;

/**
 *
 * @author JAIRO
 */
public class Libro extends Publicacion{
    private int nPaginas;
    private int edicion;

    public Libro(String idbn) {
        super(idbn);
    }

    public Libro() {
    }

    public Libro(int nPaginas, int edicion, String idbn, String titulo, String autor, int anio, double costo) {
        super(idbn, titulo, autor, anio, costo);
        this.nPaginas = nPaginas;
        this.edicion = edicion;
    }

    /**
     * @return the nPaginas
     */
    public int getnPaginas() {
        return nPaginas;
    }

    /**
     * @param nPaginas the nPaginas to set
     */
    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    /**
     * @return the edicion
     */
    public int getEdicion() {
        return edicion;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Libro{" +super.toString()+ ", nPaginas=" + this.nPaginas + ", edicion=" + edicion + '}';
    }

    @Override
    public String getDataStringFormat() {
        return "L;" + this.idbn + ";" + this.titulo + ";" + this.autor + ";" + this.anio + ";" + this.costo + ";" + this.nPaginas + ";" + this.edicion +";";
    }

    @Override
    public String getStringFormat() {
        
        String cadena = String.format("%-10s %-10s %-30s %-30s %-10d %-10d %-10s %-10s %-10s", 
                "Libro", this.idbn, this.titulo, this.autor, this.nPaginas, this.edicion, "","","");
        return cadena;
    }

    @Override
    public String[] getInfoDatos() {
        String datos[]  = {idbn, titulo,autor, String.valueOf(anio), String.valueOf(costo), String.valueOf(nPaginas) , String.valueOf(edicion)};
        return datos;
    }

   
    
    
}
