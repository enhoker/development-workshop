FROM alpine

RUN apk update
RUN apk add openjdk11
EXPOSE 9001

ARG JAR_FILE=target/DockerCompose_Client-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} DockerCompose_Client.jar
ENTRYPOINT ["java", "-jar", "/DockerCompose_Client.jar"]