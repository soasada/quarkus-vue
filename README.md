## Build the image with:

`docker build -f quarkus-vue-backend/src/main/docker/Dockerfile.jvm -t quarkus/quarkus-vue-jvm .`

## Then run the container using:

`docker run -i --rm -p 8080:8080 quarkus/quarkus-vue-jvm`

## Remove images except one

`docker rmi $(docker image ls | grep -v "exception" | grep -v "IMAGE" | tr -s ' ' | cut -d ' ' -f3)`