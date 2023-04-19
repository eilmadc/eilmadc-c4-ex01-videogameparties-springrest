/**
 * 
 */
package com.springrestcrud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springrestcrud.h2.dto.VideoGame;

/**
 * @author elena-01
 *
 */
public interface VideoGameDAO extends JpaRepository<VideoGame, Long> {

}
