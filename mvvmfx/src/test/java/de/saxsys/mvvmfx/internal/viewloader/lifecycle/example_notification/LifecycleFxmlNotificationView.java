package de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_notification;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;

public class LifecycleFxmlNotificationView implements FxmlView<LifecycleNotificationViewModel> {

	@InjectViewModel
	private LifecycleNotificationViewModel viewModel;
}
