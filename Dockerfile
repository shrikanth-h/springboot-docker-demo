FROM eclipse-temurin:17

LABEL   maintainer="Srikanth"

WORKDIR /app

COPY target/springboot-docker-demo-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8081
