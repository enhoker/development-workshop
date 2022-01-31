#FROM openjdk:11
FROM alpine
EXPOSE 9002
RUN apk update
RUN apk add openjdk11
ARG JAR_FILE=target/DockerCompose-server-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} DockerCompose-server.jar
ENTRYPOINT ["java", "-jar","/DockerCompose-server.jar"]