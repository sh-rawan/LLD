package NumberStore;

import java.util.List;

public class SearcherOne implements SearcherInterface{
    public int search(int num, List<Integer> nums){
        return nums.indexOf(num);
    }
}
