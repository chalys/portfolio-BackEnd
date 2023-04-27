FROM amazoncorretto:1.8-alpine-jdk
MAINTAINER Carlos_Arando
COPY target/cral-0.0.1-SNAPSHOT.jar cral-app.jar
ENTRYPOINT ["java","-jar","/cral-app.jar"]