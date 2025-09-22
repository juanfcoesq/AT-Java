package org.example.ATJAVA.discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    PriceCalculator calculator = new PriceCalculator();

    @Test
    public void total_zero_for_no_prices() {

        assertThat(calculator.getTotal(), is(0.0));
    }
    @Test
    public void total_sum_of_prices() {

        calculator.addPrice(10.2);
        calculator.addPrice(15.5);

        assertThat(calculator.getTotal(), is(25.7));
    }
    @Test
    public void apply_discount_to_prices(){

        calculator.addPrice(100.0);
        calculator.addPrice(50.0);
        calculator.addPrice(50.0);

        calculator.setDiscount(25); // Apply 50% discount

        assertThat(calculator.getTotal(), is(150.0));
    }
}