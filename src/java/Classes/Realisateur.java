package Classes;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Realisateur generated by hbm2java
 */
public class Realisateur implements java.io.Serializable {

    private BigDecimal idrealisateur;
    private String nom;
    private Date anniversaire;
    private String lieu;
    private String photo;
    private String bio;
    private Set films = new HashSet(0);

    public Realisateur() {
    }

    public Realisateur(String nom) {
        this.nom = nom;
    }

    public Realisateur(BigDecimal idrealisateur) {
        this.idrealisateur = idrealisateur;
    }

    public Realisateur(BigDecimal idrealisateur, String nom, Date anniversaire, String lieu, String photo, String bio, Set films) {
        this.idrealisateur = idrealisateur;
        this.nom = nom;
        this.anniversaire = anniversaire;
        this.lieu = lieu;
        this.photo = photo;
        this.bio = bio;
        this.films = films;
    }

    public BigDecimal getIdrealisateur() {
        return this.idrealisateur;
    }

    public void setIdrealisateur(BigDecimal idrealisateur) {
        this.idrealisateur = idrealisateur;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getAnniversaire() {
        return this.anniversaire;
    }

    public void setAnniversaire(Date anniversaire) {
        this.anniversaire = anniversaire;
    }

    public String getLieu() {
        return this.lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Set getFilms() {
        return this.films;
    }

    public void setFilms(Set films) {
        this.films = films;
    }

}
