FROM openjdk:8
EXPOSE 8080
ADD build/libs/demo-images-0.0.1-SNAPSHOT.jar demo-images-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/demo-images-0.0.1-SNAPSHOT.jar"]
