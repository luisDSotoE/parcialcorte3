
package co.edu.unicesar.modelo;

import java.io.Serializable;

public abstract class Publicacion  implements  Serializable{
    protected String idbn;
    protected String titulo;
    protected String autor;
    protected int anio;
    protected double costo;

    public Publicacion() {
    }

    public Publicacion(String idbn) {
        this.idbn = idbn;
    }

    public Publicacion(String idbn, String titulo, String autor, int anio, double costo) {
        this.idbn = idbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.costo = costo;
    }

    /**
     * @return the idbn
     */
    public String getIdbn() {
        return idbn;
    }

    /**
     * @param idbn the idbn to set
     */
    public void setIdbn(String idbn) {
        this.idbn = idbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "idbn=" + idbn + ", titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + ", costo=" + costo + '}';
    }
    
    public abstract String getDataStringFormat(); // retorna los datos del objeto en formato String
    public abstract String getStringFormat();
    public abstract String[] getInfoDatos();
    
}
