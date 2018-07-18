import com.prakhar.invoice.InvoiceServiceImpl;
import io.grpc.*;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server = ServerBuilder.forPort(8080)
                .addService(new InvoiceServiceImpl())
                .build();

        server.start();
        System.out.println("Server started");
        server.awaitTermination();

    }
}
