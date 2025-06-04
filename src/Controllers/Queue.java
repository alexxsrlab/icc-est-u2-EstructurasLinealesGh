package Controllers;

import java.util.EmptyStackException;

import Models.Node;

public class Queue {
    
    private Node primero; //head - front
    private Node ultimo;
    private int size;

    public Queue() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
    }

    public int remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int aux = primero.getValue();
        return aux;
    }

    public int size() {
        return size;
    }


    public int peek(){
        if(isEmpty()) throw new EmptyStackException() ; return primero.getValue();
    }

    public boolean isEmpty() {
        return primero == null;
    }
}
