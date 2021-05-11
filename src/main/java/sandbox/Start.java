package sandbox;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class Start {
	public static void main(String[] args) throws Exception {

		LocalDateTime now = LocalDateTime.now();
		now = now.withNano(123 *1000000);
		System.out.println(now);
		System.out.println("Template: https://localhost:3000/3487d316348f".matches("^Template: https:\\/\\/localhost:3000\\/[a-z0-9]{12}$"));



		System.out.println(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date()));



		//		long now = Calendar.getInstance().getTimeInMillis();
//		Object id = new Long(12345);
//		int rows = 123;
//
//			System.out.println(String.format("Rows affected: %s. Parameters to updateValidToStmt. ValidTo: %s, ModifiedDate: %s, Id: %s, ValidFrom: %s", rows, new Timestamp(now), new Timestamp(now), id, new Timestamp(now)));
//
//
//		Date date = new Date();
//		String dateRepresentation = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(date);
//		System.out.println(dateRepresentation);


		var input1 = new ArrayList<String>();
		input1.add("A");


		var input = new MyClass();
		input.setOp("tekst a");
		List<List<String>> x = new ArrayList<>();
		List<String> xx = new ArrayList<>();
		xx.add("a");
		xx.add("b");
		x.add(xx);
		input.setSorIdAndParentSorIdPairs(x);

		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println(objectMapper.writeValueAsString(input));

//
//
//		var url = new URL("https://outlook.office365.com/autodiscover/metadata/json/2");
//
//		ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//
//		ObjectReader reader = mapper.readerFor(AmUrl.class);
//		AmUrl u = reader.readValue(url);
//		System.out.println(u);
//
//
//
//
//		//		var jws = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjU2MzU4ODUyMzRCOTI1MkRERTAwTc2NkQ5RDlGMjc2NTY1RjYzRTIiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJWaldJVWpTNUpTM2VBRmRtMmRueWRsWmZZLUkifQ.eyJhcHBjdHhzZW5kZXIiOiIwMDAwMDAwMi0wMDAwLTBmZjEtY2UwMC0wMDAwMDAwMDAwMDBAODY2YzkzMzMtNTBhNC00YTBmLTllM2UtOGY1NzgxYjU5YWMxIiwiaXNicm93c2VyaG9zdGVkYXBwIjoiVHJ1ZSIsImFwcGN0eCI6IntcIm1zZXhjaHVpZFwiOlwiYWEwMDBjNjEtODAyMi00NzY2LWE5YjItZjU5NTlmOTk4Yzc2XCIsXCJ2ZXJzaW9uXCI6XCJFeElkVG9rLlYxXCIsXCJhbXVybFwiOlwiaHR0cHM6Ly9vdXRsb29rLm9mZmljZTM2NS5jb206NDQzL2F1dG9kaXNjb3Zlci9tZXRhZGF0YS9qc29uLzFcIn0iLCJuYmYiOjE1OTk4MDAzMzAsImV4cCI6MTU5OTgyOTEzMCwiaXNzIjoiMDAwMDAwMDItMDAwMC0wZmYxLWNlMDAtMDAwMDAwMDAwMDAwQDg2NmM5MzMzLTUwYTQtNGEwZi05ZTNlLThmNTc4MWI1OWFjMSIsImF1ZCI6Imh0dHBzOi8vbG9jYWxob3N0OjMwMDAvdGFza3BhbmUuaHRtbCJ9.D5-_IO_x2e-lA_gCZZx_ydc-EDoV1zR7kqb6Sioed3DScLo5HlOgNrOOAJHhZGK4_grJO4mLZd7-ZIjQ3ESCQzorQIMzX_ZpGHJKqt_kkeACtpLzo-jyEBGlR2CFMLR4BByrToz3O_JCqY0cZk8ztMKdS8O-nTvTBp66nv5KHgIFUqxwo-DLQJh7t-ZmOGqt044r9Owo54cAnXKC_VpNIwhYXQZiUeS76JA27cthHrjfKJHEsQiqwCdLOtHgDS254YCG76qNbwcAyN9fAJRho0jFM_rAgmKuwpXsXW1ra96mWTgKbsTRu7Hd5iwmIzQ1LJzYXi54TRtnGMoivAL9XQ";
////		ObjectMapper objectMapper = new ObjectMapper();
////		int i = jws.lastIndexOf('.');
////		String withoutSignature = jws.substring(0, i+1);
////		Jwt<Header,Claims> untrusted = Jwts.parserBuilder().build().parseClaimsJwt(withoutSignature);
////		var app = untrusted.getBody().get("appctx", String.class);
////		System.out.println(app);
////		var a = objectMapper.readValue(app, AppCtx.class);
////
////		URL url = new URL(a.getAmurl());
////		HttpURLConnection con = (HttpURLConnection) url.openConnection();
////		con.setRequestMethod("GET");
////		BufferedReader in = new BufferedReader(
////				new InputStreamReader(con.getInputStream()));
////		String inputLine;
////		StringBuffer content = new StringBuffer();
////		while ((inputLine = in.readLine()) != null) {
////			content.append(inputLine);
////		}
////		in.close();
////
////		objectMapper = objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
////
////		var amurl = objectMapper.readValue(content.toString(), AmUrl.class);
////
////
////		// Receiving side
////
////		byte[] decodedBytes = Base64.getDecoder().decode(amurl.getKeys().get(0).getKeyvalue().getValue());
////
////		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(decodedBytes);
////
////		// Print the decoded string
////
////		String decodedString = new String(decodedBytes);
////
////
////		CertificateFactory certFactory = CertificateFactory.getInstance("X509");
////		// certFactory.
////		X509Certificate cert = (X509Certificate) certFactory.generateCertificate(fileInputStream);
////		PublicKey publicKey = cert.getPublicKey();
////		var r = Jwts.parserBuilder().setSigningKey(publicKey).build().parseClaimsJws(jws);
////		System.out.println(content);
	}

	public static class Test {
		private Integer felt;

		public Integer getFelt() {
			return felt;
		}

		public void setFelt(Integer felt) {
			this.felt = felt;
		}
	}


	public static class DockerHub {
		private List<Results> results;
	}

	public static class Results {
		private String name;
		private String is_private;

		public String getIs_private() {
			return is_private;
		}

		public void setIs_private(String is_private) {
			this.is_private = is_private;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

}
