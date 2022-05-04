package uk.ac.CornwallCollege.AdvancedOO.htmltree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HtmlDocTest {

	@Test
	void testTextNode() {
		TextNode tn = new TextNode("foo","bar");
		tn.print();
	}

	@Test
	void testParagraph() {
		Node tn = new Paragraph("bar");
		tn.print();
	}

	@Test
	void testList() {
		Container tn = new UnorderedList();
		tn.addChild(new ListItem("first"));
		tn.addChild(new ListItem("second"));
		tn.addChild(new ListItem("third"));
		tn.print();
	}

	@Test
	void testDocument() {
		Container root = new Html();
		Container head = new Head();
		Container body = new Body();
		root.addChild(head);
		root.addChild(body);
		head.addChild(new Title("My Document"));
		
		body.addChild(new Heading(1,"My First Document"));
		body.addChild(new Paragraph("Blah blah"));
		
		Container tn = new UnorderedList();
		tn.addChild(new ListItem("first"));
		tn.addChild(new ListItem("second"));
		tn.addChild(new ListItem("third"));
		
		body.addChild(tn);
		
		Container div = new Div();
		div.addChild(new Heading(2,"little heading"));
		div.addChild(new Paragraph("more blah"));
		
		body.addChild(div);
		
		root.print();
	}
	

}
