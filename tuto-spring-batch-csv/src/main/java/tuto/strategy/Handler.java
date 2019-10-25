package tuto.strategy;

public class Handler<T> {

	IData<T> IdataProvider;
	Strategy<T> IProcessing;
	/**
	 * @param idataProvider
	 * @param iProcessing
	 */
	public Handler(IData<T> idataProvider, Strategy<T> iProcessing) {
		super();
		IdataProvider = idataProvider;
		IProcessing = iProcessing;
	}
	
	public void GetDataAndApplyProcessing()
	{
		IProcessing.processing(IdataProvider.getData());
	}
}
