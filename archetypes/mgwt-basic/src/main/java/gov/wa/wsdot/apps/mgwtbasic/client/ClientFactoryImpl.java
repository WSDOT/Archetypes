package gov.wa.wsdot.apps.mgwtbasic.client;

import gov.wa.wsdot.apps.mgwtbasic.client.activities.about.AboutView;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.about.AboutViewGwtImpl;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.home.HomeView;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.home.HomeViewGwtImpl;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.sample.SampleView;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.sample.SampleViewGwtImpl;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

public class ClientFactoryImpl implements ClientFactory {

	private EventBus eventBus;
	private PlaceController placeController;
	private HomeView homeView;
	private AboutViewGwtImpl aboutView;
	private SampleViewGwtImpl sampleView;

	public ClientFactoryImpl() {
		eventBus = new SimpleEventBus();
		placeController = new PlaceController(eventBus);
		homeView = new HomeViewGwtImpl();
	}

	@Override
	public HomeView getHomeView() {
	    if (homeView == null) {
            homeView = new HomeViewGwtImpl();
	    }
		
		return homeView;
	}	
	
	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public AboutView getAboutView() {
		if (aboutView == null) {
			aboutView = new AboutViewGwtImpl();
		}
		
		return aboutView;
	}

    @Override
    public SampleView getSampleView() {
        if (sampleView == null) {
            sampleView = new SampleViewGwtImpl();
        }

        return sampleView;
    }

}
