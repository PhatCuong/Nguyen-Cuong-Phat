package type;

import feature.Buyer;
import feature.Court;
import feature.Owner;
import feature.Type;

public class TennisBooking extends Booking {
    private Court court;

    public TennisBooking(Owner owner, Buyer buyer, Court court){
        super(Type.TENNIS_BOOKING, owner, buyer);
        this.court = court;
    }

    public void displayInfo() {
            System.out.println("**********************************");
            System.out.printf("Type: %s\n", super.getType());
            System.out.printf("Owner: %s - %s years old\n", super.getOwner().getName(), super.getOwner().getAge());
            System.out.printf("Buyer: %s - %s years old\n", super.getBuyer().getName(), super.getBuyer().getAge());
            System.out.printf("Court: %s \t Center: %s\n", court.getCourt(), court.getSportCenterName());
    }
}
