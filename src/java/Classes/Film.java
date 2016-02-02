package Classes;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Film generated by hbm2java
 */
public class Film  implements java.io.Serializable {


     private BigDecimal idfilm;
     private Realisateur realisateur;
     private String titre;
     private BigDecimal annee;
     private String langue;
     private BigDecimal duree;
     private String resume;
     private String poster;
     private BigDecimal qtestock;
     private BigDecimal qtestockmax;
     private Set annonces = new HashSet(0);
     private Set scenaristes = new HashSet(0);
     private Set acteurfilms = new HashSet(0);
     private Set locations = new HashSet(0);
     private Set payses = new HashSet(0);

    public Film() {
    }

	
    public Film(BigDecimal idfilm) {
        this.idfilm = idfilm;
    }

    public Film(BigDecimal idfilm, String titre, String poster) {
        this.idfilm = idfilm;
        this.titre = titre;
        this.poster = poster;
    }
    
    public Film(BigDecimal idfilm, Realisateur realisateur, String titre, BigDecimal annee, String langue, BigDecimal duree, String resume, String poster, BigDecimal qtestock, BigDecimal qtestockmax, Set annonces, Set scenaristes, Set acteurfilms, Set locations, Set payses) {
       this.idfilm = idfilm;
       this.realisateur = realisateur;
       this.titre = titre;
       this.annee = annee;
       this.langue = langue;
       this.duree = duree;
       this.resume = resume;
       this.poster = poster;
       this.qtestock = qtestock;
       this.qtestockmax = qtestockmax;
       this.annonces = annonces;
       this.scenaristes = scenaristes;
       this.acteurfilms = acteurfilms;
       this.locations = locations;
       this.payses = payses;
    }
   
    public BigDecimal getIdfilm() {
        return this.idfilm;
    }
    
    public void setIdfilm(BigDecimal idfilm) {
        this.idfilm = idfilm;
    }
    public Realisateur getRealisateur() {
        return this.realisateur;
    }
    
    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }
    public String getTitre() {
        return this.titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public BigDecimal getAnnee() {
        return this.annee;
    }
    
    public void setAnnee(BigDecimal annee) {
        this.annee = annee;
    }
    public String getLangue() {
        return this.langue;
    }
    
    public void setLangue(String langue) {
        this.langue = langue;
    }
    public BigDecimal getDuree() {
        return this.duree;
    }
    
    public void setDuree(BigDecimal duree) {
        this.duree = duree;
    }
    public String getResume() {
        return this.resume;
    }
    
    public void setResume(String resume) {
        this.resume = resume;
    }
    public String getPoster() {
        return this.poster;
    }
    
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public BigDecimal getQtestock() {
        return this.qtestock;
    }
    
    public void setQtestock(BigDecimal qtestock) {
        this.qtestock = qtestock;
    }
    public BigDecimal getQtestockmax() {
        return this.qtestockmax;
    }
    
    public void setQtestockmax(BigDecimal qtestockmax) {
        this.qtestockmax = qtestockmax;
    }
    public Set getAnnonces() {
        return this.annonces;
    }
    
    public void setAnnonces(Set annonces) {
        this.annonces = annonces;
    }
    public Set getScenaristes() {
        return this.scenaristes;
    }
    
    public void setScenaristes(Set scenaristes) {
        this.scenaristes = scenaristes;
    }
    public Set getActeurfilms() {
        return this.acteurfilms;
    }
    
    public void setActeurfilms(Set acteurfilms) {
        this.acteurfilms = acteurfilms;
    }
    public Set getLocations() {
        return this.locations;
    }
    
    public void setLocations(Set locations) {
        this.locations = locations;
    }
    public Set getPayses() {
        return this.payses;
    }
    
    public void setPayses(Set payses) {
        this.payses = payses;
    }




}

