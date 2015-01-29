package gov.wa.wsdot.apps.mgwt.client.activities.home;

import gov.wa.wsdot.apps.mgwt.shared.Topic;

import java.util.List;

import com.google.gwt.user.client.ui.IsWidget;

public interface HomeView extends IsWidget {
	
	public void setPresenter(Presenter presenter);
	
	public interface Presenter {
	
		public void onItemSelected(int index);

        public void onMenuButtonPressed();
		
	}
	
	public void render(List<Topic> createTopicsList);
	
	public void refresh();

}
