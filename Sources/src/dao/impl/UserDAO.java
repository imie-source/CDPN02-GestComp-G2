package dao.impl;

import dao.factory.FactoryDAO;
import dao.interfaces.IUserDAO;
import dto.UserDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {

    private Connection connection = null;

    public UserDAO(FactoryDAO instance) {
        connection = instance.getConn();
    }

    @Override
    public int updateUser(UserDTO user) {
        String nomUtilisateur = user.getNomUtilisateur();
        String prenomUtilisateur = user.getPrenomUtilisateur();
        String loginUtilisateur = user.getLoginUtilisateur();
        String mdpUtilisateur = user.getMdpUtilisateur();
        String emailUtilisateur = user.getEmailUtilisateur();
        String telUtilisateur = user.getTelUtilisateur();
        String descriptionUtilisateur = user.getDescriptionUtilisateur();
        boolean disponibleUtilisateur = user.isDisponibleUtilisateur();
        String query = "UPDATE utilisateur SET nom_utilisateur = '" + nomUtilisateur + "', "
                + "prenom_utilisateur = '" + prenomUtilisateur + "', "
                + "login_utilisateur = '" + loginUtilisateur + "', "
                + "mdp_utilisateur = '" + mdpUtilisateur + "', "
                + "email_utilisateur = '" + emailUtilisateur + "', "
                + "tel_utilisateur = '" + telUtilisateur + "', "
                + "description_utilisateur = '" + descriptionUtilisateur + "', "
                + "disponible_utilisateur = '" + disponibleUtilisateur + "'";
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
    public int insertUser(UserDTO user) {
        String nomUtilisateur = user.getNomUtilisateur();
        String prenomUtilisateur = user.getPrenomUtilisateur();
        String loginUtilisateur = user.getLoginUtilisateur();
        String mdpUtilisateur = user.getMdpUtilisateur();
        String emailUtilisateur = user.getEmailUtilisateur();
        String telUtilisateur = user.getTelUtilisateur();
        String descriptionUtilisateur = user.getDescriptionUtilisateur();
        boolean disponibleUtilisateur = user.isDisponibleUtilisateur();
        String query = "INSERT INTO utilisateur(nom_utilisateur, prenom_utilisateur, "
                + "login_utilisateur, mdp_utilisateur, email_utilisateur, tel_utilisateur, "
                + "description_utilisateur, disponible_utilisateur) VALUES('"
                + nomUtilisateur + "', '" + prenomUtilisateur + "', '" + loginUtilisateur
                + "', '" + mdpUtilisateur + "', '" + emailUtilisateur + "', '"
                + telUtilisateur + "', '" + descriptionUtilisateur + "', '"
                + disponibleUtilisateur + "')";
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
    public int deleteUser(UserDTO user) {
        int idUtilisateur = user.getIdUtilisateur();
        String query = "DELETE FROM utilisateur WHERE id_utilisateur = '" + idUtilisateur + "'";
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
    public UserDTO getUserById(UserDTO user) {
        int idUtilisateur = user.getIdUtilisateur();
        String query = "SELECT id_utilisateur FROM utilisateur WHERE id_utilisateur = '" + idUtilisateur + "' LIMIT 0,1";
        UserDTO userDTO = new UserDTO();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            userDTO.setIdUtilisateur(resultSet.getInt("id_utilisateur"));
            userDTO.setNomUtilisateur(resultSet.getString("nom_utilisateur"));
            userDTO.setPrenomUtilisateur(resultSet.getString("prenom_utilisateur"));
            userDTO.setLoginUtilisateur(resultSet.getString("login_utilisateur"));
            userDTO.setMdpUtilisateur(resultSet.getString("mdp_utilisateur"));
            userDTO.setEmailUtilisateur(resultSet.getString("email_utilisateur"));
            userDTO.setTelUtilisateur(resultSet.getString("tel_utilisateur"));
            userDTO.setDescriptionUtilisateur(resultSet.getString("description_utilisateur"));
            userDTO.setDisponibleUtilisateur(resultSet.getBoolean("disponible_utilisateur"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return userDTO;
    }

    @Override
    public List<UserDTO> getAllUser() {
        String query = "SELECT id_utilisateur, nom_utilisateur, prenom_utilisateur, "
                + "login_utilisateur, login_utilisateur, mdp_utilisateur, email_utilisateur, "
                + "tel_utilisateur, description_utilisateur, disponible_utilisateur FROM utilisateur";
        List<UserDTO> listUsers = new ArrayList<UserDTO>();
        UserDTO userDTO = new UserDTO();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                userDTO.setIdUtilisateur(resultSet.getInt("id_utilisateur"));
                userDTO.setNomUtilisateur(resultSet.getString("nom_utilisateur"));
                userDTO.setPrenomUtilisateur(resultSet.getString("prenom_utilisateur"));
                userDTO.setLoginUtilisateur(resultSet.getString("login_utilisateur"));
                userDTO.setMdpUtilisateur(resultSet.getString("mdp_utilisateur"));
                userDTO.setEmailUtilisateur(resultSet.getString("email_utilisateur"));
                userDTO.setTelUtilisateur(resultSet.getString("tel_utilisateur"));
                userDTO.setDescriptionUtilisateur(resultSet.getString("description_utilisateur"));
                userDTO.setDisponibleUtilisateur(resultSet.getBoolean("disponible_utilisateur"));
                listUsers.add(userDTO);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listUsers;
    }
}
