package com.thestroke.thestrokes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.thestroke.thestrokes.Entities.Album;
import com.thestroke.thestrokes.Entities.Cancion;
import com.thestroke.thestrokes.Repositories.AlbumRepository;
import com.thestroke.thestrokes.Repositories.CancionRepository;

import jakarta.annotation.PostConstruct;

@Component
public class DataInitializer {

    private AlbumRepository albumRepository;
    private CancionRepository cancionRepository;

    public DataInitializer(AlbumRepository albumRepository, CancionRepository cancionRepository) {
        this.albumRepository = albumRepository;
        this.cancionRepository = cancionRepository;
    }

    @PostConstruct
    public void initData() {

        Album album = new Album();
        album.setNombre("Is This It");
        album.setAnio(2001);
        album.setPortada(
                "https://video-images.vice.com/articles/5b87c7055d30f90006ff7a2a/lede/1535625521825-is-this-it-by-the-strokes-1.jpeg");

        Album album2 = new Album();
        album2.setNombre("Room on Fire");
        album2.setAnio(2003);
        album2.setPortada("https://m.media-amazon.com/images/I/81W5Uwxo-ZL._UF1000,1000_QL80_.jpg");

        Album album3 = new Album();
        album3.setNombre("First Impressions of Earth");
        album3.setAnio(2006);
        album3.setPortada("https://audioxide.com/api/images/album-artwork/first-impressions-of-earth-the-strokes-medium-standard.jpg");

        Album album4 = new Album();
        album4.setNombre("Angles");
        album4.setAnio(2011);
        album4.setPortada("https://m.media-amazon.com/images/I/81-wt1kTStL._UF1000,1000_QL80_.jpg");

        Album album5 = new Album();
        album5.setNombre("Comedown Machine");
        album5.setAnio(2013);
        album5.setPortada("https://m.media-amazon.com/images/I/61JWlz3hnRL._UF1000,1000_QL80_.jpg");

        Album album6 = new Album();
        album6.setNombre("The New Abnormal");
        album6.setAnio(2020);
        album6.setPortada("https://townsquare.media/site/366/files/2020/02/the-strokes-the-new-abnormal-cover.jpg?w=3000&q=75");
///////////////////////////////// CANCIONES    ALBUM 1 ///////////////////////////////////
        Set<Cancion> cancionesAlbum1 = new HashSet<>();

        cancionesAlbum1.add(SetSong("Is This It"));
        cancionesAlbum1.add(SetSong("The Modern Age"));
        cancionesAlbum1.add(SetSong("Soma"));
        cancionesAlbum1.add(SetSong("Barely Legal"));
        cancionesAlbum1.add(SetSong("Someday"));
        cancionesAlbum1.add(SetSong("Alone, Together"));
        cancionesAlbum1.add(SetSong("Last Nite"));
        cancionesAlbum1.add(SetSong("Hard to Explain"));
        cancionesAlbum1.add(SetSong("When It Started"));
        cancionesAlbum1.add(SetSong("Trying Your Luck"));
        cancionesAlbum1.add(SetSong("Take It or Leave It"));

        album.setCanciones(cancionesAlbum1);

     
////////////////////////////CANCIONES ALBUM 2////////////////////////////////////
        Set<Cancion> cancionesAlbum2 = new HashSet<>();

        cancionesAlbum2.add(SetSong("What Ever Happened?"));
        cancionesAlbum2.add(SetSong("Reptilia"));
        cancionesAlbum2.add(SetSong("Automatic Stop"));
        cancionesAlbum2.add(SetSong("12:51"));
        cancionesAlbum2.add(SetSong("You Talk Way Too Much"));
        cancionesAlbum2.add(SetSong("Between Love & Hate"));
        cancionesAlbum2.add(SetSong("Meet Me in the Bathroom"));
        cancionesAlbum2.add(SetSong("Under Control"));
        cancionesAlbum2.add(SetSong("The Way It Is"));
        cancionesAlbum2.add(SetSong("The End Has No End"));
        cancionesAlbum2.add(SetSong("I Can't Win"));

        album2.setCanciones(cancionesAlbum2);
      
     
    ////////////////////////////CANCIONES ALBUM 3//////////////////////////
    Set<Cancion> cancionesAlbum3 = new HashSet<>();

cancionesAlbum3.add(SetSong("You Only Live Once"));
cancionesAlbum3.add(SetSong("Juicebox"));
cancionesAlbum3.add(SetSong("Heart in a Cage"));
cancionesAlbum3.add(SetSong("Razorblade"));
cancionesAlbum3.add(SetSong("On the Other Side"));
cancionesAlbum3.add(SetSong("Vision of Division"));
cancionesAlbum3.add(SetSong("Ask Me Anything"));
cancionesAlbum3.add(SetSong("Electricityscape"));
cancionesAlbum3.add(SetSong("Killing Lies"));
cancionesAlbum3.add(SetSong("Fear of Sleep"));
cancionesAlbum3.add(SetSong("15 Minutes"));
cancionesAlbum3.add(SetSong("Ize of the World"));
cancionesAlbum3.add(SetSong("Evening Sun"));
cancionesAlbum3.add(SetSong("Red Light"));

album3.setCanciones(cancionesAlbum3);

/////////////////////////CANCIONES ALBUM 4///////////////////////////////

Set<Cancion> cancionesAlbum4 = new HashSet<>();

cancionesAlbum4.add(SetSong("Machu Picchu"));
cancionesAlbum4.add(SetSong("Under Cover of Darkness"));
cancionesAlbum4.add(SetSong("Two Kinds of Happiness"));
cancionesAlbum4.add(SetSong("You're So Right"));
cancionesAlbum4.add(SetSong("Taken for a Fool"));
cancionesAlbum4.add(SetSong("Games"));
cancionesAlbum4.add(SetSong("Call Me Back"));
cancionesAlbum4.add(SetSong("Gratisfaction"));
cancionesAlbum4.add(SetSong("Metabolism"));
cancionesAlbum4.add(SetSong("Life Is Simple in the Moonlight"));

album4.setCanciones(cancionesAlbum4);

/////////////////////////////CANCIONES ALBUM 5//////////////////////////////////////
Set<Cancion> cancionesAlbum5 = new HashSet<>();

cancionesAlbum5.add(SetSong("Tap Out"));
cancionesAlbum5.add(SetSong("All the Time"));
cancionesAlbum5.add(SetSong("One Way Trigger"));
cancionesAlbum5.add(SetSong("Welcome to Japan"));
cancionesAlbum5.add(SetSong("80's Comedown Machine"));
cancionesAlbum5.add(SetSong("50/50"));
cancionesAlbum5.add(SetSong("Slow Animals"));
cancionesAlbum5.add(SetSong("Partners in Crime"));
cancionesAlbum5.add(SetSong("Chances"));
cancionesAlbum5.add(SetSong("Happy Ending"));
cancionesAlbum5.add(SetSong("Call It Fate, Call It Karma"));

album5.setCanciones(cancionesAlbum5);
////////////////////////////////CANCIONES ALBUM 6//////////////////////////////////
Set<Cancion> cancionesAlbum6 = new HashSet<>();

cancionesAlbum6.add(SetSong("The Adults Are Talking"));
cancionesAlbum6.add(SetSong("Selfless"));
cancionesAlbum6.add(SetSong("Brooklyn Bridge to Chorus"));
cancionesAlbum6.add(SetSong("Bad Decisions"));
cancionesAlbum6.add(SetSong("Eternal Summer"));
cancionesAlbum6.add(SetSong("At the Door"));
cancionesAlbum6.add(SetSong("Why Are Sundays So Depressing"));
cancionesAlbum6.add(SetSong("Not the Same Anymore"));
cancionesAlbum6.add(SetSong("Ode to the Mets"));

album6.setCanciones(cancionesAlbum6);
////////////////////////////////////////////////////////////////////////////

List<Album> albums= new ArrayList<>();
albums.add(album);
albums.add(album2);
albums.add(album3);
albums.add(album4);
albums.add(album5);
albums.add(album6);

albumRepository.saveAll(albums);

    }

    public Cancion SetSong(String song) {

        Cancion cancion = new Cancion();

        cancion.setNombre(song);

        cancionRepository.save(cancion);

        return cancion;
    }

    
}