package com.makers.makersbnb_coach_support_code.model;

public class Planet {
    private String description;
    private Number circumference;

    public Planet (String description, Number circumference) {
        this.description = description;
        this.circumference = circumference;
    }

    public Number getCircumference() {
        return this.circumference;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCircumference(Number circumference) {
        this.circumference = circumference;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
