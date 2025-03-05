# Usar OpenJDK 21 como base
FROM openjdk:21 AS build

# Configurar el directorio de trabajo
WORKDIR /app

# Copiar el código fuente y los archivos de configuración
COPY . .

# Otorgar permisos de ejecución al wrapper de Maven
RUN chmod +x mvnw

# Construir la aplicación con Maven
RUN ./mvnw clean package -DskipTests

# Crear la imagen final
FROM openjdk:21
WORKDIR /app

# Copiar el WAR generado en la imagen final
COPY --from=build /app/target/ms-prueba-icatec-0.0.1-SNAPSHOT.war app.war

# Ejecutar la aplicación
CMD ["java", "-jar", "app.war"]
