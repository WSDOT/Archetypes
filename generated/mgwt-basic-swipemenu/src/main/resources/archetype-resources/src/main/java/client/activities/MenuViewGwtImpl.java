#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.activities;

import java.util.List;

import ${package}.shared.Topic;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.ui.client.widget.button.image.AboutImageButton;
import com.googlecode.mgwt.ui.client.widget.list.celllist.BasicCell;
import com.googlecode.mgwt.ui.client.widget.list.celllist.CellList;
import com.googlecode.mgwt.ui.client.widget.list.celllist.CellSelectedEvent;

public class MenuViewGwtImpl extends Composite implements MenuView {

	/**
	 * The UiBinder interface.
	 */	
	interface MenuViewGwtImplUiBinder extends
			UiBinder<Widget, MenuViewGwtImpl> {
	}
	
	/**
	 * The UiBinder used to generate the view.
	 */
	private static MenuViewGwtImplUiBinder uiBinder = GWT
			.create(MenuViewGwtImplUiBinder.class);
	
	@UiField
	AboutImageButton aboutButton;
	
	@UiField(provided = true)
	CellList<Topic> cellList;
	
	private Presenter presenter;
	
	public MenuViewGwtImpl() {
		
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

    @UiHandler("aboutButton")
    protected void onAboutButtonPressed(TapEvent event) {
        if (presenter != null) {
            presenter.onAboutButtonPressed();
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
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public void render(List<Topic> createTopicsList) {
		cellList.render(createTopicsList);
	}

	@Override
	public void setSelected(int lastIndex, boolean b) {
		cellList.setSelectedIndex(lastIndex, b);
	}

}
