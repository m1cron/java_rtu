FROM openjdk:11

ADD . /src

WORKDIR /src

RUN ./gradlew build

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/src/app.jar"]