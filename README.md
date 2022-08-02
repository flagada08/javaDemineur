![Le logo de Framasoft](https://framasoft.org/nav/img/logo.png "TP Démineur")

# **TP Mon Super Démineur**

## **Use Cases**
| User              | Action          | Résultat attendu |
| :----------------:|:---------------:| ----------------:|
| Joueur 1    | Début de partie      | Grille générée + initialisation du menu et nombres aléatoire des mines renseignées dans la bar de status|
|                  |                 |                  |
|                  |                 |                  |

## **Procédure**

### **1.1 Classe Main**
* Classe principale main, point d'entrée de l'application qui contient la méthode static main qui définit la méthode de "look and feel" qui force l'utilisation du thread (tuyau) courant
* Utilisation de la méthode Look and feel de swing UIManager
* Try catch en cas d'erreur au chargement de l'application
