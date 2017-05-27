package br.com.followthetruck.core.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by elbodoom on 25/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class FoodTruck {
    private String name;
    private String location;
    private boolean open;

    public FoodTruck() {
    }

    public FoodTruck(String name, String location, boolean open) {
        this.name = name;
        this.location = location;
        this.open = open;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isOpen() {
        return open;
    }
}
