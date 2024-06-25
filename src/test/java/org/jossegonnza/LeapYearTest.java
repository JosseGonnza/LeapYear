package org.jossegonnza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class LeapYearTest {
    @Test
    public void is_not_a_leap_year_if_it_is_not_divisible_by_4() {
        LeapYear leapYear = new LeapYear();
        Assertions.assertThat(leapYear.isLeapYear(1997)).isEqualTo(false);
    }

    @Test
    public void is_a_leap_year_if_it_is_divisible_by_4() {
        LeapYear leapYear = new LeapYear();
        Assertions.assertThat(leapYear.isLeapYear(1996)).isEqualTo(true);
    }

    @Test
    public void is_a_leap_year_if_it_is_divisible_by_400() {
        LeapYear leapYear = new LeapYear();
        Assertions.assertThat(leapYear.isLeapYear(1600)).isEqualTo(true);
    }

    @Test
    public void is_not_a_leap_year_if_it_is_divisible_by_100_but_yes_if_it_is_divisible_by_400() {
        LeapYear leapYear = new LeapYear();
        Assertions.assertThat(leapYear.isLeapYear(1800)).isEqualTo(false);
    }
}