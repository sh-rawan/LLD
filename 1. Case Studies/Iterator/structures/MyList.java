package Iterator.structures;

import java.util.ArrayList;
import java.util.List;

import Iterator.iterators.Iterator;
import Iterator.iterators.MyListIterator;

// Vistara
public class MyList implements Iterable {
    private final List<Integer> internalList;

    public MyList() {
        this.internalList = new ArrayList<>();
    }

    public void insert(Integer x) {
        this.internalList.add(x);
    }

    public List<Integer> getData() {
        return this.internalList;
    }

    public Iterator getIterator() {
        return new MyListIterator(internalList);
    }
}
