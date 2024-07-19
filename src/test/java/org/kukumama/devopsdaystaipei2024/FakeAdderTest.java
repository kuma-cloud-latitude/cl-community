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
        Assertions.assertThat(result.Log).isTrue();
        Assertions.assertThat(result.Path).isEqualTo("/usr/logs");
    }

//    @Test
//    void test_d() {
//        Arg arg = new Arg();
//        var result = arg.parse("run-server -l -d /home/abc");
//        Assertions.assertThat(result.Log).isTrue();
//        Assertions.assertThat(result.Path).isEqualTo("/home/abc");
//    }
//
    @Test
    void test_p() {
        Arg arg = new Arg();
        var result = arg.parse("run-server -p 1234");
        Assertions.assertThat(result.Port).isEqualTo("1234");
    }
}