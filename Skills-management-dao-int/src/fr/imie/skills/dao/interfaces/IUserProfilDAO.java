package fr.imie.skills.dao.interfaces;

import fr.imie.skills.dto.UserProfilDTO;

import java.util.List;

public interface IUserProfilDAO {
    public int deleteUserProfil(UserProfilDTO userProfil);

    public UserProfilDTO getUserProfilById(UserProfilDTO userProfil);

    public List<UserProfilDTO> getAllUserProfil();
}
