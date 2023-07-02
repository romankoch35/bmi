public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double wInMeters = 1.71;
        double hInKg = 75;
        int result = service.calc(wInMeters, hInKg);
        System.out.println("Индекс массы тела = " + result);
            }
        }
