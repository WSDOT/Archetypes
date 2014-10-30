#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import ${package}.client.activities.about.AboutView;
import ${package}.client.activities.home.HomeView;
import ${package}.client.activities.sample.SampleView;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;


public interface ClientFactory {

	public HomeView getHomeView();
	public EventBus getEventBus();
	public PlaceController getPlaceController();
	
	/**
	 * @return
	 */
	public AboutView getAboutView();
	public SampleView getSampleView();
}
