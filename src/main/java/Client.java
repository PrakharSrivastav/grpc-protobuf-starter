import com.prakhar.invoice.InvoiceOuterClass;
import com.prakhar.invoice.InvoiceServiceGrpc2;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        final ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext(true)
                .build();

        final InvoiceServiceGrpc2.InvoiceServiceBlockingStub stub = InvoiceServiceGrpc2.newBlockingStub(channel);

        final InvoiceOuterClass.Invoice request = InvoiceOuterClass.Invoice.newBuilder()
                .setAmount(100.00f)
                .setId("123")
                .setCustomerId("XYZ123")
                .setState(InvoiceOuterClass.State.NEW)
                .build();


        final InvoiceOuterClass.Invoice response = stub.pay(request);
        System.out.println(response);
        channel.shutdown();
//        channel.awaitTermination(10000,TimeUnit.SECONDS);
    }
}
