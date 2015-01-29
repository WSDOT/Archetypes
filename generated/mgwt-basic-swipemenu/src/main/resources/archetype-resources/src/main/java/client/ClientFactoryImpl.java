#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import ${package}.client.activities.MenuView;
import ${package}.client.activities.MenuViewGwtImpl;
import ${package}.client.activities.about.AboutView;
import ${package}.client.activities.about.AboutViewGwtImpl;
import ${package}.client.activities.home.HomeView;
import ${package}.client.activities.home.HomeViewGwtImpl;
import ${package}.client.activities.sample.SampleView;
import ${package}.client.activities.sample.SampleViewGwtImpl;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.googlecode.mgwt.ui.client.widget.menu.swipe.SwipeMenu;

public class ClientFactoryImpl implements ClientFactory {

	private EventBus eventBus;
	private PlaceController placeController;
	private SwipeMenu swipeMenu;
	private HomeView homeView;
	private AboutViewGwtImpl aboutView;
	private SampleViewGwtImpl sampleView;
	private MenuViewGwtImpl menuView;

	public ClientFactoryImpl() {
		eventBus = new SimpleEventBus();
		placeController = new PlaceController(eventBus);
		swipeMenu = new SwipeMenu();
		homeView = new HomeViewGwtImpl();
	}

	@Override
	public HomeView getHomeView() {
	    if (homeView == null) {
            homeView = new HomeViewGwtImpl();
	    }
		
		return homeView;
	}	
	
	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

    @Override
    public SwipeMenu getSwipeMenu() {
        return swipeMenu;
    }
	
	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public AboutView getAboutView() {
		if (aboutView == null) {
			aboutView = new AboutViewGwtImpl();
		}
		
		return aboutView;
	}

    @Override
    public SampleView getSampleView() {
        if (sampleView == null) {
            sampleView = new SampleViewGwtImpl();
        }

        return sampleView;
    }

    @Override
    public MenuView getMenuView() {
        if (menuView == null) {
            menuView = new MenuViewGwtImpl();
        }
        return menuView;
    }

}
