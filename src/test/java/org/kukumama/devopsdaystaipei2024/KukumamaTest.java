package org.kukumama.devopsdaystaipei2024;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class KukumamaTest {

    @Test
    void name() {
        Assertions.assertThat(new Kukumama().add(1, 1)).isEqualTo(2);
    }
}