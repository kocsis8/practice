package org.example.classes;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OwnThreadSafeLinkedList {
    private Node tail;
    private Lock lock = new ReentrantLock();

    public void add(int value) {
        lock.lock();
        try {
            Node newNode = new Node(value);
            if (tail == null) {
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        } finally {
            lock.unlock();
        }
    }

    private static class Node {
        private final int value;
        private Node next;

        private Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
