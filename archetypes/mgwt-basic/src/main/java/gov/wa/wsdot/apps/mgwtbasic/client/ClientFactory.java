package gov.wa.wsdot.apps.mgwtbasic.client;

import gov.wa.wsdot.apps.mgwtbasic.client.activities.about.AboutView;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.home.HomeView;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.sample.SampleView;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;


public interface ClientFactory {

	public HomeView getHomeView();
	public EventBus getEventBus();
	public PlaceController getPlaceController();
	
	/**
	 * @return
	 */
	public AboutView getAboutView();
	public SampleView getSampleView();
}
