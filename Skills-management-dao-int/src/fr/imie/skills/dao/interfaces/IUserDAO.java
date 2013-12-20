package fr.imie.skills.dao.interfaces;

import fr.imie.skills.dto.UserDTO;

import java.util.List;

public interface IUserDAO {

    public int updateUser(UserDTO user);

    public int insertUser(UserDTO user);

    public int deleteUser(UserDTO user);

    public UserDTO getUserById(UserDTO user);

    public List<UserDTO> getAllUser();
}
