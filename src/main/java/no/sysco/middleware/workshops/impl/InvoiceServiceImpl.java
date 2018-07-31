package no.sysco.middleware.workshops.impl;


import io.grpc.stub.StreamObserver;
import no.sysco.middleware.workshops.InvoiceOuterClass;
import no.sysco.middleware.workshops.InvoiceServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvoiceServiceImpl extends InvoiceServiceGrpc.InvoiceServiceImplBase {

    private static Logger logger = LoggerFactory.getLogger(InvoiceServiceImpl.class);

    /**
     * Pay method simulates a Payment process for an invoice issued to a customer.
     *
     * @param request : represents a strongly typed client request. The api is aware of all the fields and their data-type
     * @param responseObserver : is a means to control streaming behaviour in gRPC. It takes care of the behaviour of the response
     */
    @Override
    public void pay(InvoiceOuterClass.Invoice request, StreamObserver<InvoiceOuterClass.Invoice> responseObserver) {

        logger.info("Pay request is :: {}", request.toString());

        // You must use a builder to construct a new Protobuffer object
        InvoiceOuterClass.Invoice response = InvoiceOuterClass.Invoice.newBuilder()
                // We provide a custom business logic at server to increment Amount by 1
                .setAmount(request.getAmount() + 1)
                .setCustomerId(request.getCustomerId())
                .setId(request.getId())
                .build();

        logger.info("Pay response is :: {}", response.toString());

        // Use responseObserver to send a single response back
        responseObserver.onNext(response);

        // When you are done, you must call onCompleted.
        responseObserver.onCompleted();
    }

    public InvoiceServiceImpl() {}
}
