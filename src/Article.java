public class Article {
    //pour créer un nouvel article à ajouter à la BaseArticles (base de données de l'application)
    private String nom;

    public Article(String nom) {
    this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
        }
}
