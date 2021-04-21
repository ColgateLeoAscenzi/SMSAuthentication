#!/usr/bin/env bash

# Must be run from the project root directory.
set -e

echo
echo "Tearing down any existing cluster resources..."
echo
docker-compose down --remove-orphans

# Create executable JAR and unpack it for each microservice
echo
echo "Creating executable for SMS Authenticator API..."
echo
cd sms-auth-api && ./mvnw clean install -DskipTests
mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
cd ..

echo
echo "Rebuilding cluster images..."
echo
docker-compose build

# Check for local docker compose to pull in custom configs
COMPOSE_ARGS=""
if [ -e "./docker-compose.local.yml" ]
then
  echo "Found and using docker-compose.local.yml..."
  COMPOSE_ARGS="-f docker-compose.yml -f docker-compose.local.yml"
else
  echo "Did not find docker-compose.local.yml; will use docker-compose.default.yml..."
  COMPOSE_ARGS="-f docker-compose.yml -f docker-compose.default.yml"
fi

# Run the images
exec docker-compose $COMPOSE_ARGS up sms-auth-api