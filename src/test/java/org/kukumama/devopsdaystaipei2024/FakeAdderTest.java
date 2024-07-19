package org.kukumama.devopsdaystaipei2024;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FakeAdderTest {

    @Test
    void name() {
        Assertions.assertThat(new FakeAdder().add(1, 1)).isEqualTo(2);
    }

    @Test
    @Disabled
    void logExist(){
        String[] args = new Command().parse("run-server -l");
        Assertions.assertThat(args.length).isEqualTo(1);
    }
}