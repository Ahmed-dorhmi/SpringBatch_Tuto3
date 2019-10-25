/**
 * 
 */
package tuto.strategy;


import tuto.tp3.Users;

/**
 * @author moi
 *
 */
public class IDataUser implements IData<Users>{

	@Override
	public Users getData() {
		
		System.out.println("data de type user");
		return new Users();
	}

}
