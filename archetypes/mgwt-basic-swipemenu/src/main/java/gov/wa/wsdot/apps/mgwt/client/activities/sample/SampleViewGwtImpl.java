package gov.wa.wsdot.apps.mgwt.client.activities.sample;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.ui.client.widget.button.image.PreviousitemImageButton;

public class SampleViewGwtImpl extends Composite implements SampleView {

	/**
	 * The UiBinder interface.
	 */	
	interface SampleViewGwtImplUiBinder extends
			UiBinder<Widget, SampleViewGwtImpl> {
	}

	/**
	 * The UiBinder used to generate the view.
	 */
	private static SampleViewGwtImplUiBinder uiBinder = GWT
			.create(SampleViewGwtImplUiBinder.class);
	

	@UiField
	PreviousitemImageButton backButton;
	
	private Presenter presenter;
	
	public SampleViewGwtImpl() {
	
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