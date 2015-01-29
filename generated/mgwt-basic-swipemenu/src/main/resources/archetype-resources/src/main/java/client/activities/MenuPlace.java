#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.activities;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class MenuPlace extends Place {

	public static class MenuPlaceTokenizer implements
			PlaceTokenizer<MenuPlace> {

		@Override
		public MenuPlace getPlace(String token) {
			return new MenuPlace();
		}

		@Override
		public String getToken(MenuPlace place) {
			return "";
		}

	}

}