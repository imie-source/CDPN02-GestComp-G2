package fr.imie.skills.service.impl;

import java.util.List;

import fr.imie.skills.dao.interfaces.factory.AbstractDAOFactory;
import fr.imie.skills.dto.UserDTO;
import fr.imie.skills.service.interfaces.IUserService;

public class UserService implements IUserService {
	@Override
	public List<UserDTO> getAllUsers() {
		List<UserDTO> usersList = AbstractDAOFactory.getDAOFactory().getUserDAO().getAllUser();
		return usersList;
	}

	@Override
	public int createPromotion(UserDTO user) {
		int i =  AbstractDAOFactory.getDAOFactory().getUserDAO().insertUser(user);
		return i;
	}

	@Override
	public int deletePromotion(UserDTO user) {
		int i =  AbstractDAOFactory.getDAOFactory().getUserDAO().insertUser(user);
		return i;
	}
	
}
