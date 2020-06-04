package type;

import feature.Buyer;
import feature.Owner;
import feature.Station;
import feature.Type;

public class BykeBooking extends Booking {
    private Station station;
    public BykeBooking(Owner owner, Buyer buyer, Station station) {
        super(Type.BYKE_BOOKING, owner, buyer);
        this.station = station;
    }

    @Override
    public void displayInfo() {
        System.out.println("**********************************");
        System.out.printf("Type: %s\n", super.getType());
        System.out.printf("Owner: %s - %s years old\n", super.getOwner().getName(), super.getOwner().getAge());
        System.out.printf("Buyer: %s - %s years old\n", super.getBuyer().getName(), super.getBuyer().getAge());
        System.out.printf("Station: %s \t Center: %s\n", station.getStation(), station.getCenterName());
    }
}
