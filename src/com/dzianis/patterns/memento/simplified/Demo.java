package com.dzianis.patterns.memento.simplified;

public class Demo {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.setText("555");
		editor.setCursor("555", "555");
		editor.setSelectionWidth("555");
		
		editor.printConsole();
		
		Command command = new Command(editor);
		
		command.doChange();
		
		editor.printConsole();
		
		command.undo();
		
		editor.printConsole();
	}

}
