Ramasamy, Sanjai - Guido

### Réponses aux questions du TP

**1. Vous devrez préalablement supprimer le dossier `.git` qui se trouve dans le projet que vous avez cloné. Pourquoi ?**
Il faut supprimer ce dossier pour détacher le projet de son dépôt GitHub d'origine (celui du professeur). Cela permet d'initialiser du coup d'avoir un nouveau dépôt Git propre afin de pouvoir le synchroniser avec mon propre dépôt privé sans importer l'historique de l'enseignant.

**2. Observez les dépendances qui se trouvent dans le fichier `build.gradle`, à quoi correspondent-elles ?**
Ces dépendances correspondent aux bibliothèques nécessaires pour développer et exécuter les tests unitaires du projet :
- `junit-jupiter-api` (5.8.2) : Fournit l'API de base de JUnit 5 (tout ce qui est annotations, assertions de base) pour écrire les tests.
- `junit-jupiter-engine` (5.8.2) : C'est le moteur d'exécution qui utilisé pour lancer les tests.
- `assertj-core` (3.22.0) : Une bibliothèque d'assertions qui permet d'écrire des vérifications.
