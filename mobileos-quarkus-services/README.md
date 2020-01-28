# mobileos-quarkus-services project


This is a real example application using Quarkus (www.using Quarkus (www.quarkus.io).

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Start a Postgre Server using Docker
$ sudo docker run --name mobileos-postgres \
  -e POSTGRES_PASSWORD=mobileos \
  -e POSTGRES_USER=mobileos  \
  -e POSTGRES_DB=db_mobileos \
  -p 5432:5432 \
  -v <PATH_NAME>:/var/lib/postgresql/data \
  -d postgres:9.6.16
  
* It's necessary to change <PATH_NAME> for your database path.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application is packageable using `./mvnw package`.
It produces the executable `mobileos-quarkus-services-1.0-SNAPSHOT-runner.jar` file in `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/mobileos-quarkus-services-1.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or you can use Docker to build the native executable using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your binary: `./target/mobileos-quarkus-services-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image-guide .
