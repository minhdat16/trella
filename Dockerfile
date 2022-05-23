FROM maven:3.8.3-openjdk-11
ENV HOME=/home/usr/app
WORKDIR $HOME
ADD pom.xml $HOME
RUN mvn dependency:go-offline
ADD . $HOME
RUN mvn package
EXPOSE 8080
ENTRYPOINT ["mvn", "spring-boot:run"]

# FROM openjdk:11
# ADD target/trella-be-app.jar trella-be-app.jar
# ENTRYPOINT ["java", "-jar", "trella-be-app.jar"]