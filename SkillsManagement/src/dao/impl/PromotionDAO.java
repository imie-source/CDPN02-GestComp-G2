package dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.IPromotionDAO;
import dto.PromotionDTO;

public class PromotionDAO implements IPromotionDAO{

	private Connection conn = null;
	
	public PromotionDAO(FactoryDAO instance)
	{
		this.conn = instance.getConn();
	}
	
	@Override
	public int updatePromotion(PromotionDTO promo) {
		String libelle = promo.getLibelle_promotion();
		Date annee = (Date) promo.getAnnee_promotion();
		int idPromotion = promo.getId_promotion();
		String query = "UPDATE promotion SET libelle_promotion = ?, annee_promotion = ? WHERE id_promotion = ?";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setString(1, libelle);
			stt.setDate(2, annee);
			stt.setInt(3, idPromotion);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int insertPromotion(PromotionDTO promo)
	{
		String libelle = promo.getLibelle_promotion();
		Date annee = (Date) promo.getAnnee_promotion();
		String query = "INSERT INTO promotion(libelle_promotion, date_annee) VALUES(?, ?)";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setString(1, libelle);
			stt.setDate(2, annee);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deletePromotion(PromotionDTO promo) 
	{
		int id_promotion = promo.getId_promotion();
		String query = "DELETE FROM promotion WHERE id_promotion = ?";
		int i = 0;
		try 
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, id_promotion);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public PromotionDTO getPromotionById(PromotionDTO promo)
	{
		int id_promotion = promo.getId_promotion();
		String query = "SELECT id_promotion, libelle_promotion, date_annee FROM promotion WHERE id_promotion = ? LIMIT 0,1";
		PromotionDTO newPromo = new PromotionDTO();
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, id_promotion);
			ResultSet rs = stt.executeQuery(query);
			newPromo.setId_promotion(rs.getInt("id_promotion"));
			newPromo.setLibelle_promotion(rs.getString("libelle_promotion"));
			newPromo.setAnnee_promotion(rs.getDate("date_annee"));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return newPromo;
	}

	@Override
	public List<PromotionDTO> getPromotionByAnnee(PromotionDTO promo) 
	{
		Date annee = (Date) promo.getAnnee_promotion();
		String query = "SELECT id_promotion, libelle_promotion, date_annee FROM promotion WHERE date_annee = ?";
		List<PromotionDTO> listePromo = new ArrayList<PromotionDTO>();
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setDate(1, annee);
			ResultSet rs = stt.executeQuery(query);
			while(rs.next())
			{
				PromotionDTO newPromo = new PromotionDTO();
				newPromo.setId_promotion(rs.getInt("id_promotion"));
				newPromo.setLibelle_promotion(rs.getString("libelle_promotion"));
				newPromo.setAnnee_promotion(rs.getDate("date_annee"));
				listePromo.add(newPromo);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listePromo;
	}

	@Override
	public List<PromotionDTO> getAllPromotion() 
	{
		String query = "SELECT id_promotion, libelle_promotion, date_annee FROM promotion";
		List<PromotionDTO> listePromo = new ArrayList<PromotionDTO>();
		try
		{
			Statement stt = this.conn.createStatement();
			ResultSet rs = stt.executeQuery(query);
			while(rs.next())
			{
				PromotionDTO newPromo = new PromotionDTO();
				newPromo.setId_promotion(rs.getInt("id_promotion"));
				newPromo.setLibelle_promotion(rs.getString("libelle_promotion"));
				newPromo.setAnnee_promotion(rs.getDate("date_annee"));
				listePromo.add(newPromo);
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listePromo;
	}
}
