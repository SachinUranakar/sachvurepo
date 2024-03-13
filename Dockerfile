# define base docker image
FROM openjdk:17
LABEL maintainer="sachinspring.net"
ADD target/demo.springmongo-0.0.1-SNAPSHOT.jar spring-docker.jar
ENTRYPOINT [ "java" , "-jar", "spring-docker.jar" ]
ENV MONGODB_URI="mongodb://sachinvu99:n8cquGZvlmO9k8wS@ac-aaiguqo-shard-00-02.j4zsfhe.mongodb.net:27017,ac-aaiguqo-shard-00-00.j4zsfhe.mongodb.net:27017,ac-aaiguqo-shard-00-01.j4zsfhe.mongodb.net:27017/Myspringproject?ssl=true&retryWrites=true&loadBalanced=false&replicaSet=atlas-nt3p6s-shard-0&readPreference=primary&connectTimeoutMS=10000&authSource=admin&authMechanism=SCRAM-SHA-1"
