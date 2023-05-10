FROM openjdk:11
COPY target/SpringBoot_Project-0.0.1-SNAPSHOT.jar SpringBoot_Project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringBoot_Project-0.0.1-SNAPSHOT.jar"]