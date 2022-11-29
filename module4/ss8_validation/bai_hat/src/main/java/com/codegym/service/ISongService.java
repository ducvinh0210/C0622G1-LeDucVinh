package com.codegym.service;

import com.codegym.dto.SongDto;
import com.codegym.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    void save(Song song);
    Song finfById(int id);

}
