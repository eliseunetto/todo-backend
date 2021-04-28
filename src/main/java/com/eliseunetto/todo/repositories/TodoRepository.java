package com.eliseunetto.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eliseunetto.todo.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

	
}
