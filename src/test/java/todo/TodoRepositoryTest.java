package todo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TodoRepositoryTest {
    @Test
    void isTodosEmpty() {
        //given
        TodoRepository todoRepository = new TodoRepository();
        //when
        List<Todo> todos = todoRepository.getTodos();
        //then
        assertTrue(todos.isEmpty());
    }

    @Test
    void todosListSizeShouldIncreaseWhenAddingANewTodo() {
        //given
        TodoRepository todoRepository = new TodoRepository();
        //when
        todoRepository.add(new Todo("Example Title", "Example Description", "Example Id"));
        //then
        assertEquals(1, todoRepository.getTodos().size());
    }

    @Test
    void addingANullTodoShouldThrowIllegalArgumentException() {
        //given
        TodoRepository todoRepository = new TodoRepository();
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> todoRepository.add(null));
    }
}