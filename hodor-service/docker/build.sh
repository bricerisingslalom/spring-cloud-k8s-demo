#!/bin/bash

docker build -t hodor-service:latest -f docker/Dockerfile $* .
