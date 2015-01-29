package gov.wa.wsdot.apps.mgwt.client;

import gov.wa.wsdot.apps.mgwt.client.activities.MenuView;
import gov.wa.wsdot.apps.mgwt.client.activities.about.AboutView;
import gov.wa.wsdot.apps.mgwt.client.activities.home.HomeView;
import gov.wa.wsdot.apps.mgwt.client.activities.sample.SampleView;
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
