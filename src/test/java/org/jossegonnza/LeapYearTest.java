package org.jossegonnza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapYearTest {

    LeapYear leapYear = new LeapYear();

    @Test
    public void should_return_true_if_divisible_by_4() {

        Assertions.assertThat(4).isEqualTo("true");
    }

}