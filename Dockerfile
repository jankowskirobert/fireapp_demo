FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/fireappdemo.jar
COPY ${JAR_FILE} fireappdemo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "fireappdemo.jar"]
