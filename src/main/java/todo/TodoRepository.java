package todo;

import java.util.ArrayList;
import java.util.List;

public class TodoRepository {
    private List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodos() {
        return todos;
    }

    public void add(Todo todo) throws IllegalArgumentException {
        if(todo == null) {
            throw new IllegalArgumentException();
        }
        todos.add(todo);
    }
}
