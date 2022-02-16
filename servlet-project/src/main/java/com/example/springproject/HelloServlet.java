package com.example.springproject;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
//@WebServlet(name = "helloServlet", value = "/api/message")
@WebServlet(name = "helloServlet", value = "/api/players")
public class HelloServlet extends HttpServlet {

    List<String> players =    new ArrayList<String>(Arrays.asList(
            "Lionel Messi",
            "Cristiano Ronaldo",
            "Xavi	Midfielder",
            "Andres Iniesta",
            "Zlatan Ibrahimovic",
            "Radamel Falcao",
            "Robin van Persie",
            "Andrea Pirlo",
            "Yaya Toure",
            "Edinson Cavani",
            "Sergio Aguero",
            "Iker Casillas",
            "Neymar",
            "Sergio Busquets",
            "Xabi Alonso",
            "Thiago Silva",
            "Mesut Ozil",
            "David Silva",
            "Bastian Schweinsteiger",
            "Gianluigi Buffon"));

    String playersAsJson = "[" +players.stream().map(p->"\""+p+"\"").collect(Collectors.joining(","))+"]";

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("application/json");
//        PrintWriter out = response.getWriter();
//        out.println("{\"Message\":\"REST is such a cool thing :-)\"}");
//    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println(playersAsJson);
    }

    public void destroy() {
    }
}