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
