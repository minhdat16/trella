package com.nlu.trella.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nlu.trella.model.UserEntity;

@Repository
public interface UserEntityRepository extends CrudRepository<UserEntity, Long>{

}
