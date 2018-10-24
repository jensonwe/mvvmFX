package de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_gc;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;
import javafx.fxml.FXML;

public class LifecycleGCTestFxmlRootView implements FxmlView<LifecycleGCTestRootViewModel> {

	@FXML
	public LifecycleGCTestFxmlSub1View sub1Controller;
	@FXML
	public LifecycleGCTestFxmlSub2View sub2Controller;

	@InjectViewModel
	private LifecycleGCTestRootViewModel viewModel;

	public void initialize() {

	}
}
