package uk.ac.CornwallCollege.AdvancedOO.htmltree;


public class TextNode implements Node {
	String tagName;
	String text;

	public TextNode(String tagName, String text) {
		super();
		this.tagName = tagName;
		this.text = text;
	}

	public void print() {
		System.out.println(
				"<"+tagName+">"+text+"</"+tagName+">");
	}


}
