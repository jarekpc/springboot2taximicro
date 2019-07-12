FROM openjdk:8-jdk-alpine
VOLUME /tmp

ADD spring-boot-2-taxi-book-service-1.0-SNAPSHOT.jar app.jar

RUN sh -c 'touch /app.jar'

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]