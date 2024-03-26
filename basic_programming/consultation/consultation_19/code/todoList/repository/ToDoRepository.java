package code.todoList.repository;

import code.todoList.entity.Todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoRepository {

    List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTodo(Todo newTodo) {
        todos.add(newTodo);
    }
}
