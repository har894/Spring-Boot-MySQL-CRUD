FROM openjdk:11
EXPOSE 8080
ADD target/crud-dockerfile.jar crud-dockerfile.jar
ENTRYPOINT ["java", "-jar", "/crud-dockerfile.jar"]