FROM openjdk:17

EXPOSE 8080
COPY target/dockerDemo-0.0.1-SNAPSHOT.jar dockerDemo.jar
ENTRYPOINT ["java","-jar","/dockerDemo.jar"]