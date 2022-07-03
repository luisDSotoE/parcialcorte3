
package co.edu.unicesar.modelo;

/**
 *
 * @author JAIRO
 */
public class AudioLibro extends Publicacion {
    private double duracion;
    private double peso;
    private String formato;

    public AudioLibro(String idbn) {
        super(idbn);
    }

    public AudioLibro() {
    }

    public AudioLibro(double duracion, double peso, String formato, String idbn, String titulo, String autor, int anio, double costo) {
        super(idbn, titulo, autor, anio, costo);
        this.duracion = duracion;
        this.peso = peso;
        this.formato = formato;
    }

    /**
     * @return the duracion
     */
    public double getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "AudioLibro{" +super.toString() + ", duracion=" + duracion + ", peso=" + peso + ", formato=" + formato + '}';
    }

    @Override
    public String getDataStringFormat() {
        return "A;" + this.idbn + ";" + this.titulo + ";" + this.autor + ";" + this.anio + ";" + this.costo + ";" + this.formato + ";" + this.duracion + ";" + this.peso;
    }

    @Override
    public String getStringFormat() {
        
        String cadena = String.format("%-10s %-10s %-30s %-30s %-10s %-10s %-10.2f %-10.2f %-10s", 
                "Audio Libro", this.idbn, this.titulo, this.autor, "", "", this.peso,this.duracion,this.formato);
        return cadena;
    }

    @Override
    public String[] getInfoDatos() {
        String datos[]  = {idbn, titulo,autor, String.valueOf(anio), String.valueOf(costo),"","", String.valueOf(duracion) , String.valueOf(peso),String.valueOf(formato)};
        return datos;
    }
    
    
    
}
