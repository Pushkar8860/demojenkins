FROM openjdk:17
EXPOSE 8081
ADD target/jenkins-cicd.jar jenkins-cicd.jar
ENTRYPOINT [ "java", "-jar", "/jenkins-cicd.jar" ]
