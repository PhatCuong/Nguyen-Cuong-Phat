import builder.BykeBuilder;
import builder.TennisBuilder;
import builder.ZumbaBuilder;
import feature.Buyer;
import feature.Court;
import feature.Owner;
import type.Booking;
import type.TennisBooking;


public class Client {
    public static void main (String args[]) {
        TennisBuilder tennisBuilder = new TennisBuilder();
        Director.createTennisBooking(tennisBuilder);
        Booking booking1 = tennisBuilder.getProduct();
        booking1.displayInfo();

        ZumbaBuilder zumbaBuilder = new ZumbaBuilder();
        Director.createZumbaBooking(zumbaBuilder);
        Booking booking2 = zumbaBuilder.getProduct();
        booking2.displayInfo();

        BykeBuilder bykeBuilder = new BykeBuilder();
        Director.createBykeBooking(bykeBuilder);
        Booking booking3 = bykeBuilder.getProduct();
        booking3.displayInfo();

    }
}
