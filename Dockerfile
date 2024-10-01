FROM openjdk:17

ADD target/docker-simple-project.jar docker-simple-project.jar
# COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "app.jar" ]