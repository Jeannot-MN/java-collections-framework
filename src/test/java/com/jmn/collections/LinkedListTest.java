package com.jmn.collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    @DisplayName("Is the list empty?")
    public void testIsEmpty() {
        List<String> list = new LinkedList<>();
        Assertions.assertThat(list.isEmpty()).isEqualTo(true);
    }

    @Test
    @DisplayName("Is adding to the list working?")
    public void testAdding() {
        List<String> list = new LinkedList<>();
        list.add("Brandon");
        list.add("Ruan");
        list.add("Divhani");

        Assertions.assertThat(list.size()).isEqualTo(3);
        Assertions.assertThat(list.isEmpty()).isEqualTo(false);
    }

    @Test
    public void testingRemove(){
        List<String> list = new LinkedList<>();

        list.add("Brandon");
        list.add("Ruan");
        list.add("Divhani");

        Assertions.assertThat(list.size()).isEqualTo(3);

        list.remove(0);

        Assertions.assertThat(list.size()).isEqualTo(2);
        Assertions.assertThat(list.get(0)).isEqualToIgnoringCase("Ruan");
    }
}
