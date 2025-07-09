package com.makers.makersbnb_coach_support_code.model;

import jakarta.persistence.*;

@Entity
@Table(name="planets")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String description;
    private Integer circumference;
    private String name;
    private Long id;

    public Planet (String description, Integer circumference, String name) {
        this.description = description;
        this.circumference = circumference;
        this.name = name;
    }

    public Integer getCircumference() {
        return this.circumference;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCircumference(Integer circumference) {
        this.circumference = circumference;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
