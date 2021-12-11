FROM node:12

WORKDIR /usr/src/app

RUN apt update && apt install git -y

RUN git clone https://github.com/danangekal/ikan-id

WORKDIR ikan-id

RUN rm .env.example

RUN npm install

RUN npm run build

CMD ["yarn","start"]
