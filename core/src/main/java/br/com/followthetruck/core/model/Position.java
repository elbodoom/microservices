package br.com.followthetruck.core.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by elbodoom on 21/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Position {
    private double lat;
    private double lng;

    public Position() {
    }

    private Position(Builder builder) {
        this.lat = builder.lat;
        this.lng = builder.lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private double lat;
        private double lng;

        public Builder lat(double lat) {
            this.lat = lat;
            return this;
        }

        public Builder lng(double lng) {
            this.lng = lng;
            return this;
        }

        public Builder lat(String lat) {
            this.lat = convert(lat);
            return this;
        }

        public Builder lng(String lng) {
            this.lng = convert(lng);
            return this;
        }

        private double convert(String value) {
            return Double.parseDouble(value);
        }

        public Position build() {
            return new Position(this);
        }
    }

    public static Position from(String coordinates) {
        String[] latNlng = coordinates.split(",");
        return Position.builder().lat(latNlng[0]).lng(latNlng[1]).build();
    }

    @Override
    public String toString() {
        return "Position{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
