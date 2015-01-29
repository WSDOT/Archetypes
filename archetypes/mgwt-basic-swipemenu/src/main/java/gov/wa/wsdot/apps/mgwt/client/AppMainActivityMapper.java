package gov.wa.wsdot.apps.mgwt.client;

import gov.wa.wsdot.apps.mgwt.client.activities.about.AboutActivity;
import gov.wa.wsdot.apps.mgwt.client.activities.about.AboutPlace;
import gov.wa.wsdot.apps.mgwt.client.activities.home.HomeActivity;
import gov.wa.wsdot.apps.mgwt.client.activities.home.HomePlace;
import gov.wa.wsdot.apps.mgwt.client.activities.sample.SampleActivity;
import gov.wa.wsdot.apps.mgwt.client.activities.sample.SamplePlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppMainActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	private Place lastPlace;

	public AppMainActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;

	}

	@Override
	public Activity getActivity(Place place) {
		Activity activity = getActivity(lastPlace, place);
		lastPlace = place;
		
		return activity;

	}

	private HomeActivity homeActivity;

	private HomeActivity getHomeActivity() {
		if (homeActivity == null) {
		    homeActivity = new HomeActivity(clientFactory);
		}

		return homeActivity;
	}

	private Activity getActivity(Place lastPlace, Place newPlace) {
		if (newPlace instanceof HomePlace) {
			return getHomeActivity();
		}
		
        if (newPlace instanceof AboutPlace) {
            return new AboutActivity(clientFactory);
        }
        
        if (newPlace instanceof SamplePlace) {
            return new SampleActivity(clientFactory);
        }

		return null;
	}

}
