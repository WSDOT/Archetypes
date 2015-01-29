#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import ${package}.client.activities.MenuView;
import ${package}.client.activities.about.AboutView;
import ${package}.client.activities.home.HomeView;
import ${package}.client.activities.sample.SampleView;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.ui.client.widget.menu.swipe.SwipeMenu;


public interface ClientFactory {

	public HomeView getHomeView();
	public EventBus getEventBus();
	public PlaceController getPlaceController();
	public SwipeMenu getSwipeMenu();
	
	/**
	 * @return
	 */
	public AboutView getAboutView();
	public SampleView getSampleView();
        public MenuView getMenuView();
}
