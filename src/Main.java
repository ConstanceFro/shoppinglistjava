import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseArticles base = new BaseArticles(); //pour créer le nouvel article dans la base quand il n'existe pas
        ShoppingList liste = null; // aucune liste tant que l'utilisateur n'en crée pas

        //déclaration d'un booléen "continue" qui déterminera si on sort de la boucle "while" ci-dessous, donc si on met fin au programme
        boolean execution = true;

        //boucle d'exécution du programme
        while (execution) {
            System.out.print("\nQue souhaitez-vous faire ? \n" +
                    "1 pour créer une nouvelle liste de courses\n" +
                    "2 pour consulter la liste de courses actuelle\n" +
                    "3 pour ajouter un article à la liste de courses actuelle\n" +
                    "4 pour afficher les articles présents dans la base de données\n" +
                    "5 pour charger une liste de courses précédente (en cours d'implémentation)\n" +
                    "6 pour quitter\n" +
                    "Votre choix : ");

            //récupération du choix de l'utilisateur avec scanner
            String choix = scanner.nextLine();

            //séletion d'une action en fonction de ce qui est choisi par l'utilisateur avec switch
            switch (choix) {
                case "1":
                    liste = new ShoppingList();
                    System.out.println("Nouvelle liste de courses créée.");
                    break;

                case "2":
                    if (liste == null) {
                        System.out.println("La liste actuelle est vide.");
                    } else {
                        liste.afficher();
                    }
                    break;

                case "3":
                    if (liste == null) {
                        System.out.println("Vous devez d’abord créer une liste.");
                        break;
                    }
                    System.out.print("Entrez le nom de l'article à ajouter : ");
                    //on met les noms des articles en minuscules pour éviter d'avoir deux fois la même chose (comme "Patate" et "patate")
                    String nomArticle = scanner.nextLine().trim().toLowerCase();

                    if (base.articleexistant(nomArticle)) {
                        liste.ajouter(new Article(nomArticle));
                        System.out.println("Article ajouté à la liste.");
                    } else {
                        System.out.print("L'article n'existe pas. Voulez-vous l'ajouter à la base ? (O/N) : ");
                        String reponse = scanner.nextLine().trim().toLowerCase();
                        if (reponse.equals("o")) {
                            base.ajouter(nomArticle);
                            liste.ajouter(new Article(nomArticle));
                            System.out.println("Article ajouté à la base et à la liste.");
                        } else {
                            System.out.println("Article ignoré.");
                        }
                    }
                    break;

                case "4":
                    System.out.println("Chargement de la liste d'articles présents dans la base de données'");
                    base.afficher();
                    break;

                case "5":
                    System.out.println("Chargement de la liste de courses précédente (en cours d'implémentation - non fonctionnel pour l'instant)");
                    break;

                case "6":
                    if (liste != null) {
                        System.out.println("Avant de partir, voici votre liste de courses");
                        liste.afficher();
                    }
                    execution = false;
                    System.out.println("Au revoir !");
                    break;
                    //ici lorsque j'aurai implémenté la possibilité de charger une liste de courses précédente, j'ajouterai la possibilité de sauvegarder la liste de courses en cours également. C'est plus compliqué à faire que ce que je pensais...

                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 5.");
            }
        }

        scanner.close();
    }
}
