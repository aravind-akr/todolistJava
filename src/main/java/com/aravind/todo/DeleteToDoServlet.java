package com.aravind.todo;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aravind.todo.TodoService;

@WebServlet(urlPatterns = "/deleteTodo.do")
public class DeleteToDoServlet extends HttpServlet{
	
	private TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		todoService.deleteTodo(new ToDo(request.getParameter("todo"),request.getParameter("category")));
		response.sendRedirect("/list-todos.do");
	}

}
