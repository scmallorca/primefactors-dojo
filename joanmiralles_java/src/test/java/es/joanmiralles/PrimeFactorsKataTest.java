package es.joanmiralles;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsKataTest {

    @Test
    public void give_int_zero_then_return_one() {
        assertThat(PrimeFactorsKata.generate(0), is(emptyList()));
    }

    @Test
    public void give_int_one_then_return_empty() {
        assertThat(PrimeFactorsKata.generate(1), is(emptyList()));
    }

    @Test
    public void give_prime_number_then_return_the_same_number() {
        assertThat(PrimeFactorsKata.generate(2), is(singletonList(2)));
        assertThat(PrimeFactorsKata.generate(13), is(singletonList(13)));
    }

    @Test(timeout = 10000)
    public void give_max_int_then_return_max_int() {
        assertThat(PrimeFactorsKata.generate(Integer.MAX_VALUE), is(singletonList(2147483647)));
    }

    @Test
    public void give_two_factor_number_then_return_two() {
        assertThat(PrimeFactorsKata.generate(256), is(singletonList(2)));
    }

    @Test
    public void give_int_6_then_return_two_three() {
        assertThat(PrimeFactorsKata.generate(12), is(asList(2, 3)));
    }

}