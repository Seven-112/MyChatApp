FROM adoptopenjdk/openjdk15:ubi
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY build/libs/*.jar app.jar
EXPOSE 7000
CMD ["java", "-jar", "app.jar"]