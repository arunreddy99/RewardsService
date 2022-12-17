# Rewad Service
## _Calculate reward point for the transactions._



[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Reward service is a spring boot based microservice based project which exposed the set of API with authentication and security implemented for the transaction to calculate the reward points.
Application has been build by using the follwoing tech stack.

- Spring Boot
- Spring Security
- JDK 8
## Features

- Get total reward for each customerby customer  id
- Get last 3 months rewards
- Get all the transactions
- Add the transactions
- API endpoints are secured with base 64 in memory authentications.


## Tech

Dillinger uses a number of open source projects to work properly:

- [Spring] - Web app is based on the spring framework
- [Spring boot] - API has been exposed by using the inbuild apachae tocat server in spring boot
- [JAVA] - Application is based on java JDK 8 version.


## Installation

Dillinger requires [Node.js](https://nodejs.org/) v10+ to run.

Install the dependencies and devDependencies and start the server.

```sh
cd projectdirectory
mvn clean install
java -jar rewardservice-0.0.2-snapshot.jar
```

For production environments...

```sh
cd projectdirectory
mvn clean install
java -jar rewardservice-0.0.2-snapshot.jar
```
test
```
your preferred browser.
http://localhost:8081/api/rewards/getRewards/last3Months
with basic auth header base 64 encoded header
