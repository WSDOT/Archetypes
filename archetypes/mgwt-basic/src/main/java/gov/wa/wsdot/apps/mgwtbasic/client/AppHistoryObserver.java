package gov.wa.wsdot.apps.mgwtbasic.client;

import gov.wa.wsdot.apps.mgwtbasic.client.event.ActionEvent;
import gov.wa.wsdot.apps.mgwtbasic.client.event.ActionNames;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.History;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.googlecode.mgwt.dom.client.event.mouse.HandlerRegistrationCollection;
import com.googlecode.mgwt.mvp.client.history.HistoryHandler;
import com.googlecode.mgwt.mvp.client.history.HistoryObserver;

public class AppHistoryObserver implements HistoryObserver {

	@Override
	public void onPlaceChange(Place place, HistoryHandler handler) {
	}

	@Override
	public void onHistoryChanged(Place place, HistoryHandler handler) {
	}

	@Override
	public void onAppStarted(Place place, HistoryHandler historyHandler) {
		onPhoneNav(place, historyHandler);
	}

	@Override
	public HandlerRegistration bind(EventBus eventBus, final HistoryHandler historyHandler) {
		
		HandlerRegistration backButtonRegistration = ActionEvent.register(
				eventBus, ActionNames.BACK, new ActionEvent.Handler() {

					@Override
					public void onAction(ActionEvent event) {
						History.back();
					}
				});

		HandlerRegistration animationEndRegistration = ActionEvent.register(
				eventBus, ActionNames.ANIMATION_END, new ActionEvent.Handler() {

					@Override
					public void onAction(ActionEvent event) {
						History.back();
					}
				});

		HandlerRegistrationCollection col = new HandlerRegistrationCollection();
		col.addHandlerRegistration(backButtonRegistration);
		col.addHandlerRegistration(animationEndRegistration);

		return col;
	}

	private void onPhoneNav(Place place, HistoryHandler historyHandler) {
	}
}