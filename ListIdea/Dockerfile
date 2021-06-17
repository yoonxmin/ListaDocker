FROM openjdk:11
COPY . /app/
WORKDIR /app/src/main/java
RUN javac main.java
ENTRYPOINT ["java", "main"]
