FROM openjdk:11.0-jre-slim
VOLUME /tmp

ARG DEPENDENCY=target/dependency

# Create three layers to separate internal and external dependencies (keeps image smaller)
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app