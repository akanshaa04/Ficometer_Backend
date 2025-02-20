package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bank.modal.Lcr;
import com.bank.modal.PenaltyFees;

@Repository
public interface lcrRepo extends JpaRepository<Lcr,Integer>{
	public Lcr findById(int id);
	
	@Query("SELECT l FROM Lcr l ORDER BY l.period DESC LIMIT 1")
	public Lcr getLcrByPeriod();
}
