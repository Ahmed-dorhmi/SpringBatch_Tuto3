package tuto.dp;

import java.util.List;

public class DataFile<T> {

	T data;
	
	
	/**
	 * 
	 */
	public DataFile() {
		
	}


	public void traitement(ProcessingStratgy<T> methode)
	{
		methode.traitement(data);
	}
}
