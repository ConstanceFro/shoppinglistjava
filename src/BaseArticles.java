import java.util.HashSet;
import java.util.Set;

public class BaseArticles {
    private Set<String> articles = new HashSet<>();

    public BaseArticles() {
        articles.add("patates");
        articles.add("haricots");
        articles.add("pâtes");
        articles.add("lait");
    }

    public boolean articleexistant(String nom) {
        return articles.contains(nom.toLowerCase());
    }

    public void ajouter(String nom) {
        articles.add(nom.toLowerCase());
    }

    public Set<String> getTousLesArticles() {
        return articles;
    }
    //nouvelle méthode pour pouvoir afficher le contenu de la base de données depuis le main
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
