![Le logo de Framasoft](https://framasoft.org/nav/img/logo.png "TP Démineur")

# **TP Mon Super Démineur**

## **Use Cases**
| User              | Action          | Résultat attendu |
| :----------------:|:---------------:| ----------------:|
| Joueur 1    | Début de partie      | Grille générée + initialisation du menu et nombres aléatoire des mines + bar de statut et nombres de mines|
|                  |                 |                  |
|                  |                 |                  |

## **Procédure**

### **1.1 Classe Main**
* Classe principale main, point d'entrée de l'application qui contient la méthode static main qui définit la méthode de "look and feel" qui force l'utilisation du thread (tuyau) courant
* Utilisation de la méthode Look and feel de swing UIManager
* Try catch en cas d'erreur au chargement de l'application

### **1.2 Classe FenetrePrincipale**
* Classe générique, qui regroupe l'ensemble des propriétés de la fenêtre principale de l'application
* Utilisation de swing et awt pour construire le visuel de la fenêtre, son menu et sa barre de statut

### **1.3 ZoneDemineur**
* Classe "canvas" qui génère une grille grâce à awt et swing qui génère des bouttons dans cette dernière
* Implémentation de la classe RandomMines dans la grille précédemment générée afin de remplir alétoirement la grille de boutons avec une valeur booléenne correspondant à la présence des mines
