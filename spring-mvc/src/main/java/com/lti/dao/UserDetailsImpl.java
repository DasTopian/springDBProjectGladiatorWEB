package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.entity.User;

@Component("userDetails")
public class UserDetailsImpl{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		entityManager.merge(user);
		
		
	}

	public List<User> fetchAllUsers() {
		// TODO Auto-generated method stub
		
		return (List<User>)entityManager.createQuery("select u from User as u").getResultList();
	}
	
	public User fetchUser(String email) {
		return (User)entityManager.createQuery("select u from User as u where u.email=:em").setParameter("em",email).getSingleResult();
	}
	

}
