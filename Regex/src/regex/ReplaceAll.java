package regex;

public class ReplaceAll {
	public static void main(String[] args) {
		"Caelum".replaceAll("[Cm]", "*");
		
		String novaData = "1988-04-15";
		
		novaData = novaData.replaceAll("-", "/");
		
	}
}
