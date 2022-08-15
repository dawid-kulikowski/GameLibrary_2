package pl.dknt.GameLibrary;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Platform platform;
    @Enumerated(EnumType.STRING)
    private Language gameLanguage;
    @Enumerated(EnumType.STRING)
    private Language coverLanguage;
    private double cheapestPrice;

    public Game() {
    }

    public Game(String title, Platform platform, Language gameLanguage, Language coverLanguage, double cheapestPrice) {
        this.title = title;
        this.platform = platform;
        this.gameLanguage = gameLanguage;
        this.coverLanguage = coverLanguage;
        this.cheapestPrice = cheapestPrice;
    }

    public Game(Long id, String title, Platform platform, Language gameLanguage, Language coverLanguage, double cheapestPrice) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.gameLanguage = gameLanguage;
        this.coverLanguage = coverLanguage;
        this.cheapestPrice = cheapestPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Language getGameLanguage() {
        return gameLanguage;
    }

    public void setGameLanguage(Language gameLanguage) {
        this.gameLanguage = gameLanguage;
    }

    public Language getCoverLanguage() {
        return coverLanguage;
    }

    public void setCoverLanguage(Language coverLanguage) {
        this.coverLanguage = coverLanguage;
    }

    public double getCheapestPrice() {
        return cheapestPrice;
    }

    public void setCheapestPrice(double cheapestPrice) {
        this.cheapestPrice = cheapestPrice;
    }
}
