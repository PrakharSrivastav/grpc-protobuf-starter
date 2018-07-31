# Getting started with GRPC protocol

## Workflow Steps
- define your message and service schema in proto syntax. `src/main/proto/invoice.proto`
- build project using gradle. This will generate compiled java source and classes.
- Create a server side implementation from generated stubs. Check `no.sysco.middleware.workshops.impl.InvoiceServiceImpl`
- Create a server `no.sysco.middleware.workshops.impl.Server.java` and run it.
- Create a client `no.sysco.middleware.workshops.impl.Client.java` and run it.

## Build and run from command line
- Open terminal
- Clone the project repository: `git clone https://github.com/PrakharSrivastav/grpc-protobuf-starter.git`
- Go to project root `cd grpc-protobuf-starter`
- Build the project `./gradlew build`
- Run the server `./gradlew runServer`
- Run the client `./gradlew runClient`

## Important
- The number against the fields in protobuf should not change. Changing assigned number will cause breaking changes in the api. It would also mean that client and server stubs needs to be recreated.
- New fields can be added in the protobuf without breaking the message contract. However, side effects of the changes should be handled by the server and the client.