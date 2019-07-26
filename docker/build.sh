#!/bin/bash

docker build -f docker/Dockerfile -t spring-cloud-k8s-demo:latest $* .
