# shoppinglistjava
Création de liste de courses en Java

Le programme actuel est composé de 4 classes :
- Article
  Contient les méthodes permettant de récupérer le nom de l'article à ajouter à la liste

- BaseArticles
  C'est la base de données qui contient tous les articles qu'on pourra ajouter à la liste de courses

- ShoppingList
  Contient les méthodes permettant de créer la liste de courses, d'y ajouter un article, et de l'afficher

- Main
  Dans le main, on a un menu qui permet de faire plusieurs choses :
  - créer une nouvelle liste de courses 
  - consulter la liste de courses actuelle
  - ajouter un article à la liste de courses actuelle
  - afficher les articles présents dans la base de données
  - quitter le programme en affichant une dernière fois la liste de courses actuelle


Les prochaines implémentations à prévoir seront : 
- pouvoir sauvegarder l'état de la base de données à la fermeture du programme (pour qu'elle contienne les articles ajoutés précédemment à la main, car la base de données initiale ne contient que 4 articles pour le test)
- pouvoir sauvegarder des listes de courses (avec dans le nom, la date et l'heure de création de la liste)
- pouvoir rouvrir des listes de courses sauvegardées précédemment
