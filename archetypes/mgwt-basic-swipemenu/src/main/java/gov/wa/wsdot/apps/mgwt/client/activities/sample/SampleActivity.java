package gov.wa.wsdot.apps.mgwt.client.activities.sample;

import gov.wa.wsdot.apps.mgwt.client.ClientFactory;
import gov.wa.wsdot.apps.mgwt.client.event.ActionEvent;
import gov.wa.wsdot.apps.mgwt.client.event.ActionNames;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

public class SampleActivity extends MGWTAbstractActivity implements
		SampleView.Presenter {

	private final ClientFactory clientFactory;
	private SampleView view;
	private EventBus eventBus;

	public SampleActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, final EventBus eventBus) {
		view = clientFactory.getSampleView();
		this.eventBus = eventBus;
		view.setPresenter(this);

		panel.setWidget(view);

	}

	@Override
	public void onStop() {
		view.setPresenter(null);
	}
	
	@Override
	public void onBackButtonPressed() {
		ActionEvent.fire(eventBus, ActionNames.BACK);
	}

}