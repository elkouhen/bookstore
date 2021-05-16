# syntax = docker/dockerfile:experimental
FROM maven:3.8.1-openjdk-16 as build

WORKDIR /home/app

COPY pom.xml /home/app/pom.xml

RUN --mount=type=cache,target=/root/.m2  mvn dependency:go-offline

ADD src/ /home/app/src

RUN --mount=type=cache,target=/root/.m2 mvn package

EXPOSE 8090

ENTRYPOINT java -jar /home/app/target/bookstore-1.0.0-SNAPSHOT.jar
