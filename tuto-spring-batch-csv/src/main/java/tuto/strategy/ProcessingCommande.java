/**
 * 
 */
package tuto.strategy;

import tuto.dp.Commande;

/**
 * @author moi
 *
 */
public class ProcessingCommande implements Strategy<Commande> {

	
	@Override
	public Commande processing(Commande data) {
		System.out.println("traitement des commande");
		return data;
	}

}
