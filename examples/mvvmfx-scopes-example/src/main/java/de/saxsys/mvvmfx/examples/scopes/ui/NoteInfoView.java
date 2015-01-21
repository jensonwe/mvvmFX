package de.saxsys.mvvmfx.examples.scopes.ui;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NoteInfoView implements FxmlView<NoteInfoViewModel> {
	@FXML
	public Label title;
	@FXML
	public Label lastModified;

	
	@InjectViewModel
	private NoteInfoViewModel viewModel;
	
	
	public void initialize(){
		title.textProperty().bind(viewModel.titleProperty());		
		lastModified.textProperty().bind(viewModel.lastModifiedProperty());		
	}
}
