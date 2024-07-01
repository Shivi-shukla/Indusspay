package com.inusspay.service;

import java.util.List;

import com.inusspay.entity.Txn;

public interface TxnService {
    
	Txn addTxn(Txn txn);
    List<Txn> getTxnsByAmountRange(double initialRange, double finalRange);
    List<Txn> sortTxnsByAmount();

}
