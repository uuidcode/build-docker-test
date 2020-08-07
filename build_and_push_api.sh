#!/usr/bin/env bash
imageName=uuidcode/test-api:latest

docker login
docker build --no-cache --tag ${imageName} -f Dockerfile-api .
docker push ${imageName}