
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /myapp/src
COPY pom.xml /myapp
COPY myapp.js /myapp
WORKDIR /myapp
RUN mvn clean package
RUN mvn exec:java -Dexec.mainClass=ru.sbt.mipt.oop.Main

FROM openjdk:11-jre-slim
COPY --from=build /myapp/target/myapp.0-SNAPSHOT.jar /myapp/target/myapp.0-SNAPSHOT.jar

WORKDIR /myapp/target
ENTRYPOINT ["java" "-cp" "myapp.0-SNAPSHOT.jar ru.sbt.mipt.oop.Main"]
