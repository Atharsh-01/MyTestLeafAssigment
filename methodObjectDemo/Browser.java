package methodObjectDemo;

public class Browser {
	
	void  launchBrowser() {
		System.out.println("Browser launched successfully");
	}
	void  loadUrl() {
		System.out.println("Application URL loaded successfully");
	}
	public static void main(String[] args) {
		
		Browser B = new Browser();
		B.launchBrowser();
		B.loadUrl();
	}

}
