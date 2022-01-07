FROM openjdk:16
COPY ./target/testdockerboot-0.0.1-SNAPSHOT.jar testdockerboot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar","testdockerboot-0.0.1-SNAPSHOT.jar"]