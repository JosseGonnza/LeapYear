package org.jossegonnza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapYearTest {

    LeapYear leapYear = new LeapYear();

    @Test
    public void should_return_true_if_divisible_by_400() {

        Assertions.assertThat(leapYear.isLeapYear(400)).isEqualTo(true);
        Assertions.assertThat(leapYear.isLeapYear(800)).isEqualTo(true);
        Assertions.assertThat(leapYear.isLeapYear(1200)).isEqualTo(true);
    }

    @Test
    public void should_return_false_if_divisible_by_100_but_not_by_400() {

        Assertions.assertThat(leapYear.isLeapYear(100)).isEqualTo(false);
        Assertions.assertThat(leapYear.isLeapYear(600)).isEqualTo(false);
        Assertions.assertThat(leapYear.isLeapYear(1800)).isEqualTo(false);
    }

    @Test
    public void should_return_true_if_divisible_by_4() {

        Assertions.assertThat(leapYear.isLeapYear(4)).isEqualTo(true);
        Assertions.assertThat(leapYear.isLeapYear(1600)).isEqualTo(true);
        Assertions.assertThat(leapYear.isLeapYear(1996)).isEqualTo(true);
    }

    @Test
    public void should_return_false_if_not_divisible_by_4() {

        Assertions.assertThat(leapYear.isLeapYear(1)).isEqualTo(false);
        Assertions.assertThat(leapYear.isLeapYear(2)).isEqualTo(false);
        Assertions.assertThat(leapYear.isLeapYear(5)).isEqualTo(false);
    }
}