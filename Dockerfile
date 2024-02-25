# define base docker image
FROM openjdk:17
LABEL maintainer="sachinspring.net"
ADD target/demo.springmongo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
ENTRYPOINT [ "java","-jar","springboot-docker-demo.jar"]