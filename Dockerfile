FROM eclipse-temurin:24-alpine
WORKDIR /dockerlearning
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /dockerlearning/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]