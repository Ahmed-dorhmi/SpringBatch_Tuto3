package tuto.tp3;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tuto.strategy.AppContext;
import tuto.strategy.ProcessingUser;

@Component
public class Processor implements ItemProcessor<Users, Users> {

	@Autowired
	private UsersRepository userRepo;
	
	@Autowired
	AppContext<Users>  ctx;

	@Override
	public Users process(Users user) throws Exception {
//		 Optional<Users> userFromDb = userRepo.findById(user.getUserId());
//		if(userFromDb.isPresent()) {
//			user.setAccount(user.getAccount().add(userFromDb.get().getAccount()));
//		}
//		return user;
		Users u = new ProcessingUser().processing(user);
		return u;
	}

}