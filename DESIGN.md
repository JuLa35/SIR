# Design
Ce fichier contient l'architecture globale du projet SIR : doodle

## Architecure du projet :
 
 Tout d'abord la présentation rapide des différentes classes du projets utilisées dans le code Java. Puis les différentes librairies et différents Frameworks.
 
### Les classes :

  Pour la réalisation de ce projet nous avons utilisé les classes suivantes :
  * *User* : Caractérisé par un Id,nom,prenom,mail
  * *Createur* : Le créateur d'un sondage (idUser, idSondage)
  * *Present* : Un user présent dans un sondage pour une réunion à une date d (idUser, idSondage, idReunion, idDate)
  * *Sondage* : Un sondage qui reprend une liste de présent, un créateur des dates de réunions ainsi que l'intitulé et le résumé de la réunion
  * *DateReu* : La date d'une réunion r dans un sondage s
  * *Reunion* : Une réunion r avec un intitulé, un resumé, un mail clear, un mail aliment, un pad et une liste de present.
  * *MailClear* : contient le clear code d'une reunion r
  * *MailAliment* : contient les prefenrences alimentaires des present d'une reunion r
  * *Pad* : le pad d'une reunion r qui permet de résumé une reunion r qui a eu lieu.
  
  ### JPA et Hibernate
  
  Pour la génération de la bdd nous utilisons Java Persistence API dans l'objectif d'automatiser cette génération pour une installation plus rapide sur un nouvel environnement.
  Les Tables présentes dans la bdd sont les même que les classes ci-dessus. La connexion avec la bdd s'effectue grâce à hibernate qu'il faut configurer préalablement avec la base de données.
  
  ### Servlet et Tomcat7
  
  Afin de créer un site web pour notre application nous utilisons les servlet de javax. Ainsi nous pouvons effectuer des methodes POST ou GET avec la BDD afin de la remplir. la méthode Tomcat7:run permet de lancer les servlets
  
  ### Rest
  
  Maintenant que les jeux de données peuvent être créés, l'utilisation de rest permet de faire parvenir les résultats sous forme de JSON dans le but de récupérer et d'étudier les valeurs présentes dans l'application. Par exemple récupérer tous les utilisateurs, ou tous les sondages ect ..
  
  ### Angular
  
  Et enfin l'utilisation de Angular dans l'objectif de configurer le frontend pour une prise en main rapide des utilisateurs grâce à une ergonomie simple et efficace.
