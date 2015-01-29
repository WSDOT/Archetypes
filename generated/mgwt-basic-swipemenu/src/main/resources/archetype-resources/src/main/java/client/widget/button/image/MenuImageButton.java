#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.widget.button.image;

import ${package}.client.widget.image.LocalImageHolder;
import com.googlecode.mgwt.ui.client.widget.button.ImageButton;

public class MenuImageButton extends ImageButton {

	public MenuImageButton() {
		super(LocalImageHolder.get().menu());
	}

}
