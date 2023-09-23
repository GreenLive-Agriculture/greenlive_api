# Utilisez une image de base avec Java et Maven préinstallés
FROM maven:3.8.3-openjdk-11-slim AS build

# Copiez le code source dans le conteneur
COPY . /app

# Définissez le répertoire de travail
WORKDIR /app

# Compilez le projet avec Maven
RUN mvn clean install

# Utilisez une image de base avec Java préinstallé
FROM openjdk:11-jre-slim

# Copiez le fichier JAR généré par Maven dans le conteneur
COPY --from=build /app/target/*.jar /app/api_greenlive.jar

# Définissez le répertoire de travail
WORKDIR /app

# Exécutez l'application Spring avec Java
CMD ["java", "-jar", "nom_du_fichier.jar"]