package Server;

import jakarta.persistence.*;

@Entity
public class Boek {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String title;

    public int getAantalExemplaren() {
        return aantalExemplaren;
    }

    public void setAantalExemplaren(int aantalExemplaren) {
        this.aantalExemplaren = aantalExemplaren;
    }

    public String getAfbeeldingURL() {
        return afbeeldingURL;
    }

    public void setAfbeeldingURL(String afbeeldingURL) {
        this.afbeeldingURL = afbeeldingURL;
    }

    @Column
    private String author;

    @Column
    private int aantalExemplaren;

    @Column
    private String afbeeldingURL;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
