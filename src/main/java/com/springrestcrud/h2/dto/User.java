/**
 * 
 */
package com.springrestcrud.h2.dto;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * @author elena-01
 *
 */
@Entity
@Table(name = "users")
public class User {

	// ----------------Atributos----------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // search last reg
	private Long id;
	@Column(name = "username") // Username
	private String username;
	@Column(name = "email") // Email
	private String email;
	@Column(name = "steamprofile") // Steam Profile
	private String steamprofile;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_signin;

    @OneToMany
    @JoinColumn(name="id")
    private List<Message> message;
    
    @OneToMany
    @JoinColumn(name="id")
    private List<Party> party;
	
//----------------Constructors----------------

	public User() {

	}

	/**
	 * @param id
	 * @param username
	 * @param email
	 * @param steamprofile
	 * @param date_signin
	 */
	public User(Long id, String username, String email, String steamprofile, Date date_signin) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.steamprofile = steamprofile;
		this.date_signin = date_signin;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the steamprofile
	 */
	public String getSteamprofile() {
		return steamprofile;
	}

	/**
	 * @param steamprofile the steamprofile to set
	 */
	public void setSteamprofile(String steamprofile) {
		this.steamprofile = steamprofile;
	}

	/**
	 * @return the date_signin
	 */
	public Date getDate_signin() {
		return date_signin;
	}

	/**
	 * @param date_signin the date_signin to set
	 */
	public void setDate_signin(Date date_signin) {
		this.date_signin = date_signin;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", steamprofile=" + steamprofile
				+ ", date_signin=" + date_signin + "]";
	}

	
}
