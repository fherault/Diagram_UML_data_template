# Mise à jour des templates après modification du diagrame UML

le jeudi 3 octobre 2019

------

Après modification du diagramme UML il est nécessaire de mettre à jour les templates mis à disposition des utilisateurs.

## 1) exporter le model au format uml.

![](/home/fherault/modelio/workspace/Diagram_UML_data_template/HowTo/PNG/1-exportUML.png)

![](/home/fherault/modelio/workspace/Diagram_UML_data_template/HowTo/PNG/2-exportUML.png)

## 2) Générer les templates

**<u>Remarque:</u>** Nécessite java 8 et ant

1. Se placer dans le répertoire /home/fherault/modelio/workspace/Diagram_UML_data_template/script
2. Ouvrir une fenêtre de commande
3. Lancer le premier script: bash create1.sh
4. Lancer le second script: bash create2.sh
5. Les templates sont générer dans le répertoire: /home/fherault/modelio/workspace/Diagram_UML_data_template/script/template_gen

## 3) Placer les template dans Git

1. Se placer dans le repertoire: /home/fherault/modelio/workspace/Diagram_UML_data_template
2. Ouvrir une fenêtre de commande
3. copier les template généré dans le répertoire template_pegase_v1
   - cp ./script/template_gen/* ./template_pegase_v1/
4. faire un git:
   - git status: pour voir les fichier suivi et non suivis
   - git add pour ajouter des repertores ou fichier
   - git commit -m “mon message” pour soumettre les modif à git
   - git push origin master pour mettre à jour le git

**<u>Remarque:</u>** Le repertoire Script ne doit pas être mis sur le git

## 4) Mise à disposition des templates sur l’apli qualité

Une ligne par template.

![](/home/fherault/modelio/workspace/Diagram_UML_data_template/HowTo/PNG/3-MiseADispoTemplateQualite.png)



**<u>ATTENTION:</u>** Il faut copier l’adresse du téléchargement sans le “https://”

![](/home/fherault/modelio/workspace/Diagram_UML_data_template/HowTo/PNG/4-AdresseTéléchargement.png)