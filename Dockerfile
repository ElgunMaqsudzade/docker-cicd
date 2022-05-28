FROM eclipse-temurin:17-jre-alpine
ARG arg
EXPOSE 8080
RUN mkdir /app
COPY --from=build /${arg}/*.jar /app/app.jar
CMD ["java","-jar","/app/app.jar"]