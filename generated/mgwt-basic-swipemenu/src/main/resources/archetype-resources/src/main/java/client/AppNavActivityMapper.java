#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import ${package}.client.activities.MenuActivity;
import ${package}.client.activities.home.HomePlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppNavActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	public AppNavActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	private MenuActivity menuActivity;

	private Activity getMenuActivity() {
		if (menuActivity == null) {
			menuActivity = new MenuActivity(clientFactory);
		}
		return menuActivity;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof HomePlace) {
			return getMenuActivity();
		}

		return new MenuActivity(clientFactory);
	}
}
