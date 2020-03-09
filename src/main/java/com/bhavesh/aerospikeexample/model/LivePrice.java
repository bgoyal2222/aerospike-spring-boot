package com.bhavesh.aerospikeexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

@Service
public class LivePrice {
    @Id
    private String id;
    private Float price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
