# polyglotify-quiz-service
polyglotify-quiz-service


## Setting up Mongodb
Please ensure that docker is up & running in your local system
Once confirmed
- navigate to project directory
- run _**docker compose up**_ command

- this will bring two container in same network in docker, one is for mongodb and other for mongo express
browse http://localhost:8081/ it should open mongo express UI connected to mongodb
- manually create quiz database
- create three collection en,es,fr
- add test document from dummy folder in respective collection
- to shutdown container use _**docker compose down**_
