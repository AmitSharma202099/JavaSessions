package javasessions;

public class Browser_1 {

	public String startBrowser(String Browser) {
		System.out.println("Browser Name " + Browser);

		if (Browser.equals("chrome")) {
			System.out.println("Browser chrome is launched");
			return Browser;
		} else if (Browser.equals("edge")) {
			System.out.println("Browser edge is launched");
			return Browser;

		} else if (Browser.equals("firefox")) {
			System.out.println("Browser firefox is launched");
			return Browser;

		} else if (Browser.equals("safari")) {
			System.out.println("Browser safari is launched");
			return Browser;
		}

		else {
			System.out.println("NO Browser safari is launched");
			return Browser;
		}

		// return Browser;
	}

	public boolean AppBrowser(String Browser) {
		System.out.println("Browser Name " + Browser);

		boolean flag = true ;
		switch (Browser) {
		case "chrome":
			System.out.println("Browser chrome is launched");
			break;
			//return true;
		case "ee":
			System.out.println("Browser ee is launched");
			break;
			//return true;

		case "ff":
			System.out.println("Browser ff is launched");
			break;
			//return true;

		case "safari":
			System.out.println("Browser safari is launched");
			break;
			//return true;
		default:
			System.out.println("NO Browser safari is launched");
			flag = false;
			break;

		}
//Press Ctrl + Shift +F for the Formatting
		
		return flag;
	}

	public static void main(String[] args) {

		Browser_1 brw = new Browser_1();
		String Brw_name = brw.startBrowser("chrome");
		System.out.println("From Main Method : Browser Name is " + Brw_name);
		int len = Brw_name.length();

		System.out.println("Browser length is " + len);
		if (len > 0) {
			System.out.println("open url: https://google.com");
		} else {
			System.out.println("no need to enter the url");

		}
		
		if (brw.AppBrowser("ee")) {
			System.out.println("CASE open url: https://google.com");
		}else {
			System.out.println("CASE no need to enter the url");

		
		
	}
	//System.out.println("+++++++++++++++++++++++++");
		//Browser_1 app_brw = new Browser_1();
	
	

	}

}	


