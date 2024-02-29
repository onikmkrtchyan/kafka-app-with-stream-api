# Kafka app with Spring Boot and stream API (Java 17)

## Description

- Producer App used produce the data from wikimedia API and send it to the Kafka topic.
- Consumer App used to consume the data from the Kafka topic and store it in the database.
- The project uses Docker to run Kafka and Zookeeper.
- The project uses Docker Compose to run Kafka and Zookeeper.
- The project uses Lombok to reduce boilerplate code.

## For testing locally
- Install Docker if you don't have it
- Install mysql if you don't have it
- Run the Kafka and Zookeeper using Docker Compose
  ```docker-compose up -d```
- Run the Kafka Producer App
- Run the Kafka Consumer App
- watch the logs of the apps to see the data flow