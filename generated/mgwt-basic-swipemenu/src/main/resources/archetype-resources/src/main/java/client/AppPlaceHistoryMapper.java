#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import ${package}.client.activities.about.AboutPlace.AboutPlaceTokenizer;
import ${package}.client.activities.home.HomePlace.HomePlaceTokenizer;
import ${package}.client.activities.sample.SamplePlace.SamplePlaceTokenizer;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ HomePlaceTokenizer.class, AboutPlaceTokenizer.class, SamplePlaceTokenizer.class })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
