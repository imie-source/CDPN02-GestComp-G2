package fr.imie.skills.service.interfaces;

import java.util.List;
import fr.imie.skills.dto.UserDTO;

public interface IUserService {
	List<UserDTO> getAllUsers();
	
	int createPromotion(UserDTO user);
	
	int deletePromotion(UserDTO user);
}
