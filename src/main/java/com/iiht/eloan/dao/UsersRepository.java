package com.iiht.eloan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.eloan.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {

}
