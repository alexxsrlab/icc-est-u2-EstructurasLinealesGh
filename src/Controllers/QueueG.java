package Controllers;

import java.util.EmptyStackException;
import Models.NodeGeneric;

public class QueueG<T> {

    protected NodeGeneric<T> primero; // head - front
    protected NodeGeneric<T> ultimo;
    protected int size;

    public QueueG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T aux = primero.getValue();
        primero = primero.getNext();
        if (primero == null) {
            ultimo = null;
        }
        size--;
        return aux;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        NodeGeneric<T> current = primero;
        while (current != null) {
            System.out.print(current.getValue() + " <- ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void printCola() {
        NodeGeneric<T> actual = primero;
        while (actual != null) {
            System.out.print(actual.getValue() + " | ");
            actual = actual.getNext();
        }
        System.out.println();
    }
}

