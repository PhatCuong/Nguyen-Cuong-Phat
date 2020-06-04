package type;

import feature.Buyer;
import feature.ClassRoom;
import feature.Owner;
import feature.Type;

public class ZumbaBooking extends Booking {
    private ClassRoom classRoom;

    public ZumbaBooking(Owner owner, Buyer buyer, ClassRoom classRoom) {
        super(Type.ZUMBA_BOOKING, owner, buyer);
        this.classRoom = classRoom;
    }

    @Override
    public void displayInfo() {
        System.out.println("**********************************");
        System.out.printf("Type: %s\n", super.getType());
        System.out.printf("Owner: %s - %s years old\n", super.getOwner().getName(), super.getOwner().getAge());
        System.out.printf("Buyer: %s - %s years old\n", super.getBuyer().getName(), super.getBuyer().getAge());
        System.out.printf("Class: %s \t Center: %s\n", classRoom.getRoom(), classRoom.getCenterName());
    }
}
