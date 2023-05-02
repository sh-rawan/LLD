package LibraryManagementSystem.searcher;

import java.util.List;

import LibraryManagementSystem.user.Member;

public class IdBasedMemberSearcher implements MemberSearcher{
    
    private final int id;
    
    public IdBasedMemberSearcher(int id){
        this.id = id;
    }

    public List<Member> search(){
        return null;
    }
}
