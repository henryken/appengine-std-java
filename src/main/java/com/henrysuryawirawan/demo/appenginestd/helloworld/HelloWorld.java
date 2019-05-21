package com.henrysuryawirawan.demo.appenginestd.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloWorld", value = "/hello")
public class HelloWorld extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {

    String name = request.getParameter("name");
    if (name == null) {
      name = "World";
    }

    PrintWriter writer = response.getWriter();
    writer.write("Hello " + name + ". From App Engine Standard.");
  }

}
