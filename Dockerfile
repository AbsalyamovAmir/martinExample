FROM adoptopenjdk:11-jre-hotspot
RUN mkdir -p /opt/example
COPY /target/example-*.jar /opt/example/example-app.jar
WORKDIR /opt/example
ENTRYPOINT java -jar example-app.jar