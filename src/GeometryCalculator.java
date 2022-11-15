public class GeometryCalculator {
    private static final double PI = Math.PI;
    // метод должен использовать абсолютное значение radius

    public static double getCircleSquare(double radius)
    {
        double circleSquare = PI * radius * radius;

        return circleSquare;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius)
    {
        double sphereVolume = (4.0 / 3.0) * PI * (Math.pow(radius, 3));

        return sphereVolume;
    }

    public static boolean isTriangleRightAngled(double a, double b, double c)
    {
        if (a + b > c)
        {
            return true;
        } else if (a + c > b)
        {
            return true;
        } else if (b + c > a)
        {
            return true;
        } else
        {
            return false;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c)
    {
        if (!isTriangleRightAngled(a, b, c))
        {
            return -1.0;
        }

        double semiPerimeter = (a + b + c) / 2;

        double triangleSquare = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

        return triangleSquare;
    }
}
