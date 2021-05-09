FROM maven:3.8.1-openjdk-16 as build

WORKDIR /home/app

COPY pom.xml /home/app/pom.xml

RUN mvn dependency:go-offline -B --fail-never

ADD src/ /home/app/src

RUN mvn package

FROM amazoncorretto:16-alpine

WORKDIR /home/app

COPY --from=build /home/app/target/bookstore-1.0.0-SNAPSHOT.jar /home/app/bookstore-1.0.0-SNAPSHOT.jar

EXPOSE 8090

ENTRYPOINT java -jar /home/app/bookstore-1.0.0-SNAPSHOT.jar