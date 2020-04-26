package com.aravind.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<ToDo> todos = new ArrayList<ToDo>();
	
	static {
		todos.add(new ToDo("Web Application Development","study"));
		todos.add(new ToDo("RestFul","study"));
		todos.add(new ToDo("Python","study"));
		todos.add(new ToDo("Jax-RS","study"));
		
	}
	
	public void addTodo(ToDo toDo) {
		todos.add(toDo);
	}
	
	public void deleteTodo(ToDo toDo) {
		todos.remove(toDo);
	}
	
	public List<ToDo> retrieveTodos(){
		return todos;
	}
	
	

}
