package com.thestroke.thestrokes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thestroke.thestrokes.Entities.Album;

public interface AlbumRepository extends JpaRepository<Album,Long> {

}
