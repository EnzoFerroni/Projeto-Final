# Dockerfile para o Back-End em Spring Boot
FROM openjdk:11-jre-slim

# Copia o JAR gerado para dentro do container
COPY target/minha-biblioteca-backend.jar /app.jar

# Expõe a porta 25000
EXPOSE 25000

# Executa a aplicação
CMD ["java", "-jar", "/app.jar"]