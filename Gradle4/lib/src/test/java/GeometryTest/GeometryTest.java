import org.testng.Assert;
import org.testng.annotations.Test;

public class GeometryTest {

    private final double epsilon = 0.1;

    @Test
    public void testAreaRect() {
        float width = 5.0f;
        float height = 3.0f;
        float expectedArea = 15.0f;
        float actualArea = Geometry.areaRect(width, height);
        Assert.assertEquals(actualArea, expectedArea, epsilon);
    }

    @Test
    public void testPerimeterRect() {
        float width = 5.0f;
        float height = 3.0f;
        float expectedPerimeter = 16.0f;
        float actualPerimeter = Geometry.perimeterRect(width, height);
        Assert.assertEquals(actualPerimeter, expectedPerimeter, epsilon);
    }

    @Test
    public void testVolumeSphere() {
        float radius = 2.0f;
        float expectedVolume = 33.51f;
        float actualVolume = Geometry.volumeSphere(radius);
        Assert.assertEquals(actualVolume, expectedVolume, epsilon);
    }

    @Test
    public void testSurfaceAreaSphere() {
        float radius = 2.0f;
        float expectedSurfaceArea = 50.27f;
        float actualSurfaceArea = Geometry.surfaceAreaSphere(radius);
        Assert.assertEquals(actualSurfaceArea, expectedSurfaceArea, epsilon);
    }
}
