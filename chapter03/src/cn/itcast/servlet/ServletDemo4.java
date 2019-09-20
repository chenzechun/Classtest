package cn.itcast.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo4
 */
@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletDemo4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void init() throws ServletException {
		// ����������һ����ʼֵ 0 
		int count = 0;
		// �� 0 ���뵽 ServletContext��
		getServletContext().setAttribute("count", count);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ��ԭ���Ĵ���ȡ����
		int count = (Integer) getServletContext().getAttribute("count");
		count += 1;
		// ���뵽SErvletContext��
		getServletContext().setAttribute("count", count);
		// ��ҳ�������ӭ����!
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("<h1>��ӭ���ٱ���վ! ��������"+count+"�η���</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
