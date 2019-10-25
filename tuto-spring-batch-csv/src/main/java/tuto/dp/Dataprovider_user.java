package tuto.dp;

import tuto.t2.User;

public class Dataprovider_user implements IDataProvider<User>{

	User u;
	@Override
	public User getData() {
		System.out.println("data type user....");
		return u;
	}

}
