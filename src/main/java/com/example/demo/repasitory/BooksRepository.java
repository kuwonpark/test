package com.example.demo.repasitory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.collection.Books;

public interface BooksRepository extends MongoRepository<Books, String>{
	
	@Query("{name:?0}")
	public List<Books> findByName(String name);

}
