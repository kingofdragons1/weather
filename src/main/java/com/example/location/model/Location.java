package com.example.location.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
public class Location {
    @Id
    @GeneratedValue
    private int id;

    private String city;
    private String country;

    public Location(String city, String country) {
        this.city = city;
        this.country = country;
    }
    public int getId() {
        return id;
    }
}