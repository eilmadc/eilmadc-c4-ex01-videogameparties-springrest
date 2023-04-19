/**
 * 
 */
package com.springrestcrud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrestcrud.h2.dto.VideoGame;
import com.springrestcrud.h2.service.VideoGameServiceImpl;
import com.springrestcrud.h2.dto.VideoGame;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class VideoGameController {

	@Autowired
	private VideoGameServiceImpl videogameServiceImpl;

	@GetMapping("/games")
	public List<VideoGame> listVideoGames() {
		return videogameServiceImpl.listVideoGames();

	}

	@PostMapping("/games")
	public VideoGame saveVideoGame(@RequestBody VideoGame videogame) {
		return videogameServiceImpl.saveVideoGame(videogame);
	}

	@GetMapping("/games/{id}")
	public VideoGame videogameById(@PathVariable(name = "id") Long id) {

		VideoGame videogame_id = new VideoGame();
		videogame_id = videogameServiceImpl.getVideoGameById(id);

		System.out.println("VideoGame By ID:" + videogame_id);

		return videogame_id;
	}

	@PutMapping("/games/{id}")
	public VideoGame updateVideoGame(@PathVariable(name = "id") Long id, @RequestBody VideoGame videogame) {
		VideoGame videogame_selected = new VideoGame();
		VideoGame videogame_updated = new VideoGame();

		videogame_selected = videogameServiceImpl.getVideoGameById(id);

		videogame_selected.setVname(videogame.getVname());
		videogame_selected.setSteamurl(videogame.getSteamurl());
		videogame_selected.setPhoto(videogame.getPhoto());

		videogame_updated = videogameServiceImpl.updateVideoGame(videogame_selected);

		return videogame;
	}

	@DeleteMapping("/games/{id}")
	public void deleteVideoGame(@PathVariable(name = "id") Long id) {
		videogameServiceImpl.deleteVideoGame(id);
	}

}
