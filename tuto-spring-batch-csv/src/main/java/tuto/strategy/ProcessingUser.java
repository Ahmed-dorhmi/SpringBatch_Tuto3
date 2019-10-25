/**
 * 
 */
package tuto.strategy;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import tuto.tp3.Users;
import tuto.tp3.UsersRepository;

/**
 * @author moi
 *
 */
public class ProcessingUser implements Strategy<Users> {

	@Autowired
	private UsersRepository userRepo;

	@Override
	public Users processing(Users user) {
		System.out.println("traitement des users");
		 Optional<Users> userFromDb = userRepo.findById(user.getUserId());
			if(userFromDb.isPresent()) {
				user.setAccount(user.getAccount().add(userFromDb.get().getAccount()));
			}
			return user;
	}

}
