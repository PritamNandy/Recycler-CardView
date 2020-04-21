package com.pritam.volleygetnpost;

public class Doctor {
    private int id;
    private String name, hospital;
    private double rating;
    private double visit;
    private int image;

    public Doctor(int id, String name, String hospital, double rating, double visit, int image) {
        this.id = id;
        this.name = name;
        this.hospital = hospital;
        this.rating = rating;
        this.visit = visit;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHospital() {
        return hospital;
    }

    public double getRating() {
        return rating;
    }

    public double getVisit() {
        return visit;
    }

    public int getImage() {
        return image;
    }
}
