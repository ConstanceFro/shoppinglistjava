import java.util.HashSet;
import java.util.Set;

public class BaseArticles {
    private Set<String> articles = new HashSet<>();

    //pour définir une liste d'articles initiale (sans compter ceux qu'on ajoute par la suite)
    public BaseArticles() {
        articles.add("patates");
        articles.add("haricots");
        articles.add("pâtes");
        articles.add("lait");
    }

    //Pour vérifier que l'article qu'on essaie d'ajouter à la liste existe dans la base de données
    public boolean articleexistant(String nom) {
        return articles.contains(nom.toLowerCase());
    }

    //pour ajouter l'article qui n'existe pas encore à la base de données
    public void ajouter(String nom) {
        articles.add(nom.toLowerCase());
    }

    //pour afficher l'ensemble des articles présents dans la base de données depuis le main
    public void afficher() {
        if (articles.isEmpty()) {
            System.out.println("La base d'articles est vide.");
        } else {
            System.out.println("Articles dans la base :");
            for (String article : articles) {
                System.out.println("- " + article);
            }
        }
    }
}
