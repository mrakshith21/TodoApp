package springboot.todo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import springboot.todo.models.Todo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

//    @Query("SELECT e from Todo e where e.deadline <= ?1")
    List<Todo> findAllByDeadlineLessThanEqual(LocalDate deadline);

//    @Query("SELECT name, description, deadline from Todo order by deadline")
//    List<Todo> findAllByOrOrderByDeadlineAsc();
}
