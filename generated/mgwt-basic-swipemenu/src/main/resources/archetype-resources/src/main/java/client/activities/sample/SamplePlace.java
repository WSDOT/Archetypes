#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.activities.sample;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SamplePlace extends Place {
	
	public static class SamplePlaceTokenizer implements
			PlaceTokenizer<SamplePlace> {

		@Override
		public SamplePlace getPlace(String token) {
			return new SamplePlace();
		}

		@Override
		public String getToken(SamplePlace place) {
			return "";
		}

	}
}