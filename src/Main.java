public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 66.56;
        double h = 1.67;
        double Bmi = service.calculate(m, h);
        System.out.println(Bmi);
    }
}
