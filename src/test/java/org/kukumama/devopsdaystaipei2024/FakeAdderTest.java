package org.kukumama.devopsdaystaipei2024;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FakeAdderTest {

    @Test
    void name() {
        Assertions.assertThat(new FakeAdder().add(1, 1)).isEqualTo(2);
    }

    @Test
    void test_l() {
        Arg arg = new Arg();
        var result = arg.parse("run-server -l");
        Assertions.assertThat(result).isTrue();
    }
}