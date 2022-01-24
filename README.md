# Projet Java : Air France

# Prérequis
<ul>
    <li><a href="https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-12/R/eclipse-inst-jre-win64.exe" target="_blank">Eclipse IDE for Java Developers</a></li>
    <li>mysql-connector-java.jar <i>(Présent dans le projet)</i></li>
    <li>Éditeur de code <i>(Sublime Text, Visual Studio Code, ...)</i></li>
    <li>Serveur local <i>(WampServer, XAMPP, LAMP, MAMP, ...)</i></li>
</ul>

# Eclipse : Activer le Dark Mode
<ol>
    <li>Window</li>
    <li>Preferences</li>
    <li>> General</li>
    <li>> Appearance</li>
    <li>Theme: <b>Dark</b></li>
    <li>Cliquer en bas à droite sur <b>Restart</b></li>
</ol>

# Eclipse : Importer le Projet
<ol>
    <li>Téléchargez et décompressez l'archive</li>
    <li>Retirez <b>-master</b> du nom du dossier</li>
    <li>Déplacez le projet Java <i>(décompressé)</i> dans votre dossier <b>workspace</b> utilisé pour vos projet Java</li>
    Sur Eclipse : 
    <li>File -> New -> Java Project -> [Saisir le nom <u>exacte</u> du projet Java] -> Finish -> <u>Don't Create</u></li>
    <li>Faites un clique droit sur le nom du projet Java -> Properties -> Java Build Path</li>
    <li>Allez dans <b>Librairies</b></li>
    <li>Cliquez sur <b>Modulepath</b> -> mysql-connector-java- -> Remove</li>
    <li>Cliquez sur <b>Modulepath</b> -> Add External JARs... -> [Recherchez le votre fichier mysql-connector-java.jar]</li>
    <li>Toujours dans <b>Modulepath</b> -> Cliquez sur <u>JRE System Library</u> -> Edit... -> Execution environnement: <u>JavaSE-1.8 (jdk- 15.0.2</u> -> Finish -> Apply and Close</li>
</ol>

# Eclipse : Base de données SQL
<ol>
    <li>Affichez les dossiers présents dans le projet Java</li>
    <li>Déployez le dossier <b>src</b></li>
    <li>Puis <b>sql</b></li>
    <li>Doublie cliquez sur le fichier <b>airfrance.sql</b> pour l'ouvrir avec un éditeur de code</li>
    <li>Démarrez votre serveur local</li>
    <li>Ouvrez la console MariaDB / MySQL</li>
    <li>Copiez collez la base dans la console</li>
</ol>

# Eclipse : Démarrer le projet
<ol>
    <li>Allez dans le controleur <i>(AirFrance/src/controleur)</i></li>
    <li>Double cliquez sur <b>AirFrance.java</b></li>
    <li>Cliquez sur <b>Play</b> <i>(vert)</i> en haut</li>
</ol>
La console va alors s'ouvrir...

Bon visionnage !

# Droit d'auteur
&copy; Copyright 2022 | Tom BRUAIRE<br>
Tout droits réservés
