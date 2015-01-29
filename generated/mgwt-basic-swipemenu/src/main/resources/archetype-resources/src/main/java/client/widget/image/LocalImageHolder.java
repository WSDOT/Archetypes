#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.widget.image;

import ${package}.client.widget.image.LocalImageHolder.LocalImageHolderAppearance.Images;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ImageResource;

public class LocalImageHolder {
    private static final LocalImageHolderAppearance APPEARANCE = GWT
            .create(LocalImageHolderAppearance.class);
    
    public interface LocalImageHolderAppearance {
        public interface Images {
            ImageResource menu();
        }
        
        Images get();
    }
    
    public static Images get() {
        return APPEARANCE.get();
    }
}
