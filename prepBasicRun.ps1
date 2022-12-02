# Commandes Java pour compiler et lancer prep.Run. Les autres fichiers de code
# source dans le package prep seront également compilés.
#
# USAGE : simplement taper `.\prepRun.ps1` dans Powershell à partir de ce dossier
# 
#     Sur Bash ou Zsh, taper `chmod +x ./prepRun.ps1` avant la première utilisation 
#     pour rendre le script exécutable.
#

javac ./prep/basic/*.java
java prep.basic.Run

# Note 1 : si tous les fichiers sont déjà compilés, c'est plus vite de simplement
# lancer `java prep.Run` au lieu de lancer ce script

# Note 2 : parce que la classe principale qu'on veut lancer se trouve dans un 
# sous-package, il faut spécifier le nom "pleinement qualifié" ou le nom complet 
# de la classe, soit [package].[Classe], dans ce cas prep.Run