FROM openjdk:11
EXPOSE 8080
ADD target/tpAchatProject.jar tpAchatProject.jar
Entrypoint ["java", "-jar", "tpAchatProject.jar"]