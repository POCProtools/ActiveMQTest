FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD target/message-event-registry-test-0.0.1-SNAPSHOT.jar message-event-registry-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/message-event-registry-test-0.0.1-SNAPSHOT.jar"]
