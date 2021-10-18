FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-tutorial.jar spring-boot-tutorial.jar
ENTRYPOINT ["java","-jar","/spring-boot-tutorial.jar"]
