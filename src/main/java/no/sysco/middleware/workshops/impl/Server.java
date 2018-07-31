package no.sysco.middleware.workshops.impl;

import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public final class Server {
    private static Logger logger = LoggerFactory.getLogger(Server.class);

    public static void main(String[] args) throws IOException, InterruptedException {
        logger.info("Starting the server");

        // Bootstrapping the server to listen on port 8080
        io.grpc.Server server = ServerBuilder.forPort(8080)
                // Add InvoiceServiceImpl to server. More services, if available can be added similarly
                .addService(new InvoiceServiceImpl())
                .build();

        // Start the server
        server.start();
        logger.info("Server started");

        // Wait for the server process for manual termination
        server.awaitTermination();
    }
}
