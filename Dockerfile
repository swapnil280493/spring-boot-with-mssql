FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-data-rest.jar spring-boot-data-rest.jar
ENTRYPOINT ["java","-jar","spring-boot-data-rest.jar"]
