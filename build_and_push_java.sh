#!/usr/bin/env bash
imageName=uuidcode/java:latest

docker login
docker build --no-cache --tag ${imageName} -f Dockerfile-java .
docker push ${imageName}