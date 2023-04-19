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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */
@Entity
@Table(name = "videogames")
public class VideoGame {

	// ----------------Atributos----------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "vname") // Username
	private String vname;
	@Column(name = "steamurl") // Email
	private String steamurl;
	@Column(name = "photo") // Steam Profile
	private String photo;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Party> parties;

//----------------Constructors----------------
	public VideoGame() {

	}

	/**
	 * @param id
	 * @param vname
	 * @param steamurl
	 * @param photo
	 * @param message
	 */
	public VideoGame(Long id, String vname, String steamurl, String photo) {
		super();
		this.id = id;
		this.vname = vname;
		this.steamurl = steamurl;
		this.photo = photo;
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
	 * @return the vname
	 */
	public String getVname() {
		return vname;
	}

	/**
	 * @param vname the vname to set
	 */
	public void setVname(String vname) {
		this.vname = vname;
	}

	/**
	 * @return the steamurl
	 */
	public String getSteamurl() {
		return steamurl;
	}

	/**
	 * @param steamurl the steamurl to set
	 */
	public void setSteamurl(String steamurl) {
		this.steamurl = steamurl;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "VideoGame [id=" + id + ", vname=" + vname + ", steamurl=" + steamurl + ", photo=" + photo + "]";
	}

}
