package com.deloitte.estore.service;

import java.sql.Connection;
import java.util.List;

import com.deloitte.estore.model.Person;

import com.deloitte.estore.repo.PersonRepo;
import com.deloitte.estore.repo.PersonRepoImpl;

public class PersonServiceImpl implements PersonService {

    PersonRepo repo;

    public PersonServiceImpl() {

    	repo=new PersonRepoImpl();

    }

	@Override

	public boolean addPerson(Person person) throws Exception {

		return repo.addPerson(person);

	}


	@Override

	public Person getPersonById(String userName) throws Exception {

		// TODO Auto-generated method stub

		return repo.getPersonById(userName);

	}

	@Override

	public Connection getDbConnection() throws Exception {

		// TODO Auto-generated method stub

		return null;

	}


}