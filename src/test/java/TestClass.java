//import io.netty.handler.codec.base64.Base64Encoder;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.ssl.SSLContextBuilder;
//import org.junit.Test;
//import org.mockito.Mockito;
//import org.mockserver.client.MockServerClient;
//import org.mockserver.matchers.Times;
//import org.mockserver.model.Header;
//import org.mockserver.model.HttpRequest;
//import org.mockserver.model.HttpResponse;
//import org.testcontainers.containers.MockServerContainer;
//import sandbox.HejHej;
//import sandbox.MyClass;
//
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.SSLSession;
//import javax.net.ssl.SSLSocket;
//import javax.net.ssl.SSLSocketFactory;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.http.HttpClient;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.security.KeyManagementException;
//import java.security.KeyStore;
//import java.security.KeyStoreException;
//import java.security.NoSuchAlgorithmException;
//import java.security.cert.CertificateException;
//import java.time.Duration;
//
//public class TestClass {
//
//    public static void main(String[] args) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
//        var fhirMockService = new MockServerContainer();
//        fhirMockService.start();
//        var fhirMockServerPort = fhirMockService.getMappedPort(1080);
//        MockServerClient mockServerClient = new MockServerClient(fhirMockService.getContainerIpAddress(), fhirMockServerPort);
//        mockServerClient
//                .when(
//                        HttpRequest.request()
//                                .withMethod("GET")
//                                .withPath("/AuditEvent"),
//                        Times.unlimited())
//                .respond(
//                        HttpResponse.response()
//                                .withStatusCode(200)
//                                .withHeaders(
//                                        new Header("Content-Type", "application/json; charset=utf-8"))
//                                .withBody(getResponse())
//                );
//
//        SSLContext sslContext = SSLContext.getInstance("TLS");
//        SSLSocketFactory factory =sslContext.getSocketFactory();
//        SSLSocket socket =(SSLSocket)factory.createSocket("localhost", fhirMockServerPort);
//        socket.startHandshake();
//        SSLSession session = socket.getSession();
//        java.security.cert.Certificate[] servercerts = session.getPeerCertificates();
//        Base64Encoder encoder = new Base64Encoder();
//        for (int i = 0; i < servercerts.length; i++) {
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("-----BEGIN CERTIFICATE-----\n");
//            stringBuilder.append(java.util.Base64.getEncoder().encodeToString(servercerts[i].getEncoded()));
//            stringBuilder.append("\n-----END CERTIFICATE-----\n");
//            System.out.println(stringBuilder);
//
//            byte[] cert1 = servercerts[i].getEncoded();
//            var createdFile = new File("/tmp/cert" + i + ".crt");
//            Files.writeString(Path.of(createdFile.getPath()), stringBuilder.toString());
//        }
//
//        InputStream certIn = new FileInputStream("/tmp/cert0.crt");
//        KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
//        keystore.load(certIn, null);
//
//        sslContext = SSLContextBuilder
//                .create()
//                .loadTrustMaterial(keystore, null)
//                .setProtocol("TLS")
//                .build();
//
//        var client1 = HttpClientBuilder
//                .create()
//                .setSSLContext(sslContext)
//                .build();
//
//        HttpClient client = HttpClient.newBuilder()
//                .version(HttpClient.Version.HTTP_1_1)
//                .followRedirects(HttpClient.Redirect.NORMAL)
//                .connectTimeout(Duration.ofSeconds(20))
//                .sslContext(sslContext)
//                .build();
//        client.
//    }
//
//    private static byte[] getResponse() {
//        return "hej hej svar".getBytes(StandardCharsets.UTF_8);
//    }
//
//
//}
