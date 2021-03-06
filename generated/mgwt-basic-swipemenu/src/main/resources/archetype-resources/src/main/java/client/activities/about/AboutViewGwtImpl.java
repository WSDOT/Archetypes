#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.activities.about;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.ui.client.widget.button.image.PreviousitemImageButton;

public class AboutViewGwtImpl extends Composite implements AboutView {

	/**
	 * The UiBinder interface.
	 */	
	interface AboutViewGwtImplUiBinder extends
			UiBinder<Widget, AboutViewGwtImpl> {
	}

	/**
	 * The UiBinder used to generate the view.
	 */
	private static AboutViewGwtImplUiBinder uiBinder = GWT
			.create(AboutViewGwtImplUiBinder.class);
	

	@UiField
	PreviousitemImageButton backButton;
	
	private Presenter presenter;
	
	public AboutViewGwtImpl() {
	
		initWidget(uiBinder.createAndBindUi(this));

	}

	@UiHandler("backButton")
	protected void onBackButtonPressed(TapEvent event) {
		if (presenter != null) {
			presenter.onBackButtonPressed();
		}
	}
	
	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}