package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_utilisateur")
	private Integer idUtilisateur;

	@Column(name="description_utilisateur")
	private String descriptionUtilisateur;

	@Column(name="disponible_utilisateur")
	private Boolean disponibleUtilisateur;

	@Column(name="email_utilisateur")
	private String emailUtilisateur;

	@Column(name="id_promotion")
	private Integer idPromotion;

	@Column(name="login_utilisateur")
	private String loginUtilisateur;

	@Column(name="mdp_utilisateur")
	private String mdpUtilisateur;

	@Column(name="nom_utilisateur")
	private String nomUtilisateur;

	@Column(name="prenom_utilisateur")
	private String prenomUtilisateur;

	@Column(name="tel_utilisateur")
	private String telUtilisateur;

	public Utilisateur() {
	}

	public Integer getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getDescriptionUtilisateur() {
		return this.descriptionUtilisateur;
	}

	public void setDescriptionUtilisateur(String descriptionUtilisateur) {
		this.descriptionUtilisateur = descriptionUtilisateur;
	}

	public Boolean getDisponibleUtilisateur() {
		return this.disponibleUtilisateur;
	}

	public void setDisponibleUtilisateur(Boolean disponibleUtilisateur) {
		this.disponibleUtilisateur = disponibleUtilisateur;
	}

	public String getEmailUtilisateur() {
		return this.emailUtilisateur;
	}

	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}

	public Integer getIdPromotion() {
		return this.idPromotion;
	}

	public void setIdPromotion(Integer idPromotion) {
		this.idPromotion = idPromotion;
	}

	public String getLoginUtilisateur() {
		return this.loginUtilisateur;
	}

	public void setLoginUtilisateur(String loginUtilisateur) {
		this.loginUtilisateur = loginUtilisateur;
	}

	public String getMdpUtilisateur() {
		return this.mdpUtilisateur;
	}

	public void setMdpUtilisateur(String mdpUtilisateur) {
		this.mdpUtilisateur = mdpUtilisateur;
	}

	public String getNomUtilisateur() {
		return this.nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return this.prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getTelUtilisateur() {
		return this.telUtilisateur;
	}

	public void setTelUtilisateur(String telUtilisateur) {
		this.telUtilisateur = telUtilisateur;
	}

}