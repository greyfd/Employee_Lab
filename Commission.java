public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double sales) {
        this.totalSales =+ sales;
    }

    @Override
    public double pay() {
        double pay =  super.pay() + (commissionRate * totalSales);
        totalSales = 0;
        return pay;
    }

    @Override
    public String toString() {
        String res =  super.toString();
        res += "\nTotal Sales " + totalSales;
        return res;
    }
}
