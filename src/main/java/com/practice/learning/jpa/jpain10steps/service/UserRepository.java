/**
 * 
 */
package com.practice.learning.jpa.jpain10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.learning.jpa.jpain10steps.entity.User;

/**
 * @author janak.soni
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
