package br.com.followthetruck.composite.foodtruckmap.external.geo;

import br.com.followthetruck.core.model.Distance;
import br.com.followthetruck.core.model.Position;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * Created by elbodoom on 26/05/17.
 */
@Service
@RefreshScope
public class GeoLocationProxy {

    private Long distance;
    private String time;

    @Value("${geo.fallback.distance}")
    public void setDistance(Long distance) {
        this.distance = distance;
    }

    @Value("${geo.fallback.time}")
    public void setTime(String time) {
        this.time = time;
    }

    public void setGeoLocationService(GeoLocationService geoLocationService) {
        this.geoLocationService = geoLocationService;
    }

    @Autowired
    private GeoLocationService geoLocationService;

    @HystrixCommand(fallbackMethod = "calculateDistanceByHeuristic")
    public Distance calculateDistance(String a, String b) {
        return geoLocationService.calculateDistance(a, b);
    }

    public Distance calculateDistanceByHeuristic(String a, String b) {
        return new Distance(distance, time);
    }
}
