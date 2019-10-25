package tuto.dp;

public class DataHandler<T> {

	ProcessingStratgy<T> traitement;
	IDataProvider<T> dataprovider;
	/**
	 * @param traitement
	 * @param dataprovider
	 */
	public DataHandler(ProcessingStratgy<T> traitement, IDataProvider<T> dataprovider) {
		super();
		this.traitement = traitement;
		this.dataprovider = dataprovider;
	}
	
	public void GetAndtraitement()
    {
		T data = dataprovider.getData();
		traitement.traitement(data);
    }
}
