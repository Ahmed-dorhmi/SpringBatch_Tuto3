package tuto.strategy;

import org.springframework.stereotype.Service;

@Service
public class AppContext<T> {

	T data;
	
	
	public void apply(Strategy<T> strategy)
	{		
		strategy.processing(data);
	}
}
