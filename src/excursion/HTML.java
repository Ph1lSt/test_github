package excursion;

public class HTML {

	public static String htmlElement(String tag, String body){
		String newString = null;
		if(tag == null || tag == " ") {
			newString = body;
			System.out.println(newString);
		} else if(body == null || body == " ") {
			newString = "<" + tag + ">" + "</" + tag + ">";
			System.out.println(newString);
		} else {
			newString = "<" + tag + ">" + body +  "</" + tag + ">";
			System.out.println(newString);
		}
		return newString;
	}
	
	public static String strong(String body) {
		String tag = "strong";
		return htmlElement(tag, body);
	}
	
	public static String emphasized(String body) {
		String tag = "em";
		return htmlElement(tag, body);
	}
	
	public static void main(String[] args) {
		htmlElement("tag", "body");
		htmlElement(" ", "body");
		htmlElement("tag", " ");
		emphasized("body");
		strong("body");
		strong(emphasized("body"));
	}
}
