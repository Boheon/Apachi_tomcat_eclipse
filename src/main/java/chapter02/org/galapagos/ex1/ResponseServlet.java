package chapter02.org.galapagos.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/response")
public class ResponseServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
//	@see HTTpServlet #HttpServlet()

	public ResponseServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//MIME타입 설정
		response.setContentType("text/html;charset=UTF-8");
		//자바 I/O
		PrintWriter out = response.getWriter();
		//html 작성 및 출력
		out.print("<html><body>");
		out.print("ResponseServlet 요청 성공");
		out.print("</html></body>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);//get, post 상관없이 동일한 답을 전달한다.
	}
	

}
