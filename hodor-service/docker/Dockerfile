FROM node:latest

RUN mkdir -p /hodor-service
ADD package.json /hodor-service

RUN cd /hodor-service ; npm install

# Add project files
ADD . /hodor-service
WORKDIR hodor-service

EXPOSE 8080
ENTRYPOINT [ "npm", "start" ]