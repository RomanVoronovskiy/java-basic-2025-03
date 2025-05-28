package ru.otus.lesson18;

import java.util.List;

public interface SearchTree {

    /**
     * @param element to find
     * @return element if exists, otherwise - null
     */
    String find(String element);

    List<String> getSortedList();
}
