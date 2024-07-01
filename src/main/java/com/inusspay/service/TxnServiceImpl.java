package com.inusspay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inusspay.entity.Txn;
import com.inusspay.repositary.TxnRepository;

@Service
public class TxnServiceImpl implements TxnService {
	
	@Autowired
    private TxnRepository txnRepository;

	@Override
	public Txn addTxn(Txn txn) {
		
		if (txn.getAmount() < 0) {
            throw new IllegalArgumentException("Amount cannot be less than 0");
        }
        return txnRepository.save(txn);
	}

	@Override
	public List<Txn> getTxnsByAmountRange(double initialRange, double finalRange) {
		
		return txnRepository.findByAmountBetween(initialRange, finalRange);
	}

	@Override
	public List<Txn> sortTxnsByAmount() {
		
		return txnRepository.findAllByOrderByAmountAsc();
		
	}

}
