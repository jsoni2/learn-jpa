/**
 * 
 */
package com.practice.learning.jpa.jpain10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author janak.soni
 *
 */

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String role;
	
	protected User() {
		
	}
	
	/**
	 * @param name
	 * @param role
	 */
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	
}
