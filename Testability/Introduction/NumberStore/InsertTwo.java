package Introduction.NumberStore;

import java.util.List;

public class InsertTwo implements InserterInterface {
    public void insert(int i, List<Integer> nums) {
        nums.add(nums.size(), i);
    }
}
