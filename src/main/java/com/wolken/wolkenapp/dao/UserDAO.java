package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.dto.UserDTO;

public interface UserDAO {
	
	public void createUser(UserDTO userDTO);
	public void updateUser(Integer  id,String name1);
	public void deleteUser(Integer id);
	public List<UserDTO> getAll();

}
