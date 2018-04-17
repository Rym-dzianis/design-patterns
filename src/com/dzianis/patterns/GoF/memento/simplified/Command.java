package com.dzianis.patterns.GoF.memento.simplified;

import com.dzianis.patterns.GoF.memento.simplified.Editor.Snapshot;

public class Command {
	private Snapshot backup;
	private Editor editor;
	
	public Command(Editor editor) {
		this.editor = editor;
	}

	public void doChange(){
		makeBackup();
		
		editor.setText("zero");
		editor.setCursor("0", "0");
		editor.setSelectionWidth("0");
	}
	
	private void makeBackup(){
		backup = editor.createSnapshot();

	}
	
	public void undo(){
		if (backup != null) backup.restore();
	}
}
