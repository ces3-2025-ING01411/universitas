package co.edu.poli.ces3.universitas.servlet;

import co.edu.poli.ces3.universitas.dao.Student;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "studentSrv", value = "/student")
public class StudentSrv extends HttpServlet {

    private Vector<Integer> numbers;
    private ArrayList<Student> students;
    @Override
    public void init() throws ServletException {
        System.out.println("Init!!!!!");

        this.numbers = new Vector();
        this.students = new ArrayList<>();

        Student d1 = new Student(
                "Andres",
                "Bedoya",
                new Date(),
                "andresbedoya@gmail.com",
                5,
                false
        );
        d1.setId(10);

        this.students.add(d1);

        this.students.add(new Student(
                "Felipe",
                "Bedoya",
                new Date(96,10,9),
                "felipebedoya@gmail.com",
                7,
                true
        ));


        this.students.add(new Student(
                "Carolina",
                "Andrade",
                new Date(),
                "carolina123@gmail.com",
                1,
                false
        ));

        this.students.add(new Student(
                "Ana",
                "Diez",
                new Date(),
                "diezana@outlook.com",
                11,
                false
        ));

        for (int i = 0; i < 500; i++) {
            numbers.add((int)(Math.random() * 10));
        }

        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");

        int idStudent = Integer.parseInt(req.getParameter("id"));

        resp.setStatus(HttpServletResponse.SC_CREATED);
        PrintWriter out = resp.getWriter();

        Gson gson = new Gson();

        if(req.getParameter("id") == null) {
            out.print(gson.toJson(students));
        }else{
            Student searchStudent = null;
            for (Student x: students) {
                if(x.getId().equals(idStudent) ){
                    searchStudent = x;
                    break;
                }
            }
            out.print(gson.toJson(searchStudent));
        }
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
