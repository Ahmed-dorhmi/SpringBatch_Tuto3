package tuto.dp;



import tuto.t2.User;

public class StrategyTraitement1 implements ProcessingStratgy<User>{

	@Override
	public void traitement(User data) {
		System.out.println("user processing");
		
	}

	
	

}
