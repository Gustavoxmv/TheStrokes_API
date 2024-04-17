package com.thestroke.thestrokes.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.thestroke.thestrokes.Entities.Album;
import com.thestroke.thestrokes.Entities.Cancion;
import com.thestroke.thestrokes.Repositories.AlbumRepository;
import com.thestroke.thestrokes.Repositories.CancionRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/api/album")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private CancionRepository cancionRepository;

    @GetMapping
    public List<Album> getAlbums() {
        return albumRepository.findAll();
    }

    @GetMapping("/{id}")
    public Album getAlbumById(@PathVariable Long id) {
        return albumRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el Id"));
    }

    @GetMapping("/{id}/canciones")
    public Set<Cancion> getCancionByAlbum(@PathVariable Long id) {
        Album album = albumRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el Id"));
        return album.getCanciones();
    }

 
 
   
}
