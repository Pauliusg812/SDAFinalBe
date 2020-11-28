package com.todo.repositories;

import com.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface TodoRepo extends CrudRepository<Todo, Integer> {


//public interface TodoRepo extends JpaRepository<Todo, Long> {
//    List<Todo> findByDone(boolean done);
//    List<Todo> findByTitleContaining(String title);
}
