/**
 * 
 */
package com.springrestcrud.h2.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


/**
 * @author elena-01
 *
 */
@Entity
@Table(name = "messages")
public class Message {

	// ----------------Atributos----------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "message") // message
	private String message;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@ManyToOne
    @JoinColumn(name="user_id")
    private User user;

	@ManyToOne
    @JoinColumn(name="party_id")
    private Party party;

//----------------Constructors----------------
	public Message(){
		
	}
	
	
	/**
	 * @param id
	 * @param message
	 * @param party
	 * @param user
	 * @param date
	 */
	public Message(Long id, String message, Party party, User user, Date date ) {
		super();
		this.id = id;
		this.message = message;
		this.party = party;
		this.user = user;
		this.date = date;
	}
	
//----------------Getters y Setters----------------

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
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the party_id
	 */
	public Party getParty() {
		return party;
	}

	/**
	 * @param party_id the party_id to set
	 */
	public void setParty(Party party) {
		this.party = party;
	}

	/**
	 * @return the user_id
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", date=" + date + ", user=" + user + ", party=" + party
				+ "]";
	}
	
	
}