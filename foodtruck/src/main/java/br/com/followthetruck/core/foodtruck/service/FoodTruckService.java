package br.com.followthetruck.core.foodtruck.service;

import br.com.followthetruck.core.model.FoodTruck;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elbodoom on 25/05/17.
 */
@RestController
public class FoodTruckService {
    @RequestMapping(
            path = "/foodtruck",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<List<FoodTruck>> listFoodTruck() {
        List<FoodTruck> foodTrucks = new ArrayList<>();
        foodTrucks.add(new FoodTruck("Food Truck 1", "-23.001,-40.23", true));
        foodTrucks.add(new FoodTruck("Food Truck 2", "-24.001,-41.23", false));
        foodTrucks.add(new FoodTruck("Food Truck 3", "-25.001,-42.23", false));
        foodTrucks.add(new FoodTruck("Food Truck 4", "-26.001,-43.23", true));

        return ResponseEntity.ok(foodTrucks);
    }

}
