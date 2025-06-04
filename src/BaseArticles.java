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

    public boolean existe(String nom) {
        return articles.contains(nom.toLowerCase());
    }

    public void ajouter(String nom) {
        articles.add(nom.toLowerCase());
    }

    public Set<String> getTousLesArticles() {
        return articles;
    }
}

