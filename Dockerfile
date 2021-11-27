FROM openjdk:8

RUN mkdir /app

COPY ./target/JAutomation-1.0-SNAPSHOT-jar-with-dependencies.jar app/app.jar
WORKDIR /app

ENTRYPOINT ["java","-jar","app.jar"]
