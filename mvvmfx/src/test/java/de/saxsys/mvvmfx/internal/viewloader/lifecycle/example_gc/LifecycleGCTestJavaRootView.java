package de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_gc;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;

import javafx.scene.layout.VBox;

public class LifecycleGCTestJavaRootView extends VBox implements JavaView<LifecycleGCTestRootViewModel> {

    private LifecycleGCTestJavaSub1View subView_1 = FluentViewLoader.javaView(
            LifecycleGCTestJavaSub1View.class).load().getCodeBehind();
    private LifecycleGCTestJavaSub2View subView_2 = FluentViewLoader.javaView(
            LifecycleGCTestJavaSub2View.class).load().getCodeBehind();

    @InjectViewModel
    public LifecycleGCTestRootViewModel viewModel;

    public void initialize() {

        this.getChildren().add(subView_1);
        this.getChildren().add(subView_2);
    }
}
