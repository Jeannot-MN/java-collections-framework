package com.jmn.collections;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DummyTest {

    private static final Logger LOG = LoggerFactory.getLogger(DummyTest.class);

    @Test
    @DisplayName("Dummy Junit5 test")
    void shouldTest() {
        Assertions.assertThat(2).isEqualTo(2);
    }
}
