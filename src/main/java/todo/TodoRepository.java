package todo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public void delete(String id) throws IllegalArgumentException{
        List<Todo> todo = todos.stream().filter(todo1 -> (todo1.getId()) == id).collect(Collectors.toList());
        if(todo.size() == 0) {
            throw new IllegalArgumentException();
        }
        todos.remove(todo.get(0));
    }
}
