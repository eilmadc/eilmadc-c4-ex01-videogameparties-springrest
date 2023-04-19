/**
 * 
 */
package com.springrestcrud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestcrud.h2.dto.Party;

/**
 * @author elena-01
 *
 */
public interface PartyDAO extends JpaRepository<Party, Long> {

}
