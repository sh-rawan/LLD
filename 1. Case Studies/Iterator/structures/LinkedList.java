package Iterator.structures;

import Iterator.iterators.Iterable;
import Iterator.iterators.Iterator;
import Iterator.iterators.LinkedListIterator;

// Indigo
public class LinkedList implements Iterable{
    private LinkedListNode head;
    private int length = 1;

    public LinkedList(LinkedListNode head) {this.head = head;}

    public void insert(LinkedListNode node){
        LinkedListNode previous = head;
        while(previous.getNext() != null)
            previous = previous.getNext();
        previous.setNext(node);
        length++;
    }

    public LinkedListNode[] getData() {
        LinkedListNode temp = head;
        int count = 0;
        LinkedListNode[] nodes = new LinkedListNode[length];
        while(temp != null){
            nodes[count] = temp;
            temp = temp.getNext();
            count++;
        }
        return nodes;
    }

    public Iterator getIterator(){
        return new LinkedListIterator(head);
    }


}
