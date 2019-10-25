/**
 * 
 */
package tuto.strategy;

import tuto.dp.Commande;
import tuto.t2.User;
import tuto.tp3.Users;

/**
 * @author moi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AppContext<Users> appuser=new AppContext<>();
		Strategy<Users> strategy=new ProcessingUser();
		appuser.apply(strategy);
		
		AppContext<Commande> appcmd=new AppContext<>();
		appcmd.apply(new ProcessingCommande());

	}

}
