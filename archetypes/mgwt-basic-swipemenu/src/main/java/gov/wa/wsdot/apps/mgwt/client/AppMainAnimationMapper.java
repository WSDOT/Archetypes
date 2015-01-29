package gov.wa.wsdot.apps.mgwt.client;

import gov.wa.wsdot.apps.mgwt.client.activities.about.AboutPlace;
import gov.wa.wsdot.apps.mgwt.client.activities.home.HomePlace;
import gov.wa.wsdot.apps.mgwt.client.activities.sample.SamplePlace;
import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.mvp.client.AnimationMapper;
import com.googlecode.mgwt.ui.client.widget.animation.Animation;
import com.googlecode.mgwt.ui.client.widget.animation.Animations;

public class AppMainAnimationMapper implements AnimationMapper {

  @Override
  public Animation getAnimation(Place oldPlace, Place newPlace) {
    if (oldPlace == null) {
      return Animations.FADE;
    }
    
    if (oldPlace instanceof SamplePlace && newPlace instanceof HomePlace) {
        return Animations.FADE_REVERSE;
    }
    
    if (oldPlace instanceof AboutPlace && newPlace instanceof HomePlace) {
        return Animations.FADE_REVERSE;
    }
    
    return Animations.FADE;

  }

}
