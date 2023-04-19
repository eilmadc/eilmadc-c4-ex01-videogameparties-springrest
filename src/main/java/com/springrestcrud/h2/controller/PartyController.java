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

import com.springrestcrud.h2.dto.Party;
import com.springrestcrud.h2.service.PartyServiceImpl;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class PartyController {

	@Autowired
	PartyServiceImpl partyServiceImpl;

	@GetMapping("/parties")
	public List<Party> listParties() {
		return partyServiceImpl.listParties();
	}

	@PostMapping("/parties")
	public Party saveParty(@RequestBody Party party) {

		return partyServiceImpl.saveParty(party);
	}

	@GetMapping("/parties/{id}")
	public Party partyById(@PathVariable(name = "id") Long id) {

		Party party_bid = new Party();

		party_bid = partyServiceImpl.getPartyById(id);

		System.out.println("Party XID: " + party_bid);

		return party_bid;
	}

	@PutMapping("/parties/{id}")
	public Party actualizarParty(@PathVariable(name = "id") Long id, @RequestBody Party party) {

		Party party_selected = new Party();
		Party party_updated = new Party();

		party_selected = partyServiceImpl.getPartyById(id);

		party_selected.setPname(party.getPname());
		party_selected.setVideogame(party.getVideogame());
		party_selected.setUser(party.getUser());

		party_updated = partyServiceImpl.updateParty(party_selected);

		System.out.println("The party updated is: " + party_updated);

		return party_updated;
	}

	@DeleteMapping("/partys/{id}")
	public void eliminarParty(@PathVariable(name = "id") Long id) {
		partyServiceImpl.deleteParty(id);
	}

}
