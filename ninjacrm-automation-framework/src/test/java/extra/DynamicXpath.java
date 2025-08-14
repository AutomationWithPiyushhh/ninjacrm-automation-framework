package extra;

public class DynamicXpath {
	public static void main(String[] args) {
		String cname = "John"; // Excel se data aayega

		String dyXPath = "//td[text()='" + cname + "']";

		System.out.println(dyXPath);
	}
}
