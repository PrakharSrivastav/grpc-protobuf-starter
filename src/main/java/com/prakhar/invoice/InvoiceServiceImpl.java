package com.prakhar.invoice;

import io.grpc.stub.StreamObserver;

public class InvoiceServiceImpl extends InvoiceServiceGrpc2.InvoiceServiceImplBase {
    @Override
    public void pay(InvoiceOuterClass.Invoice request, StreamObserver<InvoiceOuterClass.Invoice> responseObserver) {
//        super.pay(request, responseObserver);

        System.out.println(request.getAmount());
        System.out.println(request.getId());
        System.out.println(request.getCustomerId());
        System.out.println(request.getState().name());


        // You must use a builder to construct a new Protobuffer object
        InvoiceOuterClass.Invoice response = InvoiceOuterClass.Invoice.newBuilder()
                .setAmount(request.getAmount() + 1)
                .setCustomerId(request.getCustomerId())
                .setState(InvoiceOuterClass.State.FAILED)
                .setId(request.getId())
                .build();

        // Use responseObserver to send a single response back
        responseObserver.onNext(response);


        // When you are done, you must call onCompleted.
        responseObserver.onCompleted();
    }

    public InvoiceServiceImpl() {}
}
