package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class memberUpdateEndServlet
 */
@WebServlet("/member/memberUpdateEnd")
public class MemberUpdateEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateEndServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String from = (String)request.getParameter("from");
		
		Member m = null;
		int result = 0;
		if(from.equals("Update")) {
			
			String userId = (String)request.getParameter("userId");
			String userName = (String)request.getParameter("userName");
			int userBirthday =Integer.parseInt(request.getParameter("userBirthday"));
			String userEmail = (String)request.getParameter("userEmail");
			String userAddress = (String)request.getParameter("userAddress");
			String userPhone = (String)request.getParameter("userPhone");
			
			m = new Member();
			m.setMem_id(userId);
			m.setMem_name(userName);
			m.setMem_birthdate(userBirthday);
			m.setMem_email(userEmail);
			m.setMem_addr(userEmail);
			m.setMem_phone(userPhone);
			
			result =new MemberService().memberInfoUp(m);
		}else {
			
			String userPw=(String)request.getParameter("userPw");
			String userId = (String)request.getParameter("userId");
			m = new Member();
			m.setMem_pw(userPw);
			
			result = new MemberService().memberPassUp(m);
			
			
		}
		
		 
		
		String msg="";
		String loc="/";
		String view="/views/common/communityMsg.jsp";
		
		if(result>0)
		{
			msg="회원정보 수정을 완료하였습니다.";
		}
		else
		{
			msg="회원정보 수정을 실패하였습니다.";
			
			loc="/memberUpdate?memId="+m.getMem_id();
		}
		request.setAttribute("msg", msg); 
		request.setAttribute("loc", loc);
		request.getRequestDispatcher(view).forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
