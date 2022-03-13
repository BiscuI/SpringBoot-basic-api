package com.firstproject.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.firstproject.entities.Category;

@Component
public class CategoryRepository {
	private Map<Long, Category> map = new HashMap<>();
	
	public void save(Category cat) {
		map.put(cat.getId(), cat);
	}
	
	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll(){
		return new ArrayList<Category>(map.values());
	}
}
