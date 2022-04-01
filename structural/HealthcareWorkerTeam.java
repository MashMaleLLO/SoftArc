package structural;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class HealthcareWorkerTeam implements HealthcareServiceable{

    public Set<HealthcareServiceable> members = new LinkedHashSet<>();

    public HealthcareWorkerTeam() {
    }

    public void addMember(HealthcareServiceable member) {
        this.members.add(member);
    }

    public void removeMember(HealthcareServiceable member){
        this.members.remove(member);
    }

    public void service() {
        for (HealthcareServiceable member: members){
            member.service();
        }
    }

    public double getPrice() {
        double totalPrice = 0.0;

        for (HealthcareServiceable member : members){
            totalPrice += member.getPrice();
        }

        return totalPrice;
    }
}