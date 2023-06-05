package Introduction.NumberStore;

import java.util.List;

public class InsertOne implements InserterInterface {
    public void insert(int i, List<Integer> nums) {
        nums.add(0, i);
    }
}
