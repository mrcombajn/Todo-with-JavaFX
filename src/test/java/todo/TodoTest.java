package todo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest {
    Todo todo;
    @BeforeEach
    void createTodoBeforeEach() {
        todo = new Todo("ExampleTitle", "ExampleDescription", "ExampleId");
    }

    @Test
    void isTodoHasATitleWhenUseASetTitleMethod() {
        //given
        todo.setTitle("New title");
        //when
        //then
        assertEquals("New title", todo.getTitle());
    }

    @Test
    void settingANullTitleShouldThrowAnException() {
        //given
        //when
        //then
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> todo.setTitle(null)),
                () -> assertThrows(IllegalArgumentException.class, () -> todo.setTitle(""))
        );
    }

    @Test
    void isTodoHasADescriptionWhenUseASetDescriptionMethod() {
        //given
        todo.setDescription("example");
        //when
        //then
        assertEquals("example", todo.getDescription());
    }

    @Test
    void settingANullDescriptionShouldThrowAnException() {
        //given
        //when
        //then
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> todo.setDescription(null)),
                () -> assertThrows(IllegalArgumentException.class, () -> todo.setDescription(""))
        );
    }

    @Test
    void settingANullIdShouldThrowAnException() {
        //given
        //when
        //then
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> todo.setDescription(null)),
                () -> assertThrows(IllegalArgumentException.class, () -> todo.setDescription(""))
        );
    }


}