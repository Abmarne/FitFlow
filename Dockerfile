# Java 21 runtime
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Download dependencies (cached)
RUN ./mvnw dependency:go-offline

# Copy source code
COPY src src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose Spring Boot port
EXPOSE 8080

# Run the JAR
CMD ["java", "-jar", "target/*.jar"]
