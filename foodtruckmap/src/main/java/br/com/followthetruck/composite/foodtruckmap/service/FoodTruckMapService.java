package br.com.followthetruck.composite.foodtruckmap.service;

import br.com.followthetruck.composite.foodtruckmap.external.foodtruck.FoodTruckService;
import br.com.followthetruck.composite.foodtruckmap.external.geo.GeoLocationProxy;
import br.com.followthetruck.composite.foodtruckmap.model.MappedFoodTruck;
import br.com.followthetruck.core.model.Distance;
import br.com.followthetruck.core.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
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
public class FoodTruckMapService {
    @Autowired
    private FoodTruckService foodTruckService;

    @Autowired
    private GeoLocationProxy geoLocationService;

    @RequestMapping(
            path = "/map",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<List<MappedFoodTruck>> map() {
        List<FoodTruck> foodTrucks = foodTruckService.findFoodTrucks();

        List<MappedFoodTruck> mappedFoodTrucks = new ArrayList<>();

        for (FoodTruck foodTruck : foodTrucks) {
            Distance distance = geoLocationService.
                    calculateDistance(
                            "-23.000,-46.0000",
                            foodTruck.getLocation());

            mappedFoodTrucks.add(new MappedFoodTruck(distance, foodTruck));
        }

        return ResponseEntity.ok(mappedFoodTrucks);
    }
}
