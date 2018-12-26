package com.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.employee.modal.Countries;

public interface CountriesRepository  extends CrudRepository<Countries, Integer>{

}
