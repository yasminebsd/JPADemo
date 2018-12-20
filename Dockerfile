FROM maven:3.5-jdk-8
FROM rburgst/java8-openjfx-docker
ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]