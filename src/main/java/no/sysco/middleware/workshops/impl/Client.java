package no.sysco.middleware.workshops.impl;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import no.sysco.middleware.workshops.InvoiceOuterClass;
import no.sysco.middleware.workshops.InvoiceServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) throws InterruptedException {
        logger.info("Creating Channel");

        // 1. Create a ManageChannel to server gRPC connection
        final ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        // 2. Create a synchronous stub from channel to call server methods
        final InvoiceServiceGrpc.InvoiceServiceBlockingStub stub = InvoiceServiceGrpc.newBlockingStub(channel);

        // 3. Prepare request
        final InvoiceOuterClass.Invoice request = InvoiceOuterClass.Invoice.newBuilder()
                .setAmount(100.00f)
                .setId("123")
                .setCustomerId("XYZ123")
                .build();

        logger.info("Preparing Pay Request :: {}", request.toString());
        logger.info("Calling Pay stub");

        // 4. Call the pay method on the stub
        final InvoiceOuterClass.Invoice response = stub.pay(request);
        logger.info("Response from server is :: {}", response);

        // 5. Finally close the channel
        channel.shutdown();
    }
}
