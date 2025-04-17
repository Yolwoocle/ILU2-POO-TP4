package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal<P extends Produit> {

	void installerProduit(P produit, int quantite);

	boolean isEtalOccupe();

	P getProduit();

	Gaulois getVendeur();

	int getQuantite();

	String decrireEtal();

}