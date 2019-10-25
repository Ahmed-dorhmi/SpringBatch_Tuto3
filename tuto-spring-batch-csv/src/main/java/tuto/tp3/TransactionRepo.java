/**
 * 
 */
package tuto.tp3;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author moi
 *
 */
public interface TransactionRepo extends JpaRepository<Transaction, Long>{

}
