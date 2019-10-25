/**
 * 
 */
package tuto.strategy.pre;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import tuto.tp3.Users;

/**
 * @author moi
 *
 */
public class DataPreparation2 implements FieldSetMapper<Users>{

	@Override
	public Users mapFieldSet(FieldSet fieldSet) throws BindException {
		Users u=new Users();
		u.setUserId(fieldSet.readLong(0));
		u.setName(fieldSet.readString(1));
		u.setDept(fieldSet.readString(2));
		return u;
	}

}
