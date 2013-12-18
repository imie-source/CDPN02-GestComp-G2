package dao.impl;

import dao.factory.FactoryDAO;
import dao.interfaces.IUserProfilDAO;
import dto.UserProfilDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserProfilDAO implements IUserProfilDAO {

    private Connection connection = null;

    public UserProfilDAO(FactoryDAO instance) {
        connection = (Connection) instance;
    }

    @Override
    public int deleteUserProfil(UserProfilDTO userProfil) {
        int idUtilisateur = userProfil.getIdUtilisateur();
        int idProfil = userProfil.getIdProfil();
        String query = "DELETE FROM utilisateur_profil WHERE id_utilisateur = '" + idUtilisateur + "', AND id_profil = '" + idProfil + "'";
        int result = 0;

        try {
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public UserProfilDTO getUserProfilById(UserProfilDTO userProfil) {
        int idUtilisateur = userProfil.getIdUtilisateur();
        int idProfil = userProfil.getIdProfil();
        String query = "SELECT id_utilisateur FROM utilisateur WHERE id_utilisateur = '" + idUtilisateur + "', AND id_profil = '" + idProfil + "' LIMIT 0,1";
        UserProfilDTO userProfilDTO = new UserProfilDTO();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            userProfilDTO.setIdUtilisateur(resultSet.getInt("id_utilisateur"));
            userProfilDTO.setIdProfil(resultSet.getInt("id_profil"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return userProfilDTO;
    }

    @Override
    public List<UserProfilDTO> getAllUserProfil() {
        String query = "SELECT id_utilisateur, id_profil FROM utilisateur_profil";
        List<UserProfilDTO> listUsersProfils = new ArrayList<UserProfilDTO>();
        UserProfilDTO userProfilDTO = new UserProfilDTO();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
            	userProfilDTO.setIdUtilisateur(resultSet.getInt("id_utilisateur"));
                userProfilDTO.setIdProfil(resultSet.getInt("id_profil"));
                listUsersProfils.add(userProfilDTO);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listUsersProfils;
    }
}
