package br.com.followthetruck.core.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by elbodoom on 21/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Distance {
    @JsonProperty("distance")
    private Long distance;

    @JsonProperty("time")
    private String time;

    public Distance(Long distance, String time) {
        this.distance = distance;
        this.time = time;
    }

    public Long getDistance() {
        return distance;
    }

    public String getTime() {
        return time;
    }
}
