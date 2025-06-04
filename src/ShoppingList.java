import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<Article> liste = new ArrayList<>();

    public void ajouter(Article article) {
        liste.add(article);
    }

    public void afficher() {
        System.out.println("Votre liste de courses :");
        for (Article a : liste) {
            System.out.println("- " + a);
        }
    }
}
