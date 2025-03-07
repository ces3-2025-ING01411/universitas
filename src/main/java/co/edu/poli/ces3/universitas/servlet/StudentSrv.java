package co.edu.poli.ces3.universitas.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "studentSrv", value = "student")
public class StudentSrv extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Init!!!!!");
        super.init();
    }
}
