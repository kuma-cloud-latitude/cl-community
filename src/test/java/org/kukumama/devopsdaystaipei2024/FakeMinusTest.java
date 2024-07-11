package org.kukumama.devopsdaystaipei2024;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FakeMinusTest {

    @Test
    void name() {
        Assertions.assertThat(new FakeMinus().minus(100, 1)).isEqualTo(99);
    }
}