package no.sysco.middleware.workshops;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * InvoiceService is name of the service which will contain all the methods related to invoice operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: invoice.proto")
public final class InvoiceServiceGrpc {

  private InvoiceServiceGrpc() {}

  public static final String SERVICE_NAME = "InvoiceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<no.sysco.middleware.workshops.InvoiceOuterClass.Invoice,
      no.sysco.middleware.workshops.InvoiceOuterClass.Invoice> getPayMethod;

  public static io.grpc.MethodDescriptor<no.sysco.middleware.workshops.InvoiceOuterClass.Invoice,
      no.sysco.middleware.workshops.InvoiceOuterClass.Invoice> getPayMethod() {
    io.grpc.MethodDescriptor<no.sysco.middleware.workshops.InvoiceOuterClass.Invoice, no.sysco.middleware.workshops.InvoiceOuterClass.Invoice> getPayMethod;
    if ((getPayMethod = InvoiceServiceGrpc.getPayMethod) == null) {
      synchronized (InvoiceServiceGrpc.class) {
        if ((getPayMethod = InvoiceServiceGrpc.getPayMethod) == null) {
          InvoiceServiceGrpc.getPayMethod = getPayMethod = 
              io.grpc.MethodDescriptor.<no.sysco.middleware.workshops.InvoiceOuterClass.Invoice, no.sysco.middleware.workshops.InvoiceOuterClass.Invoice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InvoiceService", "Pay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.workshops.InvoiceOuterClass.Invoice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.workshops.InvoiceOuterClass.Invoice.getDefaultInstance()))
                  .setSchemaDescriptor(new InvoiceServiceMethodDescriptorSupplier("Pay"))
                  .build();
          }
        }
     }
     return getPayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InvoiceServiceStub newStub(io.grpc.Channel channel) {
    return new InvoiceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InvoiceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InvoiceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InvoiceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InvoiceServiceFutureStub(channel);
  }

  /**
   * <pre>
   * InvoiceService is name of the service which will contain all the methods related to invoice operations
   * </pre>
   */
  public static abstract class InvoiceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Request Payment of an invoice
     * </pre>
     */
    public void pay(no.sysco.middleware.workshops.InvoiceOuterClass.Invoice request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.workshops.InvoiceOuterClass.Invoice> responseObserver) {
      asyncUnimplementedUnaryCall(getPayMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                no.sysco.middleware.workshops.InvoiceOuterClass.Invoice,
                no.sysco.middleware.workshops.InvoiceOuterClass.Invoice>(
                  this, METHODID_PAY)))
          .build();
    }
  }

  /**
   * <pre>
   * InvoiceService is name of the service which will contain all the methods related to invoice operations
   * </pre>
   */
  public static final class InvoiceServiceStub extends io.grpc.stub.AbstractStub<InvoiceServiceStub> {
    private InvoiceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InvoiceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InvoiceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request Payment of an invoice
     * </pre>
     */
    public void pay(no.sysco.middleware.workshops.InvoiceOuterClass.Invoice request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.workshops.InvoiceOuterClass.Invoice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * InvoiceService is name of the service which will contain all the methods related to invoice operations
   * </pre>
   */
  public static final class InvoiceServiceBlockingStub extends io.grpc.stub.AbstractStub<InvoiceServiceBlockingStub> {
    private InvoiceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InvoiceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InvoiceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request Payment of an invoice
     * </pre>
     */
    public no.sysco.middleware.workshops.InvoiceOuterClass.Invoice pay(no.sysco.middleware.workshops.InvoiceOuterClass.Invoice request) {
      return blockingUnaryCall(
          getChannel(), getPayMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * InvoiceService is name of the service which will contain all the methods related to invoice operations
   * </pre>
   */
  public static final class InvoiceServiceFutureStub extends io.grpc.stub.AbstractStub<InvoiceServiceFutureStub> {
    private InvoiceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InvoiceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InvoiceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request Payment of an invoice
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<no.sysco.middleware.workshops.InvoiceOuterClass.Invoice> pay(
        no.sysco.middleware.workshops.InvoiceOuterClass.Invoice request) {
      return futureUnaryCall(
          getChannel().newCall(getPayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PAY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InvoiceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InvoiceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PAY:
          serviceImpl.pay((no.sysco.middleware.workshops.InvoiceOuterClass.Invoice) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.workshops.InvoiceOuterClass.Invoice>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InvoiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InvoiceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return no.sysco.middleware.workshops.InvoiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InvoiceService");
    }
  }

  private static final class InvoiceServiceFileDescriptorSupplier
      extends InvoiceServiceBaseDescriptorSupplier {
    InvoiceServiceFileDescriptorSupplier() {}
  }

  private static final class InvoiceServiceMethodDescriptorSupplier
      extends InvoiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InvoiceServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InvoiceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InvoiceServiceFileDescriptorSupplier())
              .addMethod(getPayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
