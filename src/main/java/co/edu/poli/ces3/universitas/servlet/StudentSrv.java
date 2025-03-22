package co.edu.poli.ces3.universitas.servlet;

import co.edu.poli.ces3.universitas.dao.Student;
import co.edu.poli.ces3.universitas.utils.RandomBigIntegerGenerator;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

@WebServlet(name = "studentSrv", value = "/student")
public class StudentSrv extends HttpServlet {

    private Vector<Integer> numbers;
    private ArrayList<Student> students;

    private static final int LENGTH_ID_STUDENT = 10;
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
        d1.setId(Math.abs(RandomBigIntegerGenerator.generateUniqueBigInteger(LENGTH_ID_STUDENT).intValue()));

        this.students.add(d1);

        this.students.add(new Student(
                RandomBigIntegerGenerator.generateUniqueBigInteger(LENGTH_ID_STUDENT).intValue(),
                "Felipe",
                "Bedoya",
                new Date(96,10,9),
                "felipebedoya@gmail.com",
                7,
                true
        ));


        this.students.add(new Student(
                RandomBigIntegerGenerator.generateUniqueBigInteger(LENGTH_ID_STUDENT).intValue(),
                "Carolina",
                "Andrade",
                new Date(),
                "carolina123@gmail.com",
                1,
                false
        ));

        this.students.add(new Student(
                RandomBigIntegerGenerator.generateUniqueBigInteger(LENGTH_ID_STUDENT).intValue(),
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

        resp.setStatus(HttpServletResponse.SC_CREATED);
        PrintWriter out = resp.getWriter();

        Gson gson = new Gson();

        if(req.getParameter("id") == null) {
            out.print(gson.toJson(students));
        }else{
            int idStudent = Integer.parseInt(req.getParameter("id"));
            Student searchStudent = null;
            for (Student x : students) {
                if (x.getId() != null && x.getId().equals(idStudent)) {
                    searchStudent = x;
                    break;
                }
            }

            if (searchStudent != null) {
                out.print(gson.toJson(searchStudent));
            } else {
                out.print("{\"error\":\"Estudiante no encontrado\"}");
            }
        }
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JsonObject studentJson = this.getParamsFromBody(req);
        PrintWriter out = resp.getWriter();
        Student student = new Student();
        Gson gson = new Gson();
        resp.setContentType("application/json");

        student.setId(RandomBigIntegerGenerator.generateUniqueBigInteger(LENGTH_ID_STUDENT).intValue());
        student.setName(studentJson.get("name").getAsString());
        student.setLastName(studentJson.get("lastName").getAsString());
        student.setLevel(studentJson.get("level").getAsInt());
        student.setMarried(studentJson.get("isMarried").getAsBoolean());
        student.setBirthDay(new Date(studentJson.get("birthDay").getAsString()));

        this.students.add(student);

        out.flush();
    }


    private JsonObject getParamsFromBody(HttpServletRequest request) throws IOException {
        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            sb.append(line + "\n");
            line = reader.readLine();
        }
        reader.close();
        return JsonParser.parseString(sb.toString()).getAsJsonObject();
    }

}
