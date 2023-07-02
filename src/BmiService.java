public class BmiService {
    public int calc(double wInMeters, double hInKg) {
        double result = hInKg / Math.pow(wInMeters, 2);
        return (int) result;
    }
}