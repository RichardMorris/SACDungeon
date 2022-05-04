package uk.ac.CornwallCollege.AdvancedOO.htmltree;

import java.util.ArrayList;
import java.util.List;

public abstract class Container implements Node {
	List<Node> elements;
	String tagName;
	
	public Container(String tag) {
		tagName = tag;
		elements = new ArrayList<>();
	}
	
	public void addChild(Node n) {
		elements.add(n);
	}
	
	@Override
	public void print() {
		System.out.println("<"+tagName+">");
	
		for(Node n:elements) {
			n.print();
		}
		System.out.println("</"+tagName+">");
		
	}

}
