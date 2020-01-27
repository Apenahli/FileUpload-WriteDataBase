package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.model.Userr;

public interface UserService {

	int saveImage(Userr user);

	Userr getImages(Long id);

	List<Userr> findAll();

	Userr findByNameAndSurname(String name, String surname);

}
