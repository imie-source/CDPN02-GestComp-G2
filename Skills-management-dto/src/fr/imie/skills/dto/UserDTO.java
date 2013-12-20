package fr.imie.skills.dto;

public class UserDTO {

    private int idUtilisateur;
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String loginUtilisateur;
    private String mdpUtilisateur;
    private String emailUtilisateur;
    private String telUtilisateur;
    private String descriptionUtilisateur;
    private boolean disponibleUtilisateur;

    public String getDescriptionUtilisateur() {
        return descriptionUtilisateur;
    }

    public String getEmailUtilisateur() {
        return emailUtilisateur;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public String getLoginUtilisateur() {
        return loginUtilisateur;
    }

    public String getMdpUtilisateur() {
        return mdpUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public String getTelUtilisateur() {
        return telUtilisateur;
    }

    public boolean isDisponibleUtilisateur() {
        return disponibleUtilisateur;
    }

    public void setDescriptionUtilisateur(String descriptionUtilisateur) {
        this.descriptionUtilisateur = descriptionUtilisateur;
    }

    public void setDisponibleUtilisateur(boolean disponibleUtilisateur) {
        this.disponibleUtilisateur = disponibleUtilisateur;
    }

    public void setEmailUtilisateur(String emailUtilisateur) {
        this.emailUtilisateur = emailUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public void setLoginUtilisateur(String loginUtilisateur) {
        this.loginUtilisateur = loginUtilisateur;
    }

    public void setMdpUtilisateur(String mdpUtilisateur) {
        this.mdpUtilisateur = mdpUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public void setTelUtilisateur(String telUtilisateur) {
        this.telUtilisateur = telUtilisateur;
    }
}
