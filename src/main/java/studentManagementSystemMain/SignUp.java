package studentManagementSystemMain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentManagementSystem.dao.StudentDao;
import studentManagementSystemMain.dto.Student;

public class SignUp extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("sname");
		String email=req.getParameter("semail");
		String password=req.getParameter("pwd");
		
		Student stu=new Student();
		stu.setName(name);
		stu.setEmail(email);
		stu.setPwd(password);
		
		StudentDao dao=new StudentDao();
		dao.saveStudent(stu);
		


		
	}




		
	}


