FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD target/activemapoc-0.0.1-SNAPSHOT.jar activemapoc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/activemapoc-0.0.1-SNAPSHOT.jar"]
