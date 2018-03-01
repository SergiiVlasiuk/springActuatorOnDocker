FROM openjdk:10
ADD build/libs/docker-spring-boot-0.0.1-SNAPSHOT.jar docker-spring-boot.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
