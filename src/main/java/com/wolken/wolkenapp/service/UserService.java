package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.UserDTO;

public interface UserService {
	public void validateAndSave(UserDTO userDTO);
	public void validateAndUpdate(Integer  id,String name1);
	public void validateAndDelete(Integer id);
	public List<UserDTO> getAll();

}
