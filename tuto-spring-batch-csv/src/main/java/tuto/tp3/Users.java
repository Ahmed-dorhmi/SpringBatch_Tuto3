/**
 * 
 */
package tuto.tp3;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author moi
 *
 */
@Entity
@Table(name="BatchUser")
public class Users {
 
 @Id
 private Long userId;
 
 private String name;
 
 private String dept;
 
 private BigDecimal account;

/**
 * @return the userId
 */
public Long getUserId() {
	return userId;
}

/**
 * @param userId the userId to set
 */
public void setUserId(Long userId) {
	this.userId = userId;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the dept
 */
public String getDept() {
	return dept;
}

/**
 * @param dept the dept to set
 */
public void setDept(String dept) {
	this.dept = dept;
}

/**
 * @return the account
 */
public BigDecimal getAccount() {
	return account;
}

/**
 * @param account the account to set
 */
public void setAccount(BigDecimal account) {
	this.account = account;
}
 
 
 
}
