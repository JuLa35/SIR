# SIR : Projet d'application type Doodle

## Sujet :

<p>L’objectif du projet est de construire une application de prise de RDV type doodle mais en y ajoutant un certain nombre de services. L’idée est de partir de la création d’un sondage par un utilisateur sur un choix de dates pour une réunion ayant au moins un intitulé et un résumé. Les participants au sondage renseignent leur nom, leur prénom et leur mail (ils participent au sondage au travers d’un lien Web unique). Quand le créateur du sondage valide une date, si la date contient une pause déjeuner (ou pause), les utilisateurs reçoivent automatiquement un mail avec un lien unique pour renseigner leur préférence alimentaire et leurs allergies. L’application envoie aussi un mail avec un clear code qui contient un code qui pourra être demandé pour entrer dans le bâtiment et un lien vers un pad qui permettra de partager les notes de réunion. Le pad sera un service tierce. </p><p>Le système doit permettre de sauvegarder l’ensemble des sondages, les choix des participants, les préférences alimentaires des participants, … </p><p>L’email servira d’identifiant pour les participants. 
Le pad sera initialisé avec le titre de la réunion et une liste des présents et absents en fonction des réponses au sondage. </p>

### Installation en local

Utilisation du projet :

* Créer une base de données nommée base_16006405 sur votre localhost 
* Lancer le fichier JpaTest.java pour générer les tables (cf desgin.md pour les grands éléments d'architecture )
* Démarrer le serveur Tomcat par la commande suivante :

```
mvn tomcat7:run
```
Par défault le port utilisé est le **8043**.

## La page d'accueil : index.html

Pour accèder à la page d'acceuil du projet : localhost:8043 
<p>Sur la page d'accueil on retrouve les liens pour l'ajout d'un utilisateur via <strong>S'enregistrer</strong> ainsi que la création d'un sondage via <strong>Créer un sondage</strong> qui renvoie aux lien suivants :<p>
<p>Pour accèder à l'ajout d'un utilisateur dans la bdd : localhost:8043/myform.html</p>
<p>Pour accèder à l'ajout d'un sondage dans la bdd : localhost:8043/mysondage.html</p>

## Fonctionnalité encore à développer :

Plusieurs éléments de notre application ne sont pas encore disponibles, dont voici les principaux.

### Rest :

L'ajout de rest afin de gérer des urls tels que :

* */rest/user* pour afficher tous les utilisateurs
* */rest/user/{id}* pour afficher l'utilisateur avec l'id {id}
* */rest/removeUser/{id}* pour supprimer l'utilisateur avec l'id {id}
* */rest/sondage* pour afficher tous les sondages
* */rest/removeSondage/{id}* pour supprimer le sondage avec l'id {id}
* */rest/sondage/{id}* pour afficher le sondage avec l'id {id}





