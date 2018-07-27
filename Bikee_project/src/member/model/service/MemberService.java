package member.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import member.model.dao.MemberDAO;
import member.model.vo.Member;


public class MemberService {
	public Member selectOne(String mem_id) {
		Connection conn = getConnection();
		
		Member m = new MemberDAO().selectOne(conn, mem_id);
		
		close(conn);
		
		return m;
	}
	
	public int insertMember(Member m)
	{
		Connection conn=getConnection();
		int result=new MemberDAO().insertMember(conn,m);
		if(result>0) commit(conn);
		else rollback(conn);
		return result;
	}
	
	public boolean checkId(String mem_id)
	{
		Connection conn=getConnection();
		boolean isAble=new MemberDAO().checkId(conn,mem_id);
		close(conn);
		return isAble;
	}
	
	
	
	public int memberUpdateEnd(Member m) {
		Connection conn=getConnection();
		
		int result=new MemberDAO().memberUpdateEnd(conn,m);
		
		if(result>0) commit(conn);
		else rollback(conn);
		close(conn);
		
		return result;
	}
	
	public Member findId(String findPhone)
	{
		Connection conn=getConnection();
		Member m=new MemberDAO().findId(conn,findPhone);
		close(conn);
		return m;
	}

	public boolean checkId2(String findId)
	{
		Connection conn=getConnection();
		boolean isAble=new MemberDAO().checkId2(conn,findId);
		close(conn);
		return isAble;
	}
	
	public int changePw(Member m)
	{
		Connection conn=getConnection();
		int result=new MemberDAO().changePw(conn,m);
		if(result>0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	
	public Member checkId3(String findId)
	{
		Connection conn=getConnection();
		Member m=new MemberDAO().checkId3(conn,findId);
		close(conn);
		return m;
	}

	public ArrayList memberView()
	{
		Connection conn=getConnection();
		ArrayList<Member> list=new MemberDAO().memberView(conn);
		close(conn);
		return list;
	}


}
