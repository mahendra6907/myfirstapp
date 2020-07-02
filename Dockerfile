FROM openjdk:8
EXPOSE 7080
ADD target/my-first-app.jar my-first-app.jar
ENTRYPOINT ["java", "-jar", "/my-first-app.jar"]