package gov.wa.wsdot.apps.mgwt.client.activities;

import java.util.List;

import gov.wa.wsdot.apps.mgwt.shared.Topic;
import com.google.gwt.user.client.ui.IsWidget;

public interface MenuView extends IsWidget {
	
	public void setPresenter(Presenter presenter);
	
	public interface Presenter {
		
        public void onAboutButtonPressed();
        
	    public void onItemSelected(int index);
		
	}
	
	public void render(List<Topic> createTopicsList);
	
	public void setSelected(int lastIndex, boolean b);
	
}
