package springboot.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.todo.models.Todo;
import springboot.todo.resources.SankalpaResource;
import springboot.todo.services.SankalpaService;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SankalpaApplication {



    public static void main(String[] args) {

        SpringApplication.run(SankalpaApplication.class, args);
//        SankalpaService sankalpaService = new SankalpaService();
//        List<Todo> list = List.of(
//                new Todo("clean table", "my table", LocalDate.of(2020, 8, 19)));
//        );

    }

}
