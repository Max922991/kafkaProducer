FROM openjdk:21-jdk-slim

COPY pom.xml /app/pom.xml
WORKDIR /app
RUN apt-get update && apt-get install -y maven

COPY src/ /app/src

RUN mvn package

CMD ["java", "-jar", "target/kafkaProducer-0.0.1-SNAPSHOT.jar"]
