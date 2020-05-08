FROM openjdk:8
MAINTAINER Parth Trehan parthendo@iiitb.org
COPY ./target/Devops-Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Devops-Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
