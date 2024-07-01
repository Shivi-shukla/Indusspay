package com.inusspay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inusspay.entity.Txn;
import com.inusspay.service.TxnServiceImpl;

@RestController
@RequestMapping("/txn")

public class TxnController {
	
		@Autowired
	    private TxnServiceImpl txnService;
		
		@PostMapping("/add")
	    public ResponseEntity<Void> addTxn(@RequestBody Txn txn) {
			
	        txnService.addTxn(txn);
	        return ResponseEntity.ok().build();
	    }

	    @GetMapping("/amount/{initial_range}/{final_range}")
	    public ResponseEntity<List<Txn>> getTxnsByAmountRange(@PathVariable("initial_range") double initialRange,
	                                                          @PathVariable("final_range") double finalRange) {
	    	
	        List<Txn> txns = txnService.getTxnsByAmountRange(initialRange, finalRange);
	        if (txns.isEmpty()) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	        }
	        return ResponseEntity.ok(txns);
	    }

	    @GetMapping("/sort/amount")
	    public ResponseEntity<List<Txn>> sortTxnsByAmount() {
	    	
	        List<Txn> txns = txnService.sortTxnsByAmount();
	        return ResponseEntity.ok(txns);
	    }

}
