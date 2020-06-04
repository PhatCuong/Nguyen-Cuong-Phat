import builder.Builder;
import builder.BykeBuilder;
import builder.TennisBuilder;
import builder.ZumbaBuilder;
import feature.*;
import type.BykeBooking;
import type.TennisBooking;
import type.ZumbaBooking;

public class Director {
    public static void createTennisBooking(TennisBuilder tennisBuilder){
        tennisBuilder.setBuyer(new Buyer("Alice", 20));
        tennisBuilder.setOwner(new Owner("Bob", 21));
        tennisBuilder.setCourt(new Court("Court1", "Center1"));
    }

    public static void createZumbaBooking(ZumbaBuilder zumbaBuilder){
        zumbaBuilder.setBuyer(new Buyer("Jack", 20));
        zumbaBuilder.setOwner(new Owner("John", 30));
        zumbaBuilder.setClassRoom(new ClassRoom("B305", "VGU"));
    }

    public static void createBykeBooking(BykeBuilder bykeBuilder){
        bykeBuilder.setBuyer(new Buyer("Tom", 15));
        bykeBuilder.setOwner(new Owner("Jerry", 2));
        bykeBuilder.setStation(new Station("Station1", "HCM"));
    }
}
