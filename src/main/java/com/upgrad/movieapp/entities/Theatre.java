package com.upgrad.movieapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Theatre {
    
    @Id
    @GeneratedValue
    private int theatreId;

    @Column(length = 20, nullable = false, unique = true)
    private String theatreName;

    @Column(length = 10, nullable = false)
    private int cityId;
    
    @Column(nullable = false)
    private float ticketPrice = 150.00f;

    public int getTheatreId() {
        return theatreId;
    }
    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }
    public String getTheatreName() {
        return theatreName;
    }
    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }
    public int getCityId() {
        return cityId;
    }
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
    public float getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    @Override
    public String toString() {
        return "Theatre [cityId=" + cityId + ", theatreId=" + theatreId + ", theatreName=" + theatreName
                + ", ticketPrice=" + ticketPrice + "]";
    }

    
}
