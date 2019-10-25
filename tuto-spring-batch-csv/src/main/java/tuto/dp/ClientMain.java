package tuto.dp;

import tuto.t2.User;

public class ClientMain {

	public static void main(String[] args) {
		DataFile<User> fuser=new DataFile<>();
		fuser.traitement(new StrategyTraitement1());
		
		DataFile<Commande> fcmd=new DataFile<>();
		fcmd.traitement(new StrategyTraitement2());
		
		System.out.println("************");
		DataHandler<User> dh=new DataHandler<>(new StrategyTraitement1(), new Dataprovider_user());
		dh.GetAndtraitement();

	}

}
