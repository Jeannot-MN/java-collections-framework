package com.jmn.collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DummyTest {

    @Test
    @DisplayName("Dummy Junit5 test")
    void shouldTest() {
        Assertions.assertThat(2).isEqualTo(2);
    }
}
