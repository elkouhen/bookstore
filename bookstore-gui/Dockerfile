# syntax = docker/dockerfile:experimental
FROM node:16-alpine as build

WORKDIR /home/app

COPY package.json /home/app/package.json

COPY package-lock.json /home/app/package-lock.json

ADD public/ /home/app/public

ADD src/ /home/app/src

EXPOSE 8080

ENTRYPOINT npm run serve

