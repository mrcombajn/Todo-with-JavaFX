package todo;

import java.util.Objects;

public class Todo {
    private String title;
    private String description;
    private String id;

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Todo(String title) {
        this.title = title;
        this.description = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if(title == null || title.equals("")) {
            throw new IllegalArgumentException();
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description == null || description.equals("")) {
            throw new IllegalArgumentException();
        }
        this.description = description;
    }

    public String getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return title.equals(todo.title) && description.equals(todo.description) && id.equals(todo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, id);
    }
}
