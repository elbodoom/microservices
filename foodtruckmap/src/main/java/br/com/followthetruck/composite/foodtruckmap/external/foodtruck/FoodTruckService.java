package br.com.followthetruck.composite.foodtruckmap.external.foodtruck;

import br.com.followthetruck.core.model.FoodTruck;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by elbodoom on 25/05/17.
 */
@FeignClient(value = "foodtruck-service")
public interface FoodTruckService {
    @RequestMapping(value = "foodtruck", method = RequestMethod.GET, produces = "application/json")
    List<FoodTruck> findFoodTrucks();
}
