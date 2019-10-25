package tuto.tp4;


import java.util.List;


import javax.transaction.Transactional;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tuto.tp3.Transaction;
import tuto.tp3.TransactionRepo;

@Component
public class Writer implements ItemWriter<Transaction>{
	
	@Autowired
	private TransactionRepo repo;

	@Override
	@Transactional
	public void write(List<? extends Transaction> trs) throws Exception {
		repo.saveAll(trs);
		
	}
	
}