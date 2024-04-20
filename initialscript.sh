#!/bin/bash

# MongoDB connection details
MONGO_HOST="localhost"
MONGO_PORT="27017"
MONGO_ROOT_USERNAME="root"
MONGO_ROOT_PASSWORD="example"

# Database name
DATABASE_NAME="quiz1"

# Collections
COLLECTIONS=("en" "spa" "fr")

# MongoDB connection URI
MONGO_URI="mongodb://${MONGO_ROOT_USERNAME}:${MONGO_ROOT_PASSWORD}@${MONGO_HOST}:${MONGO_PORT}/${DATABASE_NAME}"

# Create database and collections
mongo "${MONGO_URI}" --eval "db.getSiblingDB('${DATABASE_NAME}')"

# Create collections
for COLLECTION in "${COLLECTIONS[@]}"; do
    mongo "${MONGO_URI}" --eval "db.getSiblingDB('${DATABASE_NAME}').createCollection('${COLLECTION}')"
done

# Insert documents into collections (you can modify this part as needed)
for COLLECTION in "${COLLECTIONS[@]}"; do
    case "${COLLECTION}" in
        "en")
            mongo "${MONGO_URI}/${COLLECTION}" --eval "db.${COLLECTION}.insert({ 'question': 'English question 1', 'answer': 'English answer 1' })"
            mongo "${MONGO_URI}/${COLLECTION}" --eval "db.${COLLECTION}.insert({ 'question': 'English question 2', 'answer': 'English answer 2' })"
            ;;
        "spa")
            mongo "${MONGO_URI}/${COLLECTION}" --eval "db.${COLLECTION}.insert({ 'question': 'Spanish question 1', 'answer': 'Spanish answer 1' })"
            mongo "${MONGO_URI}/${COLLECTION}" --eval "db.${COLLECTION}.insert({ 'question': 'Spanish question 2', 'answer': 'Spanish answer 2' })"
            ;;
        "fr")
            mongo "${MONGO_URI}/${COLLECTION}" --eval "db.${COLLECTION}.insert({ 'question': 'French question 1', 'answer': 'French answer 1' })"
            mongo "${MONGO_URI}/${COLLECTION}" --eval "db.${COLLECTION}.insert({ 'question': 'French question 2', 'answer': 'French answer 2' })"
            ;;
        *)
            echo "Unsupported language: ${COLLECTION}"
            ;;
    esac
done
