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
public class Items implements IVisualizable{
    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private boolean visto;
    private String tvisto;


    public Items() {
       this.titulo=""; 
       this.genero="";
       this.creador="";
       this.duracion=0;
       this.visto=false;
       this.tvisto = "00m 00s";
    }
    
    
    public Items(String titulo, String creador) {
       this.titulo= titulo; 
       this.creador=creador;
       this.genero= "";       
       this.duracion=0;
       this.visto=false;
       this.tvisto = "00m 00s";
    }
    
    public Items(String titulo, String genero, String creador, int duracion) {
       this.titulo= titulo; 
       this.creador=creador;
       this.genero= genero;       
       this.duracion=0;
       this.visto=false;
       this.tvisto = "00m 00s";
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", duracion=" + duracion + ", visto=" + visto + ", tvisto=" + tvisto;
    } 
    
    @Override
    public void marcaVisto(String tvisualizado) {
        this.visto = true;
        this.tvisto = "Visualizado hasta el tiempo: " + tvisualizado;
    }

    @Override
    public boolean esVisto() {
        return this.visto;
    }

    @Override
    public String tiempoVisto() {
        return this.tvisto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public String getTvisto() {
        return tvisto;
    }

    public void setTvisto(String tvisto) {
        this.tvisto = tvisto;
    }
    
}
