package com.trip.tripwiki.service;

import com.trip.tripwiki.domain.User;

public interface UserService {
	public User  isId(String id);
	public int isId(String id,String password);
	public int add(User user);
	public String isNickname(String nickname);
	public String chkNickname(String nickname);
}
