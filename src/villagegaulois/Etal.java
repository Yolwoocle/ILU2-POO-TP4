package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal<P extends Produit> implements IEtal<P> {
	private Gaulois vendeur;
	private P produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;

    @Override
	public void installerProduit(P produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }
	
	@Override
	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	@Override
	public P getProduit() {
		return produit;
	}

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	@Override
	public int getQuantite() {
		return quantite;
	}

    @Override
	public String decrireEtal() {
        if (produit == null) {
            return "Étal vide.";
        }
        return "Étal de " + produit.getNom() + " : " + quantite + " " + produit.getUnite().getLabel();
    }
}
