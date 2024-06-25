package org.jossegonnza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class LeapYearTest {
    @Test
    public void is_not_a_leap_year_if_it_is_not_divisible_by_4() {
        LeapYear leapYear = new LeapYear();
        Assertions.assertThat(leapYear.isLeapYear(1997)).isEqualTo(false);
    }
}