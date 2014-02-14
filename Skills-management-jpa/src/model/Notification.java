package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notification database table.
 * 
 */
@Entity
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_notification")
	private Integer idNotification;

	@Temporal(TemporalType.DATE)
	@Column(name="date_notification")
	private Date dateNotification;

	@Column(name="libelle_notification")
	private String libelleNotification;

	public Notification() {
	}

	public Integer getIdNotification() {
		return this.idNotification;
	}

	public void setIdNotification(Integer idNotification) {
		this.idNotification = idNotification;
	}

	public Date getDateNotification() {
		return this.dateNotification;
	}

	public void setDateNotification(Date dateNotification) {
		this.dateNotification = dateNotification;
	}

	public String getLibelleNotification() {
		return this.libelleNotification;
	}

	public void setLibelleNotification(String libelleNotification) {
		this.libelleNotification = libelleNotification;
	}

}