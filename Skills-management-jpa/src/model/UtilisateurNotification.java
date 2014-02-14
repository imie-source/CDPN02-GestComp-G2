package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utilisateur_notification database table.
 * 
 */
@Entity
@Table(name="utilisateur_notification")
public class UtilisateurNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_notification")
	private Integer idNotification;

	@Column(name="id_notification_pere")
	private Integer idNotificationPere;

	@Column(name="id_utilisateur")
	private String idUtilisateur;

	public UtilisateurNotification() {
	}

	public Integer getIdNotification() {
		return this.idNotification;
	}

	public void setIdNotification(Integer idNotification) {
		this.idNotification = idNotification;
	}

	public Integer getIdNotificationPere() {
		return this.idNotificationPere;
	}

	public void setIdNotificationPere(Integer idNotificationPere) {
		this.idNotificationPere = idNotificationPere;
	}

	public String getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

}