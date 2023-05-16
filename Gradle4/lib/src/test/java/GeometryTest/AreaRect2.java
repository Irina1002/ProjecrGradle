package GeometryTest;

import org.apache.commons.math3.stat.descriptive.moment.GeometricMean;
import org.testng.annotations.Test;


@Test
public class AreaRect2 {
  public void testAreaRect() {
	  GeometricMean geometry = new Geometry();
      float width = 6;
      float height = 25;
      float expectedArea = 150;
      float actualArea = geometry.areaRect(width, height);
     
  }


}
