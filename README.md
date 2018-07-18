# Getting started with GRPC protocol

## Steps
- define your message and service schema in proto syntax. `src/main/proto`
- build project using gradle. This will generate compiled java source and classes.
- Ideally push these generated source to a repo like artifactory. this is because your client and the server applications will live at different places in real world.
- Instead of pushing to artifactory, we locall copy the generated source files `InvoiceOuterClass` and `InvoiceServiceGrpc2` .
- Create a server side implementation from generated stubs. Check `InvoiceServiceImpl`
- Create a server `Server.java` and run it.
- Create a client `Client.java` and run it.


## Important
- The number against the fields in protobuf should not change. Changing assigned number will cause breaking changes in the api. It would also mean that client and server stubs needs to be recreated.
- New fields can be added in the protobuf without breaking the message contract. However, side effects of the changes should be handled by the server and the client.