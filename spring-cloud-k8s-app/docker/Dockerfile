FROM maven:3.6.1-jdk-8 AS builder

COPY pom.xml /app/pom.xml

WORKDIR /app
RUN mvn clean install || :

COPY . /app
RUN mvn clean install && \
    mv /app/target/demo-*.jar /app/target/demo.jar

FROM openjdk:8

COPY --from=builder /app/target/demo.jar /app/demo.jar
EXPOSE 8080
CMD java -jar /app/demo.jar
