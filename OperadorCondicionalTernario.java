

public class OperadorCondicionalTernario {

	public static void main(String[] args) {
		String flowVarsAuthorization = null;
		String authorization = "eoq";
		String initialToken = (flowVarsAuthorization = (authorization == null) ? "0" : authorization);
		System.out.println(initialToken);
		System.out.println(authorization);
		System.out.println(flowVarsAuthorization);
	}

}
