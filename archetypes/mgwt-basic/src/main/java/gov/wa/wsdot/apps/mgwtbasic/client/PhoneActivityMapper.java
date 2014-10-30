package gov.wa.wsdot.apps.mgwtbasic.client;

import gov.wa.wsdot.apps.mgwtbasic.client.activities.about.AboutActivity;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.about.AboutPlace;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.home.HomeActivity;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.home.HomePlace;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.sample.SampleActivity;
import gov.wa.wsdot.apps.mgwtbasic.client.activities.sample.SamplePlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class PhoneActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	public PhoneActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof HomePlace) {
			return new HomeActivity(clientFactory);
		}
		
		if (place instanceof AboutPlace) {
			return new AboutActivity(clientFactory);
		}
		
		if (place instanceof SamplePlace) {
		    return new SampleActivity(clientFactory);
		}
		
		return new HomeActivity(clientFactory);
	}
}
