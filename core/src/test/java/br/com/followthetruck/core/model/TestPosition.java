package br.com.followthetruck.core.model;

import org.junit.Test;

/**
 * Created by elbodoom on 27/05/17.
 */
public class TestPosition {
    @Test
    public void testFrom() {
        Position p = Position.from("-23.01,-40.01");
        System.out.println(p);
    }
}
