#Contenedor v.1.0
FROM ubuntu 18.04
ARG DEBIAN_FRONTEND=noninteractive
ENV TZ=America/Lapaz
RUN apt-get update 
RUN apt-get -y install apache2 -y
RUN apt-get install nginx
expose 80
ENTRYPOINT echo "Bienvenido al contenedor de Keny"