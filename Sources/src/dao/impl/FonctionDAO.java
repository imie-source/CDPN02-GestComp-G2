package dao.impl;

import dao.factory.FactoryDAO;
import dao.interfaces.IFonctionDAO;
import dto.FonctionDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FonctionDAO implements IFonctionDAO {

    private Connection connection = null;

    public FonctionDAO(FactoryDAO instance) {
        connection = instance.getConn();
    }

    @Override
    public int updateFonction(FonctionDTO fonction) {
        String nomFonction = fonction.getNomFonction();
        String query = "UPDATE fonction SET nom_fonction = ?";
        int result = 0;

		PreparedStatement fonctionPS = null;
        try {
            fonctionPS = this.connection.prepareStatement(query);
            fonctionPS.setString(1, nomFonction);
            result = fonctionPS.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }

    @Override
    public int insertFonction(FonctionDTO fonction) {
        String nomFonction = fonction.getNomFonction();
        String query = "INSERT INTO fonction(nom_fonction) VALUES(?)";
        int result = 0;

		PreparedStatement fonctionPS = null;
        try {
            fonctionPS = this.connection.prepareStatement(query);
            fonctionPS.setString(1, nomFonction);
            result = fonctionPS.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteFonction(FonctionDTO fonction) {
        int idFonction = fonction.getIdFonction();
        String query = "DELETE FROM fonction WHERE id_User = ?";
        int result = 0;

		PreparedStatement fonctionPS = null;
        try {
            fonctionPS = this.connection.prepareStatement(query);
            fonctionPS.setInt(1, idFonction);
            result = fonctionPS.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public FonctionDTO getFonctionById(FonctionDTO fonction) {
        int idFonction = fonction.getIdFonction();
        String query = "SELECT id_fonction FROM fonction WHERE id_fonction = ? LIMIT 0,1";
        FonctionDTO fonctionDTO = new FonctionDTO();

		PreparedStatement fonctionPS = null;
        try {
            fonctionPS = this.connection.prepareStatement(query);
            fonctionPS.setInt(1, idFonction);
            ResultSet resultSet = fonctionPS.executeQuery(query);
            fonctionDTO.setIdFonction(resultSet.getInt("id_fonction"));
            fonctionDTO.setNomFonction(resultSet.getString("nom_fonction"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return fonctionDTO;
    }

    @Override
    public List<FonctionDTO> getAllFonction() {
        String query = "SELECT id_fonction, nom_fonction FROM fonction";
        List<FonctionDTO> listFonctions = new ArrayList<FonctionDTO>();
        FonctionDTO fonctionDTO = new FonctionDTO();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                fonctionDTO.setIdFonction(resultSet.getInt("id_fonction"));
                fonctionDTO.setNomFonction(resultSet.getString("nom_fonction"));
                listFonctions.add(fonctionDTO);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listFonctions;
    }
}
