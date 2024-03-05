package org.example.classes;

public class OwnArrayList {
    private Double[] elements;
    private int size;

    public OwnArrayList() {
        elements = new Double[10];
        size = 0;
    }

    public void add(Double element) {
        if (size == elements.length) {
            Double[] newElements = new Double[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }

        elements[size++] = element;
    }
}
