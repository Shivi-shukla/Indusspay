package com.inusspay.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inusspay.entity.Txn;

public interface TxnRepository extends JpaRepository<Txn, Long>{
	
	List<Txn> findAllByOrderByAmountAsc();
	List<Txn> findByAmountBetween(double initialRange, double finalRange);


}
