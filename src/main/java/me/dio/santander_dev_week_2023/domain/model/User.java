package me.dio.santander_dev_week_2023.domain.model;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade=CascadeType.ALL)
    private Account account;

    @OneToOne(cascade=CascadeType.ALL)
    private Card card;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private ArrayList<Feature> features;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private ArrayList<News> news;

    private String email;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Account getAccount() {
        return account;
    }

    public User setAccount(Account account) {
        this.account = account;
        return this;
    }

    public Card getCard() {
        return card;
    }

    public User setCard(Card card) {
        this.card = card;
        return this;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public User setFeatures(ArrayList<Feature> features) {
        this.features = features;
        return this;
    }

    public ArrayList<News> getNews() {
        return news;
    }

    public User setNews(ArrayList<News> news) {
        this.news = news;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

}
