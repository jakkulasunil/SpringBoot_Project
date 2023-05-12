FROM openjdk:17-alpine
COPY target/SpringBoot_Project-0.0.1-SNAPSHOT.jar SpringBoot_Project-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/SpringBoot_Project-0.0.1-SNAPSHOT.jar"]
