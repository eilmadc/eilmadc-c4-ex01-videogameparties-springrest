/**
 * 
 */
package com.springrestcrud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestcrud.h2.dao.PartyDAO;
import com.springrestcrud.h2.dto.Party;

/**
 * @author elena-01
 *
 */
@Service
public class PartyServiceImpl implements PartyService {
	
	@Autowired
	PartyDAO partyDAO;

	@Override
	public List<Party> listParties() {
		return partyDAO.findAll();
	}

	@Override
	public Party saveParty(Party party) {
		// TODO Auto-generated method stub
		return partyDAO.save(party);
	}

	@Override
	public Party getPartyById(Long id) {
		// TODO Auto-generated method stub
		return partyDAO.findById(id).get();
	}

	@Override
	public Party updateParty(Party party) {
		// TODO Auto-generated method stub
		return partyDAO.save(party);
	}

	@Override
	public void deleteParty(Long id) {
		// TODO Auto-generated method stub
		partyDAO.deleteById(id);
	}

}
