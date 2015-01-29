package gov.wa.wsdot.apps.mgwt.client.activities.home;

import java.util.List;

import gov.wa.wsdot.apps.mgwt.client.widget.button.image.MenuImageButton;
import gov.wa.wsdot.apps.mgwt.shared.Topic;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.ui.client.widget.list.celllist.BasicCell;
import com.googlecode.mgwt.ui.client.widget.list.celllist.CellList;
import com.googlecode.mgwt.ui.client.widget.list.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.panel.scroll.ScrollPanel;

public class HomeViewGwtImpl extends Composite implements HomeView {

	/**
	 * The UiBinder interface.
	 */	
	interface HomeViewGwtImplUiBinder extends UiBinder<Widget, HomeViewGwtImpl> {
	}
	
	/**
	 * The UiBinder used to generate the view.
	 */
	private static HomeViewGwtImplUiBinder uiBinder = GWT
			.create(HomeViewGwtImplUiBinder.class);
	
	@UiField
	MenuImageButton menuButton;
	
	@UiField
	ScrollPanel scrollPanel;
	
	@UiField(provided = true)
	CellList<Topic> cellList;
	
	private Presenter presenter;

	public HomeViewGwtImpl() {
	    
        cellList = new CellList<Topic>(new BasicCell<Topic>() {

            @Override
            public String getDisplayString(Topic model) {
                return model.getName();
            }

            @Override
            public boolean canBeSelected(Topic model) {
                return true;
            }
        });
		
		initWidget(uiBinder.createAndBindUi(this));

	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	@UiHandler("menuButton")
	protected void onMenuButtonPressed(TapEvent event) {
	    if (presenter != null) {
	        presenter.onMenuButtonPressed();
	    }
	}
	
    @UiHandler("cellList")
    protected void onCellSelected(CellSelectedEvent event) {
        if (presenter != null) {
            int index = event.getIndex();
            presenter.onItemSelected(index);
        }
    }
	
    @Override
    public void render(List<Topic> createTopicsList) {
        cellList.render(createTopicsList);
    }

    @Override
    public void refresh() {
        scrollPanel.refresh();
    }

}