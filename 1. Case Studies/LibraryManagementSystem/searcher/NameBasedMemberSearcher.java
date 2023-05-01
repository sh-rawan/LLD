package LibraryManagementSystem.searcher;

import java.util.List;

public class NameBasedMemberSearcher implements MemberSearcher{

    private final String memberName;

    public NameBasedMemberSearcher(String memberName){
        this.memberName = memberName;
    }

    public List<Member> search(){
        return null;
    }
}
