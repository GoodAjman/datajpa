package com.ajman.springbootjpa.datajpa.repository;


import com.ajman.springbootjpa.datajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
//继承JpaRepository，都实现了crudRepository,PagingAndSortingRepository
public interface UserRepository  extends JpaRepository<User,Integer> {

}
