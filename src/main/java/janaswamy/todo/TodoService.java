package janaswamy.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Complete proposal", "ALL"));
		todos.add(new Todo("Budget Plan", "ALL"));
		todos.add(new Todo("Buy Equipments", "CE"));
		todos.add(new Todo("Create Database", "SE"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodo(Todo todo) {
		todos.add(todo);
	}

	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

}