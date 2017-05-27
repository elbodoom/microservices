package br.com.followthetruck.core.converter;

import br.com.followthetruck.core.model.Position;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by elbodoom on 21/05/17.
 */
@Component
public class PositionConverter implements Converter<String, Position> {

    public Position convert(String s) {
        return Position.builder().lat(99).lng(100).build();
    }

}
