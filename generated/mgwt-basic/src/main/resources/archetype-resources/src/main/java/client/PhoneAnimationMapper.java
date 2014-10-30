#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import ${package}.client.activities.about.AboutPlace;
import ${package}.client.activities.home.HomePlace;
import ${package}.client.activities.sample.SamplePlace;

import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.mvp.client.AnimationMapper;
import com.googlecode.mgwt.ui.client.widget.animation.Animation;
import com.googlecode.mgwt.ui.client.widget.animation.Animations;

public class PhoneAnimationMapper implements AnimationMapper {

	@Override
	public Animation getAnimation(Place oldPlace, Place newPlace) {
		if (oldPlace instanceof AboutPlace && newPlace instanceof HomePlace) {
			return Animations.SLIDE_REVERSE;
		}
		
		if (oldPlace instanceof SamplePlace && newPlace instanceof HomePlace) {
		    return Animations.SLIDE_REVERSE;
		}
		
		if (oldPlace == null && newPlace instanceof HomePlace) {
			return Animations.FADE;
		}
		
		return Animations.SLIDE;
	}

}
