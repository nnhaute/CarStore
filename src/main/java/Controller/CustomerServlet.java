package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.loginCusDao;
import Models.Customer;


@WebServlet("/LoginCus")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private loginCusDao loginCus;

    public CustomerServlet() {
        super();
        	
    }

    public void init() {
        loginCus = new loginCusDao();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        Customer temp= new Customer();
        temp.setUserName(username);
        temp.setPasswd(password);
        try {

        	
        	Customer NewCs= new Customer();
        	NewCs=loginCus.onLogin(temp);
        	if (NewCs != null) {
        		HttpSession session = request.getSession();
        		session.setAttribute("user", NewCs);
        		response.sendRedirect("LoginSuccess.jsp");
        	} else {
        		request.setAttribute("error", "THÔNG TIN ĐĂNG NHẬP KHÔNG CHÍNH XÁC !!!!!");
        		 RequestDispatcher rd = request.getRequestDispatcher("/LoginCus.jsp");
                 rd.forward(request, response);
        	}
        } catch (Exception e) {
        	e.printStackTrace();
        };
		doGet(request, response);
	}

}
