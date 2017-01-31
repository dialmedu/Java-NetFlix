/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author SENA
 */
public class Pelicula extends Items implements IVisualizable{
    private int annio;
    
    public Pelicula(){
        super();
        this.annio = 1900;
    }
    
    public Pelicula(String titulo, String creador){
        super(titulo,creador);
        this.annio = 1900;
    }

    public Pelicula(String titulo, String genero, String creador, int duracion,int annio) {
        super(titulo, genero, creador, duracion);
        this.annio = annio;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    @Override
    public String toString() {
        return super.toString() +"Pelicula{" + "annio=" + annio + '}';
    }
    
}
