FROM openjdk:8-alpine

RUN apk update

RUN apk add --no-cache maven

WORKDIR /usr/src/app

COPY . /usr/src/app

RUN mvn install

ENTRYPOINT ["java", "-jar", "target/falgi-0.0.1-SNAPSHOT.jar"]


