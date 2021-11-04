FROM openjdk

RUN mkdir /app

COPY target/ /app

WORKDIR /app/classes

CMD java com.jautomation.conveyor.example.Main