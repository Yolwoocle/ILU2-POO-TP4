package produit;

public abstract class Produit {
    protected String nom;
    protected Unite unite;

    public Produit(String nom, Unite unite) {
        this.nom = nom;
        this.unite = unite;
    }

    public String getNom() {
        return nom;
    }

    public Unite getUnite() {
        return unite;
    }

    public abstract String decrireProduit();
    
    public enum Unite {
        GRAMME("g"),
        KILOGRAMME("kg"),
        LITRE("l"),
        CENTILITRE("cl"),
        MILLILITRE("ml"),
        PIECE("pièce");

        private String label;

        Unite(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
}
