package com.gmail.arsenycholexandra;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/question")

public class MyServlet extends HttpServlet {

    static final int GENDER_MALE = 0;
    static final int GENDER_FEMALE = 1;
    static final int STUDENT_YES = 2;
    static final int STUDENT_NO = 3;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String age = req.getParameter("age");
        String gender = req.getParameter("gender");
        String student = req.getParameter("student");

        int ans1 = "male".equals(gender) ? GENDER_MALE : GENDER_FEMALE;
        int ans2 = "yes".equals(student) ? STUDENT_YES : STUDENT_NO;

        String genderresult;
        if (ans1 == 0) {
            genderresult = "male";
        } else {
            genderresult = "female";
        }

        String studentresult;
        if (ans2 == 2) {
            studentresult = "student";
        } else {
            studentresult = "not a student";
        }


        String responce = "<html>  Your firstname is   " + firstname + ". <br> Your lastname is  " + lastname + ". <br> Your age is   " + age + ".<br>  You are  " + genderresult + " and " + studentresult + ".</html>";
        resp.getWriter().println(responce);
    }
}
