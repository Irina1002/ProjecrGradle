package GeometryTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreaRect1 {
	@Test
    public void testAreaRect1() {
        float width = 5.0f;
        float height = 3.0f;
        float expectedArea = 15.0f;
        float actualArea = GeometryTest.areaRect(width, height);
        
  }
}
