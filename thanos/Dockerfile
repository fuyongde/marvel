FROM openjdk:8u212-jdk-alpine

LABEL maintainer="fuyongde@foxmail.com"

VOLUME [ "/tmp" ]

EXPOSE 8080

ARG JAR_FILE=target/thanos-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} thanos-0.0.1.jar

ENTRYPOINT [ "java", "-jar", "/thanos-0.0.1.jar" ]