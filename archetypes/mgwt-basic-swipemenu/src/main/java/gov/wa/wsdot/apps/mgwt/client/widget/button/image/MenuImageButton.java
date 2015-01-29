package gov.wa.wsdot.apps.mgwt.client.widget.button.image;

import gov.wa.wsdot.apps.mgwt.client.widget.image.LocalImageHolder;
import com.googlecode.mgwt.ui.client.widget.button.ImageButton;

public class MenuImageButton extends ImageButton {

	public MenuImageButton() {
		super(LocalImageHolder.get().menu());
	}

}
