package list;
import data.*;

public class List implements ListInterface{

    private Node first;
    private Node last;
    private int size;


    public List(){

        this.first = null;
        this.last = null;
    }

    @Override
    public void add(Object item, int index) {

        Node newNode = new Node(index, (Person) item);

        Node previous = null;
        Node current = this.first;

        while(current!= null ){
            previous = current;
            current = current.getNext();
        }
        if (previous==null)
            first = newNode;
        else
            previous.setNext(newNode);
        newNode.setNext(current);

    }

    @Override
    public void remove(int index) {

        Node current = first;

        while(current.getKey() != index){

            current = current.next;

            if (current == null)
                System.out.println("Ключ не найден!");
        }
        if (current==first)
            first = current.next;
        else
            current.previous.next = current.next;

        if (current==last)
           last = current.previous;
        else
            current.next.previous = current.previous;

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    public void displayItem(){

        Node current = first;

        while(current!=null){
            current.display();
            current = current.next;
        }

    }
}
