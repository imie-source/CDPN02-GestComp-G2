package dao.interfaces;

import dto.UserProfilDTO;

import java.util.List;

public interface IUserProfilDAO {
    public int deleteUserProfil(UserProfilDTO userProfil);

    public UserProfilDTO getUserProfilById(UserProfilDTO userProfil);

    public List<UserProfilDTO> getAllUserProfil();
}
