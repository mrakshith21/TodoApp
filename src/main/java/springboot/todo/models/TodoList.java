package springboot.todo.models;

import java.util.List;


public class TodoList {

    private List<Todo> todoList;

    public TodoList() {
    }

    public TodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }
}
