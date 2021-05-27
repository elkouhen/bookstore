# syntax = docker/dockerfile:experimental
FROM maven:3.8.1-openjdk-16

WORKDIR /home/app

COPY pom.xml /home/app/pom.xml

RUN --mount=type=cache,target=/root/.m2  mvn dependency:go-offline

ADD src/ /home/app/src

RUN --mount=type=cache,target=/root/.m2 mvn package

ENTRYPOINT java -jar /home/app/target/bookstore-1.0.0-SNAPSHOT.jar
