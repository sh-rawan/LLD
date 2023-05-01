package LibraryManagementSystem.searcher;

import java.util.List;

public class IdBasedMemberSearcher implements MemberSearcher{
    
    private final int id;
    
    public IdBasedMemberSearcher(int id){
        this.id = id;
    }

    public List<Member> search(){}
}
