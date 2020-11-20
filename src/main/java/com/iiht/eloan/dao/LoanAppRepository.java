package com.iiht.eloan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.eloan.entity.LoanApp;

@Repository
public interface LoanAppRepository extends JpaRepository<LoanApp,Integer> {

}
