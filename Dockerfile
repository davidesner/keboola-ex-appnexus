FROM maven:3.5.2-jdk-8-slim   
MAINTAINER David Esner <esnerda@gmail.com>

ENV APP_VERSION 1.1.0
# install git
RUN apt-get update -y
RUN apt-get install -y git-core

# set switch that enables correct JVM memory allocation in containers
ENV JAVA_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Xmx700m"
ENV MAVEN_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Xmx700m"

WORKDIR /home
COPY . ./
RUN mvn compile

ENTRYPOINT mvn -q exec:java -Dexec.args=/data  