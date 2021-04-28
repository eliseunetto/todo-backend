package com.eliseunetto.todo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eliseunetto.todo.domain.Todo;
import com.eliseunetto.todo.repositories.TodoRepository;
import com.eliseunetto.todo.services.exceptions.ObjectNotFoundException;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;

	public Todo findById(Integer id) {
		Optional<Todo> obj = todoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrato! Id: " + id + ", Tipo: " + Todo.class.getName()));
	}

	public List<Todo> findAllOpen() {
		List<Todo> list = todoRepository.findAllOpen();
		return list;
	}

	public List<Todo> findAllClose() {
		List<Todo> list = todoRepository.findAllClose();
		return list;		
	}

	public List<Todo> findAll() {
		List<Todo> list = todoRepository.findAll();
		return list;	
	}

	public Todo create(Todo obj) {
		obj.setId(null);
		return todoRepository.save(obj);
	}

	public void delete(Integer id) {
		todoRepository.deleteById(id);		
	}

}
