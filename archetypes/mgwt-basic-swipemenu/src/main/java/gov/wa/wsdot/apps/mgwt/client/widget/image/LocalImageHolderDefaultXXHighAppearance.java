package gov.wa.wsdot.apps.mgwt.client.widget.image;

import gov.wa.wsdot.apps.mgwt.client.widget.image.LocalImageHolder.LocalImageHolderAppearance;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public class LocalImageHolderDefaultXXHighAppearance implements
        LocalImageHolderAppearance {

    public interface Resources extends ClientBundle, Images {

        Resources INSTANCE = GWT.create(Resources.class);

        @Source("resources/ic_action_menu_xxhdpi.png")
        ImageResource menu();
    }

    @Override
    public Images get() {
        return Resources.INSTANCE;
    }

}
