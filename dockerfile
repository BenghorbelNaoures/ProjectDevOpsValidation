FROM openjdk:11
WORKDIR /app
COPY target/*.jar .
EXPOSE 5000
CMD ["java", "-jar", "tpAchatProject.jar"]