package Models;

public class Node {
    private int value;
    private Node next;
    
    public <T> Node(T value2) {
        this.value = (int) value2;
        this.next = null;
    }

    public int getValue() {
        return value;
    }



    public void setValue(int value) {
        this.value = value;
    }



    public Node getNext() {
        return next;
    }



    public void setNext(Node next) {
        this.next = next;
    }
     

    @Override
    public String toString() {
        return "Node "  + " | "+value+" | "  ;
    }

    

    
}