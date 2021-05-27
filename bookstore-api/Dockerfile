FROM maven:3.8.1-openjdk-16 as build

WORKDIR /home/app

COPY pom.xml /home/app/pom.xml

RUN mvn dependency:go-offline

ADD src/ /home/app/src

RUN mvn package

ENTRYPOINT java -jar /home/app/target/bookstore-1.0.0-SNAPSHOT.jar
