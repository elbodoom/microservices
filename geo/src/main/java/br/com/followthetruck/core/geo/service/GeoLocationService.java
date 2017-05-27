package br.com.followthetruck.core.geo.service;

import br.com.followthetruck.core.model.Distance;
import br.com.followthetruck.core.model.Position;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by elbodoom on 21/05/17.
 */
@RestController
public class GeoLocationService {

    @RequestMapping(
            path = "/distance",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<Distance> calculateDistance(@RequestParam(name = "origin")Position a, @RequestParam(name = "destination")Position b) {
        return ResponseEntity.ok(new Distance(150L, "3 hrs and 15 minutes"));
    }
}
