package service.impl;

import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.IUserDAO;
import dto.UserDTO;
import service.interfaces.IUserService;

public class UserService implements IUserService {

	@Override
	public List<UserDTO> listerUsers() {
		new FactoryDAO();
		IUserDAO userService = FactoryDAO.getUserDAO();
		return null;
	}
	
}
