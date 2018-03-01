
# Dockerfile

### FROM openjdk:10

import from docker repo open jdk, [see](https://hub.docker.com/_/openjdk/) 

### ADD build/libs/docker-spring-boot-0.0.1-SNAPSHOT.jar docker-spring-boot.jar

instruction for docker to build image

### EXPOSE 8083

docker provides info about accessible ports.
The port 8083 is used by spring boot (see application.yml)

### ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]

The docker instructions to start contained jar file.


# Terminal

### gradle build
build the project

### docker build -f Dockerfile -t docker-spring-boot .

build the docker image from project root directory

### docker images
check all local images

### docker run -p 8085:8083 docker-spring-boot
start docker contained app with external port 8085

application will be accessible on by url:
**http://localhost:8085/docs/** - actuator docs
