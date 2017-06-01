package br.com.followthetruck.composite.foodtruckmap.external.geo;

import br.com.followthetruck.core.model.Distance;
import br.com.followthetruck.core.model.Position;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by elbodoom on 25/05/17.
 */
@FeignClient(value = "geo-service")
public interface GeoLocationService {
    @RequestMapping(
            path = "/distance",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    Distance calculateDistance(@RequestParam(name = "origin")String a, @RequestParam(name = "destination")String b);
}
