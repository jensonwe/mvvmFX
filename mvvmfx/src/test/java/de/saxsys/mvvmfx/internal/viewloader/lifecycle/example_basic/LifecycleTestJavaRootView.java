package de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_basic;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;

import javafx.scene.layout.VBox;
public class LifecycleTestJavaRootView extends VBox implements JavaView<LifecycleTestRootViewModel> {

    private LifecycleTestJavaSub1View subView_1 = FluentViewLoader.javaView(LifecycleTestJavaSub1View.class).load().getCodeBehind();
    private LifecycleTestJavaSub2View subView_2 = FluentViewLoader.javaView(LifecycleTestJavaSub2View.class).load().getCodeBehind();

    @InjectViewModel
    public LifecycleTestRootViewModel viewModel;

    public void initialize(){
        this.getChildren().add(subView_1);
        this.getChildren().add(subView_2);
    }
}
