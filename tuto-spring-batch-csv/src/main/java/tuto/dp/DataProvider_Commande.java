package tuto.dp;



public class DataProvider_Commande implements IDataProvider<Commande>{
	Commande cmdes;
	@Override
	public Commande getData() {
		System.out.println("data type commande....");
		return cmdes;
	}

}
