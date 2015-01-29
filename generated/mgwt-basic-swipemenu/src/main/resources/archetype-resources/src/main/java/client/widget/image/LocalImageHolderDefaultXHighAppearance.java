#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.widget.image;

import ${package}.client.widget.image.LocalImageHolder.LocalImageHolderAppearance;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public class LocalImageHolderDefaultXHighAppearance implements
        LocalImageHolderAppearance {

    public interface Resources extends ClientBundle, Images {

        Resources INSTANCE = GWT.create(Resources.class);

        @Source("resources/ic_action_menu_xhdpi.png")
        ImageResource menu();
    }

    @Override
    public Images get() {
        return Resources.INSTANCE;
    }

}
