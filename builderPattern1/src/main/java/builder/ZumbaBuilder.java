package builder;

import feature.Buyer;
import feature.ClassRoom;
import feature.Owner;
import type.Booking;
import type.ZumbaBooking;

public class ZumbaBuilder implements Builder {
    private Owner owner;
    private Buyer buyer;
    private ClassRoom classRoom;


    @Override
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }


    @Override
    public Booking getProduct() {
        return new ZumbaBooking(owner, buyer, classRoom);
    }

}
