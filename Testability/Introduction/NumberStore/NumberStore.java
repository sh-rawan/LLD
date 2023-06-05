package Introduction.NumberStore;

import java.util.LinkedList;
import java.util.List;

public class NumberStore {
    private final List<Integer> nums;
    private final InserterInterface inserterInterface;
    private final SearcherInterface searcherInterface;

    public NumberStore(InserterInterface inserterInterface, SearcherInterface searcherInterface) {
        this.inserterInterface = inserterInterface;
        this.searcherInterface = searcherInterface;
        nums = new LinkedList<Integer>();
    }

    public void insert(int i) {
        inserterInterface.insert(i, nums);
    }

    public int search(int num) {
        return searcherInterface.search(num, nums);
    }
    // public void delete(){
    // nums.remove(0);
    // }
}
