FROM openjdk:8

RUN mkdir /app
RUN echo %cd%
WORKDIR .
COPY target/JAutomation-1.0-SNAPSHOT-jar-with-dependencies.jar app/app.jar
WORKDIR /app

ENTRYPOINT ["java","-jar","app.jar"]
