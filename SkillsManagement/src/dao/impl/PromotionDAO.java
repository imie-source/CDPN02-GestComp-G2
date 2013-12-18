package dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.IPromotionDAO;
import dto.PromotionDTO;

/* TABLE PROMOTION (id_promotion, libelle_promotion, annee_promotion)
 */
public class PromotionDAO implements IPromotionDAO{

	private Connection conn = null;
	
	public PromotionDAO(FactoryDAO instance)
	{
		this.conn = instance.getConn();
	}
	
	@Override
	public int updatePromotion(PromotionDTO promo) {
		// TODO Auto-generated method stub
		String libelle = promo.getLibelle_promotion();
		Date annee = (Date) promo.getAnnee_promotion();
		String query = "UPDATE promotion SET libelle_promotion = '"+libelle+"', annee_promotion = '"+annee+"'";
		int i = 0;
		try
		{
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int insertPromotion(PromotionDTO promo) {
		// TODO Auto-generated method stub
		String libelle = promo.getLibelle_promotion();
		Date annee = (Date) promo.getAnnee_promotion();
		String query = "INSERT INTO promotion(libelle_promotion, date_annee) VALUES('"+libelle+"', '"+annee+"')";
		int i = 0;
		try
		{
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deletePromotion(PromotionDTO promo) {
		// TODO Auto-generated method stub
		int id_promotion = promo.getId_promotion();
		String query = "DELETE FROM promotion WHERE id_promotion = '"+id_promotion+"'";
		int i = 0;
		try 
		{
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public PromotionDTO getPromotionById(PromotionDTO promo) {
		// TODO Auto-generated method stub
		int id_promotion = promo.getId_promotion();
		String query = "SELECT id_promotion, libelle_promotion, date_annee FROM promotion WHERE id_promotion = '"+id_promotion+"' LIMIT 0,1";
		PromotionDTO newPromo = new PromotionDTO();
		try
		{
			
			Statement stt = this.conn.createStatement();
			ResultSet rs = stt.executeQuery(query);
			newPromo.setId_promotion(rs.getInt("id_promotion"));
			newPromo.setLibelle_promotion(rs.getString("libelle_promotion"));
			newPromo.setAnnee_promotion(rs.getDate("date_annee"));
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newPromo;
	}

	@Override
	public List<PromotionDTO> getPromotionByAnnee(PromotionDTO promo) {
		// TODO Auto-generated method stub
		Date annee = (Date) promo.getAnnee_promotion();
		String query = "SELECT id_promotion, libelle_promotion, date_annee FROM promotion WHERE date_annee = '"+annee+"'";
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listePromo;
	}

	@Override
	public List<PromotionDTO> getAllPromotion() {
		// TODO Auto-generated method stub
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listePromo;
	}
}
