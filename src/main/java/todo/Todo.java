package todo;

public class Todo {
    private String title;
    private String description;
    private String id;

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

    public void setId(String id) {
        if(id == null || id.equals("")) {
            throw new IllegalArgumentException();
        }
        this.id = id;
    }
}
