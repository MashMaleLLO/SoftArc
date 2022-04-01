package structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker {
    protected HealthcareWorker member;

    public HealthcareWorkerDecorator(HealthcareWorker member) {
        super(member);
        this.member = member;
    }

    @Override
    public void service() {
        member.service();
    }

    @Override
    public double getPrice() {
        return member.getPrice();
    }
}