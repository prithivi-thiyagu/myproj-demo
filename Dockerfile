FROM openjdk:8

WORKDIR /myproj-demo

# Copy only the project directory (replace 'myproject' with your actual project directory name)
COPY ./target/*.jar myproj-demo.jar

RUN ls



ENTRYPOINT ["java", "-jar", "myproj-demo.jar"]

EXPOSE 8090
