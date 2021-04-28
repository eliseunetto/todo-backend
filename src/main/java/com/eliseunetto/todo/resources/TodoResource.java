package com.eliseunetto.todo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eliseunetto.todo.domain.Todo;
import com.eliseunetto.todo.services.TodoService;

@Controller
@RequestMapping(value = "/todos")
public class TodoResource {

	@Autowired
	private TodoService todoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Todo> findById(@PathVariable Integer id) {
		Todo obj = todoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
