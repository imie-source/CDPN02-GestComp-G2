package fr.imie.skills.dto;

import java.sql.Date;

public class NotificationDTO {

    private int idNotification;
    private Date dateNotification;
    private String libelleNotification;

    public Date getDateNotification() {
        return dateNotification;
    }

    public int getIdNotification() {
        return idNotification;
    }

    public String getLibelleNotification() {
        return libelleNotification;
    }

    public void setDateNotification(Date dateNotification) {
        this.dateNotification = dateNotification;
    }

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public void setLibelleNotification(String libelleNotification) {
        this.libelleNotification = libelleNotification;
    }
}
