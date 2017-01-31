/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package next.flix;

import modelo.Pelicula;
import modelo.Serie;

/**
 *
 * @author SENA
 */
public class NextFlix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Serie ListadoSerie[] = new Serie[5];
        Pelicula ListadoPeliculas[] = new Pelicula[5];
        
        ListadoPeliculas[0] = new Pelicula();
        ListadoPeliculas[1] = new Pelicula("La Comunidad del anillo","Peter Jackson");
        
        ListadoSerie[0] = new Serie();
        ListadoSerie[1] = new Serie("The crom","Peter Morgan");
        
    }
    
}
