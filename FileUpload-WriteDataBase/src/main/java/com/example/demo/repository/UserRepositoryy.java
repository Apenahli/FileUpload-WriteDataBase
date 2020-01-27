package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Userr;

public interface UserRepositoryy extends CrudRepository<Userr, Long> {

	Userr findByNameAndSurname(String name, String surname);

}
