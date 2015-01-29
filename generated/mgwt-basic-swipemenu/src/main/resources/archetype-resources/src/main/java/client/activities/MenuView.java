#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.activities;

import java.util.List;

import ${package}.shared.Topic;
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
