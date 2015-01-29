package gov.wa.wsdot.apps.mgwt.client.activities.about;

import com.google.gwt.user.client.ui.IsWidget;

public interface AboutView extends IsWidget {
	
	public void setPresenter(Presenter presenter);
	
	public interface Presenter {
		
		public void onBackButtonPressed();
		
	}
}