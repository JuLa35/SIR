# SIR : Projet d'application type Doodle

## Sujet :

<p>L’objectif du projet est de construire une application de prise de RDV type doodle mais en y ajoutant un certain nombre de services. L’idée est de partir de la création d’un sondage par un utilisateur sur un choix de dates pour une réunion ayant au moins un intitulé et un résumé. Les participants au sondage renseignent leur nom, leur prénom et leur mail (ils participent au sondage au travers d’un lien Web unique). Quand le créateur du sondage valide une date, si la date contient une pause déjeuner (ou pause),  les utilisateurs reçoivent automatiquement un mail avec un lien unique pour renseigner leur préférence alimentaire et leurs allergies. L’application envoie aussi un mail avec un clear code qui contient un code qui pourra être demandé pour entrer dans le bâtiment et un lien vers un pad qui permettra de partager les notes de réunion. Le pad sera un service tierce. </p>
<p>Le système doit permettre de sauvegarder l’ensemble des sondages, les choix des participants, les préférences alimentaires des participants, … </p>
<p>L’email servira d’identifiant pour les participants. 
Le pad sera initialisé avec le titre de la réunion et une liste des présents et absents en fonction des réponses au sondage. </p>

### Installation en local

Utilisation du projet :

*Créer une base de données nommée base_16006405 sur votre localhost 
*Lancer le fichier JpaTest.java pour générer les tables (cf desgin.md pour les grands éléments d'architecture )
*Démarrer le serveur Tomcat

```
mvn tomcat7:run
```


