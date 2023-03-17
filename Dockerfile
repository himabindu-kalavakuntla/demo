FROM openjdk:8
EXPOSE 8080
ADD build/libs/demo-images.jar demo-images.jar
ENTRYPOINT ["java","-jar", "/demo-images.jar"]
