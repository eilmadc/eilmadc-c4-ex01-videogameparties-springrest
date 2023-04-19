/**
 * 
 */
package com.springrestcrud.h2.dto;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */

@Entity
@Table(name = "parties")
public class Party {
	// ----------------Atributos----------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "pname") 
	private String pname;


	@OneToMany
	@JoinColumn(name = "id")
	private List<Message> message;

	@ManyToOne
	@JoinColumn(name = "videogame_id")
	private VideoGame videogame;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	// ----------------Constructors----------------

	public Party() {

	}

	/**
	 * @param id
	 * @param pname
	 * @param videogame
	 * @param user
	 */
	public Party(Long id, String pname, VideoGame videogame, User user) {
		super();
		this.id = id;
		this.pname = pname;
		this.videogame = videogame;
		this.user=user;
	}

	// ----------------Getters y Setters----------------
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return the videogame_id
	 */
	public VideoGame getVideogame() {
		return videogame;
	}

	/**
	 * @param videogame_id the videogame_id to set
	 */
	public void setVideogame(VideoGame videogame) {
		this.videogame = videogame;
	}


	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	
}
