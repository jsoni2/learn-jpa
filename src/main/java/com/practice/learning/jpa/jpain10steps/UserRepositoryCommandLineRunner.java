/**
 * 
 */
package com.practice.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.learning.jpa.jpain10steps.entity.User;
import com.practice.learning.jpa.jpain10steps.service.UserRepository;


/**
 * @author janak.soni
 *
 */

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Jill", "Hill");
		
		userRepository.save(user);
		
		log.info("New User is created :"+user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		
		log.info("User is retrieved :"+userWithIdOne);
		
		List<User> users = userRepository.findAll();
		
		log.info("All Users :"+users);
	}
	
}
