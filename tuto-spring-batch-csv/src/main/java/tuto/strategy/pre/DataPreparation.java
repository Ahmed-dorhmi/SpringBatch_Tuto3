package tuto.strategy.pre;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.batch.item.file.transform.FieldExtractor;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.validation.BindException;

import tuto.tp3.Users;



public class DataPreparation implements FieldSetMapper<Users>{

	@Override
	public Users mapFieldSet(FieldSet fieldSet) throws BindException {
		Users u=new Users();
		u.setUserId(fieldSet.readLong(0));
		u.setName(fieldSet.readString(1));
		u.setDept(fieldSet.readString(2));
		u.setAccount(fieldSet.readBigDecimal(3));
		
		return u;
	}
	
	
	private LineAggregator<Users> createLineAggregator() {
	    DelimitedLineAggregator<Users> lineAggregator = new DelimitedLineAggregator<>();
	    lineAggregator.setDelimiter(",");

	    FieldExtractor<Users> fieldExtractor = createFieldExtractor();
	    lineAggregator.setFieldExtractor(fieldExtractor);

	    return lineAggregator;
	}

	private FieldExtractor<Users> createFieldExtractor() {
	    BeanWrapperFieldExtractor<Users> extractor = new BeanWrapperFieldExtractor<>();
	    extractor.setNames(new String[] { "Id", "Title", "Description" });
	    return extractor;
	}
	
	
	

}
