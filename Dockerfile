FROM openjdk:21
WORKDIR /app
COPY target/ms-prueba-icatec-0.0.1-SNAPSHOT.war app.war
CMD ["java", "-jar", "app.war"]
