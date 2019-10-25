package tuto.tp4;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tuto.strategy.AppContext;
import tuto.strategy.ProcessingUser;
import tuto.tp3.Transaction;
import tuto.tp3.TransactionRepo;

@Component
public class Processor implements ItemProcessor<Transaction, Transaction> {

	@Autowired
	private TransactionRepo transactionrepo;
	
	

	@Override
	public Transaction process(Transaction tr) throws Exception {
		 Optional<Transaction> trsFromDb = transactionrepo.findById(tr.getIdtransaction());
		if(trsFromDb.isPresent()) {
			tr.setMnt(tr.getMnt()+trsFromDb.get().getMnt());
		}
		return tr;
		
	}

}