package gov.wa.wsdot.apps.mgwt.client;

import gov.wa.wsdot.apps.mgwt.client.activities.about.AboutPlace.AboutPlaceTokenizer;
import gov.wa.wsdot.apps.mgwt.client.activities.home.HomePlace.HomePlaceTokenizer;
import gov.wa.wsdot.apps.mgwt.client.activities.sample.SamplePlace.SamplePlaceTokenizer;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ HomePlaceTokenizer.class, AboutPlaceTokenizer.class, SamplePlaceTokenizer.class })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
