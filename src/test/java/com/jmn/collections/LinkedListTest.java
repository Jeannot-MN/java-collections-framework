package com.jmn.collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void testAdding() {
        List<String> list = new LinkedList<>();
        list.add("Brandon");
        list.add("Ruan");
        list.add("Divhani");

        Assertions.assertThat(list.size()).isEqualTo(3);
    }
}
