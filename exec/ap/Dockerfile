FROM eclipse-temurin:21.0.4_7-jdk
ADD target/api-demo-0.0.1-SNAPSHOT.jar /opt/ap/api-demo.jar
EXPOSE 8080
WORKDIR /opt/ap/
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "api-demo.jar"]
