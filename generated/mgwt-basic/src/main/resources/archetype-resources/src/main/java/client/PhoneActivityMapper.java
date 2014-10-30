#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import ${package}.client.activities.about.AboutActivity;
import ${package}.client.activities.about.AboutPlace;
import ${package}.client.activities.home.HomeActivity;
import ${package}.client.activities.home.HomePlace;
import ${package}.client.activities.sample.SampleActivity;
import ${package}.client.activities.sample.SamplePlace;

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
