package com.todo.controllers;

import com.todo.entity.Todo;
import com.todo.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/api")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;


    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewTodo (@RequestParam String title, @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Todo n = new Todo();
        n.setTitle(title);
        todoRepo.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Todo> getAllUsers() {
        // This returns a JSON or XML with the users
        return todoRepo.findAll();
    }

   /* @GetMapping("/todos")
    public void getAllTodos(@RequestParam(required = false) String title) {
       // try {
        //    List<Todo> todos = new ArrayList<Todo>();
         //   if (title == null)
      //  }
    }

    @GetMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
    ...
    }

    @PostMapping("/tutorials")
    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
    ...
    }

    @PutMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
    ...
    }

    @DeleteMapping("/tutorials/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
    ...
    }

    @DeleteMapping("/tutorials")
    public ResponseEntity<HttpStatus> deleteAllTutorials() {
    ...
    }

    @GetMapping("/tutorials/published")
    public ResponseEntity<List<Tutorial>> findByPublished() {
    ...
    }




        /
*/
}
