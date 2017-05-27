package br.com.followthetruck.composite.foodtruckmap.model;

import br.com.followthetruck.core.model.FoodTruck;
import br.com.followthetruck.core.model.Distance;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by elbodoom on 25/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class MappedFoodTruck {
    private Distance distance;

    @JsonProperty("foodtruck")
    private FoodTruck foodTruck;

    public MappedFoodTruck(Distance distance, FoodTruck foodTruck) {
        this.distance = distance;
        this.foodTruck = foodTruck;
    }

    public Distance getDistance() {
        return distance;
    }

    public FoodTruck getFoodTruck() {
        return foodTruck;
    }
}
