package data;

public class Node {

    public Node next;
    private Person item;
    public Node previous;
    private int key;

    public Node(int id, Person item){
        this.key = id;
        this.item = item;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public Person getItem() {
        return item;
    }

    public int getKey() {
        return key;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setKey(int key) {
        this.key = key;
    }


    public void display(){

        System.out.println("id: " + this.getKey() + " name: " + this.getItem().getFirstName());
    }


}
