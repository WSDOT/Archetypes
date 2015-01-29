#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.activities.home;

import java.util.ArrayList;
import java.util.List;

import ${package}.client.ClientFactory;
import ${package}.client.activities.sample.SamplePlace;
import ${package}.shared.Topic;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

public class HomeActivity extends MGWTAbstractActivity implements
		HomeView.Presenter {

	private final ClientFactory clientFactory;
	private HomeView view;
		
	public HomeActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		view = clientFactory.getHomeView();
		view.setPresenter(this);
		view.render(createTopicsList());
		view.refresh();
		
		panel.setWidget(view);
	}

    private List<Topic> createTopicsList() {
        ArrayList<Topic> list = new ArrayList<Topic>();
        
        list.add(new Topic("Sample Activity"));
        
        return list;
    }

    @Override
    public void onItemSelected(int index) {
        if (index == 0) {
            clientFactory.getPlaceController().goTo(new SamplePlace());
            
            return;
        }        
    }

    @Override
    public void onMenuButtonPressed() {
        if (!clientFactory.getSwipeMenu().isOpen()) {
            clientFactory.getSwipeMenu().open();
        } else {
            clientFactory.getSwipeMenu().close();
        }
    }

}