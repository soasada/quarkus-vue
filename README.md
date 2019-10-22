## Before building the docker image run:

1. `mvn -U clean install -pl :quarkus-vue-frontend`
2. `mvn -U clean package -pl :quarkus-vue-backend`

## Then, build the image with:

`docker build -f quarkus-vue-backend/src/main/docker/Dockerfile.jvm -t quarkus/quarkus-vue-jvm .`

## Then run the container using:

`docker run -i --rm -p 8080:8080 quarkus/quarkus-vue-jvm`