/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaftarFilm;

/**
 *
 * @author asus
 */
public class Film{
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println("Judl Film       : " + this.filmName);
        System.out.println("Genre Film      : " + this.filmGenre);
        System.out.println("Rating Film     : " + this.filmRating);
        System.out.println("Duration Film   : " + this.filmDuration);
        System.out.println("");
    
}
}
