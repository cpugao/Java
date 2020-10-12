package com.carlopugao.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.carlopugao.lookify.models.Song;
import com.carlopugao.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepository;
	
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	
	public List<Song> allSongs() {
		return songRepository.findAll();
	}
	
	public Song createSong(Song s) {
		return songRepository.save(s);
	}
	
	public Song findSong(Long id) {
		Optional<Song> optionalSong = songRepository.findById(id);
		if (optionalSong.isPresent()) {
			return optionalSong.get();
		}
		else {
			return null;
		}
	}
	
	public Song updateSong(Long id, String title, String artist, Integer rating) {
		Song s = this.findSong(id);
		s.setTitle(title);
		s.setArtist(artist);
		s.setRating(rating);
		return songRepository.save(s);
	}
	
	public void deleteSong(Long id) {
		songRepository.deleteById(id);
	}
	
	public Song updateSong(Song song) {
		return songRepository.save(song);
	}
	
	public List<Song> getTopTen(){
		return songRepository.findTop10ByOrderByRatingDesc();
	}
	
	public List<Song> getSearchSongs(String artist){
		return songRepository.findByArtist(artist);
	}
}
