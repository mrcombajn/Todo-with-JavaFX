package todo.comparators;

import todo.Todo;

import java.util.Comparator;

public interface TodoComparator extends Comparator<Todo> {
    @Override
    int compare(Todo o1, Todo o2);
}
