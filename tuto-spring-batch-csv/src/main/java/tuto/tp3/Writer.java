package tuto.tp3;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Writer implements ItemWriter<Users>{
	
	@Autowired
	private UsersRepository repo;

	@Override
	@Transactional
	public void write(List<? extends Users> users) throws Exception {
		repo.saveAll(users);
		
	}
	
}