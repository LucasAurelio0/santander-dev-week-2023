package me.dio.santander_dev_week_2023.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_feature")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String description;

    public Long getId() {
        return id;
    }

    public Feature setId(Long id) {
        this.id = id;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public Feature setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Feature setDescription(String description) {
        this.description = description;
        return this;
    }

}
