/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potromusic.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.potromusic.entidades.Album;
import mx.itson.potromusic.entidades.Artista;
import mx.itson.potromusic.entidades.Canción;
import mx.itson.potromusic.enums.Género;

/**
 *
 * @author alumnog
 */
public class Main {
    public static void main(String[] args) {
        Artista artista= new Artista();
        artista.setNombre("BLACKPINK");
        artista.setSitioWeb("www.blackpink.com");
        
        Album a = new Album();
        a.setArtista(artista);
        a.setNombre("BORN PINK");
        a.setLanzamiento(2020);
        a.setGénero(Género.OTRO);
        
        List<Canción> canciones = new ArrayList<>();
        
    }
}
