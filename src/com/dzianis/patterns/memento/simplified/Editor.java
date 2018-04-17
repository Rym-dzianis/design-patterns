package com.dzianis.patterns.memento.simplified;

public class Editor {

	private String text, curX, curY, selectionWidth;

	public void setText(String text) {
		this.text = text;
	}
	
	public void setCursor(String x, String y) {
		this.curX = x;
		this.curY = y;
	}

	public void setSelectionWidth(String width) {
		this.selectionWidth = width;
	}
	
	public Snapshot createSnapshot(){
		// ������ � ������������ ������, ������� ���������
        // ������� ��� ��� ��������� ����� ��������� ������������.
		return new Snapshot(this, text, curX, curY, selectionWidth);
	}
	
	public void printConsole(){
		System.out.println(this.text + " " + this.curX + " " + this.curY   + " " + this.selectionWidth);
	}
	
	public class Snapshot {
		private Editor editor;
	    private String text, curX, curY, selectionWidth;
	    
		public Snapshot(Editor editor, String text, String curX, String curY, String selectionWidth) {
			this.editor = editor;
			this.text = text;
			this.curX = curX;
			this.curY = curY;
			this.selectionWidth = selectionWidth;
		}
	    
		public void restore(){
			editor.setText(text);
		    editor.setCursor(curX, curY);
		    editor.setSelectionWidth(selectionWidth);
		}
	}
}
