/**
 * 
 */
package com.springrestcrud.h2.service;

import java.util.List;

import com.springrestcrud.h2.dto.Party;

/**
 * @author elena-01
 *
 */
public interface PartyService {
	/* CRUD Methods */
	public List<Party> listParties(); //List All
	
	public Party saveParty(Party party); //Save an 
	
	public Party getPartyById(Long id);//Read Data
	
	public Party updateParty(Party party);// Update Data
	
	public void deleteParty(Long id);	// Delete 
}
