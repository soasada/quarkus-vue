# Steps to build

_Prerequisites_:

* Maven 3.6.2 or higher
* OpenJDK 13 or higher

1. Build frontend

`mvn -U clean install -pl :quarkus-vue-frontend`

2. Build backend

`mvn -U clean package -pl :quarkus-vue-backend`

3. Build the docker image with:

`docker build -f quarkus-vue-backend/src/main/docker/Dockerfile.jvm -t quarkus/quarkus-vue-jvm .`

4. Run the container using:

`docker run -i --rm -p 8080:8080 quarkus/quarkus-vue-jvm`

## Remove images except one

`docker rmi $(docker image ls | grep -v "exception" | grep -v "IMAGE" | tr -s ' ' | cut -d ' ' -f3)`