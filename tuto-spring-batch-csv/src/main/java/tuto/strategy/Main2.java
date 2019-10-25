package tuto.strategy;


import tuto.tp3.Users;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDataUser idataProvider=new IDataUser();
		ProcessingUser iProcessing=new ProcessingUser();
		
		Handler<Users> em=new Handler<Users>(idataProvider, iProcessing);
		em.GetDataAndApplyProcessing();
	}

}
