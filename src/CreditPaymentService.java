public class CreditPaymentService {
    public double calculate(double summa, double rate, int term) {
        double coefficient = rate / 12 / 100 * Math.pow(1 + rate / 12 / 100, term) / (Math.pow(1 + rate / 12 / 100, term) - 1);
        double monthlyPayment = summa * coefficient;
        return monthlyPayment;
    }
}
