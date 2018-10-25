FROM java:openjdk-8-jdk-alpine

ADD target/*.jar /app.jar

RUN sh -c 'touch /app.jar'

VOLUME /tmp

CMD ["java", "-jar", "/app.jar", "--spring.profiles.active=local"]

EXPOSE 8080