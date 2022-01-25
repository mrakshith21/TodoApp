package springboot.todo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.todo.TodoRepository;
import springboot.todo.models.Todo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SankalpaService {


    @Autowired
    private TodoRepository todoRepository;


    public Long generateId(){
        return System.currentTimeMillis();
    }

    public List<Todo> getAllTodos() {
        return (List<Todo>) todoRepository.findAll();
    }

    public Optional<Todo> getTodo(Long id) {
        return todoRepository.findById(id);
    }


    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

    public List<Todo> getTodosBefore(LocalDate deadline){
        return todoRepository.findAllByDeadlineLessThanEqual(deadline);
    }

}
