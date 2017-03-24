package com.qa.cinema.util.user;

import java.util.Collection;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.qa.cinema.persistence.User;

public class PersistUser implements Answer<Void> {

private Collection<User> users;
	
	public PersistUser(Collection<User> users) {
		this.users = users;
	}
	
	@Override
	public Void answer(InvocationOnMock invocation) throws Throwable {
		User userToPersist = (User) invocation.getArguments()[0];
		users.add(userToPersist);
		return null;
	}
	
}
