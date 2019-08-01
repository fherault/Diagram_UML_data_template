# Diagram_UML_data_template



Ce répertoire correspond au workspace de modelio 3.8 pour développer le diagramme UML des templates de résultats d’analyses basé sur le fichier des analyses et compétences ainsi que sur l’enquête sur les métadonnées.



## Général analysis

5 lignes d’entête:

- Ligne 1 : entête en anglais
- Ligne 2 : entête en français
- Ligne 3 : typage des données
- Ligne 4 : format spécifique de la donnée et spécifier NA si besoin
- Ligne 5: exemple de données

### Mots clés pour les descriptions:

- “desc” = ligne 2 -> nom du champs en français

- “desc1”= ligne 4 -> exemple de format de données attendu

- “desc2”= ligne 5 -> exemple de données 

  

## Mots clé pour les contraintes

- Par principes aucun champs ne peut être vide. 
- Certains champs peuvent recevoir la valeur NA, dans ce cas spécifier dans les contraintes: *“nullable : NA, LD, LQ”*
- les limites de valeurs peuvent être spécifiées dans les contraintes: “min>0”, “min=0”, “max=100”....