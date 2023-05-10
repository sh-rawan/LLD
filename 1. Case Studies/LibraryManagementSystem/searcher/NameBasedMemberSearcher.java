package LibraryManagementSystem.searcher;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import LibraryManagementSystem.dataaccessor.DbAccessor;
import LibraryManagementSystem.dataaccessor.ResultsConvertor;

public class NameBasedMemberSearcher implements MemberSearcher{

    private final String memberName;
    private final DbAccessor dbAccessor;

    public NameBasedMemberSearcher(String memberName){
        this.memberName = memberName;
        this.dbAccessor = new DbAccessor();
    }
    // public List<Member> search(){
    //     return null;
    // }
    public List<Member> search(){
        // List<Member> members = ResultsConvertor.convertToMembers(dbAccessor.getMembersWithName(memberName));
        return null;
    }
}
