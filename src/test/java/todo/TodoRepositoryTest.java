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

    @Test
    void deletingANonExistentTodoShouldThrowAnException() {
        //given
        TodoRepository todoRepository = new TodoRepository();
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> todoRepository.delete("1"));
    }

    @Test
    void deletingAnExistentTodoShouldDeleteTodoFromList() {
        //given
        TodoRepository todoRepository = new TodoRepository();
        todoRepository.add(new Todo("Title1", "Description1", "123"));
        todoRepository.add(new Todo("Title5", "Description2", "15"));
        todoRepository.add(new Todo("Title3", "Description3", "156"));
        //when
        todoRepository.delete("15");
        //then
        assertEquals(2, todoRepository.getTodos().size());

    }
}