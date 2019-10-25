/**
 * 
 */
package tuto.tp3;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author moi
 *
 */
@Entity
@Table(name="Transaction_Batch")
public class Transaction {

	@Id	
	Long idtransaction;
	double mnt;
	String lieu;
	String type;
	/**
	 * @return the idtransaction
	 */
	public Long getIdtransaction() {
		return idtransaction;
	}
	/**
	 * @param idtransaction the idtransaction to set
	 */
	public void setIdtransaction(Long idtransaction) {
		this.idtransaction = idtransaction;
	}
	/**
	 * @return the mnt
	 */
	public double getMnt() {
		return mnt;
	}
	/**
	 * @param mnt the mnt to set
	 */
	public void setMnt(double mnt) {
		this.mnt = mnt;
	}
	/**
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}
	/**
	 * @param lieu the lieu to set
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [idtransaction=" + idtransaction + ", mnt=" + mnt + ", lieu=" + lieu + ", type=" + type
				+ "]";
	}
	
	
	
}
