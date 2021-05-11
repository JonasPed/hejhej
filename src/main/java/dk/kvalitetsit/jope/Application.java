package dk.kvalitetsit.jope;


import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) throws IOException {
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream("/home/jonas/Downloads/certs.yaml");
        Map<String, Object> obj = yaml.load(inputStream);

        var items = ((List)obj.get("items")).stream()
                .filter(x -> {
                    var y = (Map)x;
                    var spec = (Map)y.get("spec");
                    var issuerRef = (Map)spec.get(("issuerRef"));

                    return "letsencrypt-prod".equals(issuerRef.get("name"));
                })
                .map(x -> {
                    var y = (Map)x;
                    var spec = (Map)y.get("spec");
                    var dns = (List)spec.get(("dnsNames"));
                    return dns.stream().collect(Collectors.joining(","));
                }).collect(Collectors.joining(","));
//        System.out.println(obj);
        System.out.println(items);


        //        System.out.println(UUID.nameUUIDFromBytes("hej".getBytes()));
//        System.out.println(ZonedDateTime.parse("2021-03-15T11:39:38.321+01:00").toInstant());
//
//        // Opret instans
//        RegisterService registerService = RegisterServiceProvider.getRegisterService();
//        registerService.init(kafkaConfigurationProperties);
//
//        // Send data til MinLog
//        RegistrationResult result = registerService.addRegistrations(createLogEntryList());
//        registerService.flush();
//        if(result.getNumberFailed() > 0) {
//            // Håndter fejlede registreringer her.
//        }
//
//        // Send flere data til MinLog. Dette kunne f.eks. være en anden transaktion.
//        registerService.addRegistrations(createLogEntryList());
//        registerService.flush();
//        if(result.getNumberFailed() > 0) {
//            // Håndter fejlede registreringer her.
//        }
//
//        // Luk service. F.eks. når applikationen stoppes.
//        registerService.close();


//        Map<String, String> map = new HashMap<>();
//        map.put("key",null);
//        map.merge("key", "value", Application::merge);
//        System.out.println(map.keySet());
//        System.out.println(map.get("key"));

////        new Access().test();
//       var sslContext = SSLContextBuilder
//                .create()
//               .loadKeyMaterial(new File("/home/jonas/client.pfx"), "test1234".toCharArray(), "test1234".toCharArray()) // Client nøgle og certifikat
//               .loadTrustMaterial(new File("/home/jonas/ca.jks"), "test1234".toCharArray()) // Trust
//                .setProtocol("TLS")
//                .build();
//
//        HostnameVerifier hostnameVerifier = (s, sslSession) -> true; // Spring host name verifikatio over
//
//        var client = HttpClientBuilder
//                .create()
//                .setSSLContext(sslContext)
//                .setSSLHostnameVerifier(hostnameVerifier)
//                .build();
//
//        HttpGet request = new HttpGet("https://localhost:1080/");
//
//        var response = client.execute(request);
//        System.out.println(response.getEntity().toString());
    }

    private static String merge(String s, String s1) {
        return s1;
    }

    private static byte[] getResponse() {
        return "hej hej svar".getBytes(StandardCharsets.UTF_8);
    }
}
