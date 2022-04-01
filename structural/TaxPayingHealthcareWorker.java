package structural;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator{
    public TaxPayingHealthcareWorker(HealthcareWorker member) {
        super(member);
        System.out.println("Decorate " + member.getName() + " with TaxPaying.");
    }

    @Override
    public double getPrice() {
        double priceTaxed = 0.0;
        priceTaxed = super.getPrice() * 1.1;
        return priceTaxed;
    }
}