FROM adoptopenjdk:8

ADD target/trading-view-docker.jar trading-view-docker.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "trading-view-docker.jar"]

#RUN mkdir /app
#
#COPY target/classes/com/manavs/tradingview/ /app
#
#WORKDIR /app
#
#CMD Java TradingViewApplication
