# Forty_Group_Assignment

# 🏟️ Sports Betting Settlement Trigger Service

This backend service simulates the handling of sports event outcomes and subsequent bet settlement using **Kafka** for message ingestion and **RocketMQ** (mocked) for bet settlement dispatching. The service exposes an API to publish sports outcomes, processes related bets, and logs settlement messages.

---

## 📦 Features

- ✅ REST API to publish sports event outcomes.
- ✅ Kafka producer to publish event outcomes to a topic (use Apache Kafka version 2.4.1) Link: https://archive.apache.org/dist/kafka/2.4.1/kafka_2.11-2.4.1.tgz 
- ✅ Kafka consumer to listen for event outcomes.
- ✅ Bet settlement logic that filters and processes matching bets.
- ✅ RocketMQ producer (mocked with logging) to simulate settlement dispatch.
- ✅ In-memory database (H2) for bet records.
- ✅ Unit tested with JUnit and Mockito.

---

## 🚀 Technologies

- Java 17
- Spring Boot
- Spring Kafka
- H2 In-Memory DB
- (Mocked) RocketMQ
- JUnit 5 + Mockito

## 📥 API Endpoint

### POST `/api/event/outcome`

Publish a sports event outcome to Kafka.

#### 🔸 Request Body

{
  "eventId": 1,
  "eventName": "Champions League Final",
  "eventWinnerId": 101
}

curl -X POST http://localhost:8080/api/event/outcome ^
  -H "Content-Type: application/json" ^
  -d "{\"eventId\": 1, \"eventName\": \"Champions League Final\", \"eventWinnerId\": 101}"


#### Run all unit tests:

./mvnw test
