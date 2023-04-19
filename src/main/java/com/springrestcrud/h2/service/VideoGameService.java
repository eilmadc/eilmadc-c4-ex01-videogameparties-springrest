/**
 * 
 */
package com.springrestcrud.h2.service;

import java.util.List;

import com.springrestcrud.h2.dto.User;
import com.springrestcrud.h2.dto.VideoGame;

/**
 * @author elena-01
 *
 */
public interface VideoGameService{
	/* CRUD Methods */
	public List<VideoGame> listVideoGames(); //List All
	
	public VideoGame saveVideoGame(VideoGame videogame); //Save an 
	
	public VideoGame getVideoGameById(Long id);//Read Data
	
	public VideoGame updateVideoGame(VideoGame videogame);// Update Data
	
	public void deleteVideoGame(Long id);	// Delete 
	

}
