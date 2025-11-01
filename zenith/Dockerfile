FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/zenith*.jar /app/zenith.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/zenith.jar"]