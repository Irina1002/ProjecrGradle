public class Geometry {

    public static float areaRect(float width, float height) {
        return width * height;
    }

    public static float perimeterRect(float width, float height) {
        return 2 * (width + height);
    }

    public static float volumeSphere(float radius) {
        return (float) (4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
    }

    public static float surfaceAreaSphere(float radius) {
        return (float) (4.0 * Math.PI * Math.pow(radius, 2));
    }
}

