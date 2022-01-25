package springboot.todo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import springboot.todo.TodoRepository;
import springboot.todo.models.Todo;
import springboot.todo.models.TodoList;
import springboot.todo.services.SankalpaService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todo")
public class SankalpaResource {

    @Autowired
    private SankalpaService sankalpaService;


    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public TodoList getAllTodos() {
        return new TodoList(sankalpaService.getAllTodos());
    }

    @CrossOrigin
    @RequestMapping("/{id}")
    public Optional<Todo> getTodo(@PathVariable("id") Long id) {
        return sankalpaService.getTodo(id);
    }


    @CrossOrigin
    @RequestMapping(method= RequestMethod.POST)
    public void addTodo(@RequestBody Todo todo) {
        sankalpaService.addTodo(todo);
    }



    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT)
    public void updateTodo(@RequestBody Todo Todo) {
        sankalpaService.updateTodo(Todo);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public void deleteTodo(@PathVariable("id") Long id) {
        sankalpaService.deleteTodo(id);
    }

    @CrossOrigin
    @RequestMapping("/before")
    public TodoList getTodosBefore(@RequestParam("deadline") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate deadline){

        return new TodoList(sankalpaService.getTodosBefore(deadline));
    }


}
