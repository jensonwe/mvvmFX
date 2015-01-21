package de.saxsys.mvvmfx.examples.scopes.ui;

import de.saxsys.mvvmfx.ViewModel;
import de.saxsys.mvvmfx.examples.scopes.model.Note;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class ScopeViewModel implements ViewModel{

	private ObjectProperty<Note> note = new SimpleObjectProperty<>();

	public Note getNote() {
		return note.get();
	}

	public ObjectProperty<Note> noteProperty() {
		return note;
	}

	public void setNote(Note note) {
		this.note.set(note);
	}

}
