package Classes;

import java.math.BigDecimal;

/**
 * Genre generated by hbm2java
 */
public class Genre implements java.io.Serializable {

    private BigDecimal idgenre;
    private String genre;

    public Genre() {
    }

    public Genre(String genre) {
        this.genre = genre;
    }

    public Genre(BigDecimal idgenre) {
        this.idgenre = idgenre;
    }

    public Genre(BigDecimal idgenre, String genre) {
        this.idgenre = idgenre;
        this.genre = genre;
    }

    public BigDecimal getIdgenre() {
        return this.idgenre;
    }

    public void setIdgenre(BigDecimal idgenre) {
        this.idgenre = idgenre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
