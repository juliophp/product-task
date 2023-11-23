FROM eclipse-temurin:11
ARG JAR_FILE=target/*.jar
EXPOSE 8080
COPY ./target/product-task-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]