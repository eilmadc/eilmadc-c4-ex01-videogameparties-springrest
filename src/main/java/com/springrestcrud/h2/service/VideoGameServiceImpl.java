/**
 * 
 */
package com.springrestcrud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestcrud.h2.dao.VideoGameDAO;
import com.springrestcrud.h2.dto.VideoGame;

/**
 * @author elena-01
 *
 */

@Service
public class VideoGameServiceImpl implements VideoGameService {

	@Autowired
	VideoGameDAO videogameDAO;

	public List<VideoGame> listVideoGames() {
		return videogameDAO.findAll();
	}

	public VideoGame saveVideoGame(VideoGame videogame) {

		return videogameDAO.save(videogame);
	}

	public VideoGame getVideoGameById(Long id) {
		return videogameDAO.findById(id).get();
	}

	@Override
	public VideoGame updateVideoGame(VideoGame videogame) {
		return videogameDAO.save(videogame);
	}

	@Override
	public void deleteVideoGame(Long id) {
		videogameDAO.deleteById(id);

	}

}
