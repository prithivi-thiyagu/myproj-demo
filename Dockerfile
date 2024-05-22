FROM maven:3-jdk-8

WORKDIR /myproj-demo

# Copy only the project directory (replace 'myproject' with your actual project directory name)
COPY . .

#RUN mvn verify clean
RUN spring-boot:repackage
# Copy the JAR file (assuming it's located in target/)
ADD target/myproj-demo-0.0.1.jar myproj-demo.jar

RUN jar xf myproj-demo.jar
RUN ls
RUN cat META-INF/MANIFEST.MF


ENTRYPOINT ["java", "-jar", "myproj-demo.jar"]

EXPOSE 8090