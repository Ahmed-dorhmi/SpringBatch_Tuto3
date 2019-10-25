/**
 * 
 */
package tuto.tp4;

import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * @author moi
 *
 */


import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;


import tuto.tp3.Transaction;


public class Reader extends FlatFileItemReader<Transaction> {
	
	
	
	
	@Value("${input.file2}")
	static 
	Resource resource;
	
	public Reader(Resource resource) {
		
		super();
		
		setResource(resource);
		
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setNames(new String[] { "idtransaction", "lieu", "mnt", "type" });
		lineTokenizer.setDelimiter(",");
	        lineTokenizer.setStrict(false);
	    
	        BeanWrapperFieldSetMapper<Transaction> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
                fieldSetMapper.setTargetType(Transaction.class);
               

		DefaultLineMapper<Transaction> defaultLineMapper = new DefaultLineMapper<>();
		defaultLineMapper.setLineTokenizer(lineTokenizer);
		defaultLineMapper.setFieldSetMapper(fieldSetMapper);
		setLineMapper(defaultLineMapper);
		
	}
	
	
}