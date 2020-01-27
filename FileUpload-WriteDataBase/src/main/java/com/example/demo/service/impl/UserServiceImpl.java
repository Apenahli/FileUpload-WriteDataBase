package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.Userr;
import com.example.demo.repository.UserRepositoryy;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepositoryy userRepositoryy;

	@Override
	public int saveImage(Userr user) {
		try {
			userRepositoryy.save(user);
			return 1;

		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public Userr getImages(Long id) {

		Optional<?> findById = userRepositoryy.findById(id);

		if (findById.isPresent()) {

			Userr getImage = (Userr) findById.get();

			return getImage;

		} else {

			return null;
		}
		// isPresent icinde deyer varsa

	}

	@Override
	public List<Userr> findAll() {
		return (List<Userr>) userRepositoryy.findAll();
	}

	@Override
	public Userr findByNameAndSurname(String name, String surname) {

		return userRepositoryy.findByNameAndSurname(name, surname);
	}
	


}
