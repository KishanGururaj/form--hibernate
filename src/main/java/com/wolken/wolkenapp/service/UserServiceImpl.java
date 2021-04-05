package com.wolken.wolkenapp.service;




import java.util.List;

import com.wolken.wolkenapp.dao.UserDAO;
import com.wolken.wolkenapp.dao.UserDAOImpl;
import com.wolken.wolkenapp.dto.UserDTO;

public class UserServiceImpl implements UserService {
	UserDAO userDAO=new UserDAOImpl();
	@Override
	public void validateAndSave(UserDTO userDTO) {
		// TODO Auto-generated method stub
		if(userDTO.getAge()>0) {
			if(userDTO.getUserName()!=null) {
				if(userDTO.getEmailId()!=null) {
					if(userDTO.getPassword()!=null) {
						userDAO.createUser(userDTO);
					}
				}
				
				//inquiryDAO.createFruit(fruitsDTO);
			}
		}
	}
	@Override
	public void validateAndUpdate(Integer id,String name1) {
		// TODO Auto-generated method stub
		if(id>0) {
			if(name1!=null) {
				userDAO.updateUser(id,name1);
			}
			
				
			
		}
		
	}
	@Override
	public void validateAndDelete(Integer id) {
		// TODO Auto-generated method stub
		if(id>0) {
			
			userDAO.deleteUser(id);
			}
		}
	@Override
	public List<UserDTO> getAll() {
		// TODO Auto-generated method stub
		return userDAO.getAll();
	}
		
	}


