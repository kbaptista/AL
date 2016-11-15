package model;

import java.io.File;

public class PageHTML {
	
	private static String template = 
			"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">"+
			"<html>"+
			"<head>"+
			"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"+
			"<title>$title</title>"+
			"</head>"+
			"<body>$body"+
			"</body>"+
			"</html>"; 
	
	private String htmlString;

	public PageHTML(){
		htmlString = new String (template);
	}

	public void setTitle(String title){
		htmlString.replace("$title",title);
	}
	
	public void setBody(String body){
		
	}
}
