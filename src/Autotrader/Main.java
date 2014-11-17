package Autotrader;

/**
 * Created by Alena on 02.11.2014.
 */
public class Main {
    public static void main(String[] args) {

        VehiclesForSale V1 = new VehiclesForSale();

        System.out.println(V1.getID() + "");
        System.out.println(V1.getMake() + "");
        System.out.println(V1.getYear() + "");
        System.out.println(V1.getSpecifications() + "");
        System.out.println(V1.getDesignCharacteristics() + "");
        System.out.println(V1.getTechnicalCondition() + "");
        System.out.println(V1.getPrice() + "");


        System.out.println(V1.getMake() + "" + V1.getYear());
        System.out.println(" V1 is\n " + V1.toString());

        VehiclesForSale V2 = new VehiclesForSale();
        V2.setID("02");
        V2.setMake("Chevrolet Corvette Convertible");
        V2.setYear(2015);
        V2.setSpecifications("2 wheel drive - rear; 8 Speed Shiftable Automatic; Gasoline");
        V2.setDesignCharacteristics("Exterior: Velocity Yellow Tintcoat");
        V2.setTechnicalCondition("New");
        V2.setPrice(77000);

        System.out.println(V2.getMake() + " " + V2.getYear());
        System.out.println(" V2 is\n " + V2.toString());


        VehiclesForSale V3 = new VehiclesForSale();
        V3.setID("03");
        V3.setMake("Cadillac ATS");
        V3.setYear(2014);
        V3.setSpecifications("10,106 miles; Flexible Fuel; Interior: Morello Red; 6 Cylinder; 6 Speed Shiftable Automatic; All wheel drive");
        V3.setDesignCharacteristics("Exterior: Black Raven; NAVIGATION / GPS!; 10 Speakers; FULLY RECONDITIONED!");
        V3.setTechnicalCondition("Used");
        V3.setPrice(31000);

        System.out.println(V3.getMake() + " " + V3.getYear());
        System.out.println(" V3 is\n " + V3.toString());


        VehiclesForSale V4 = new VehiclesForSale();
        V4.setID("04");
        V4.setMake("Volkswagen Touareg ");
        V4.setYear(2014);
        V4.setSpecifications("Diesel; 6 Cylinder Turbo; 8 Speed Shiftable Automatic; All wheel drive");
        V4.setDesignCharacteristics("Exterior:Pure White; Heated Front Bucket Seats; Heated front seats; Air Conditioning");
        V4.setTechnicalCondition("New");
        V4.setPrice(53600);

        System.out.println(V4.getMake() + " " + V4.getYear());
        System.out.println(" V4 is\n " + V4.toString());


        VehiclesForSale V5 = new VehiclesForSale();
        V5.setID("05");
        V5.setMake("Ferrari California");
        V5.setYear(2010);
        V5.setSpecifications("13,130 miles; Convertible; Gasoline; 8 Cylinder; 7 Speed Shiftable Automatic; 2 wheel drive - rear");
        V5.setDesignCharacteristics("Exterior and Interior: Black; Heated Seats; Keyless Entry; Multi-zone Climate Control; Security System");
        V5.setTechnicalCondition("Used");
        V5.setPrice(134000);
        System.out.println(V5.getMake() + " " + V5.getYear());
        System.out.println(" V5 is\n " + V5.toString());


        //constructor:
        VehiclesForSale V6 = new VehiclesForSale("06", "lala", 1958, "dada", "fafa", "Used", 12000);
        System.out.println(" V6 is\n " + V6.toString());

        //MegaSetter:
        VehiclesForSale V7 = new VehiclesForSale();
        V7.megaSetter("07", "nana", 2010, "tata", "haha", "Used", 134000);
        System.out.println(" V7 is\n " + V7.toString());


    }
}
