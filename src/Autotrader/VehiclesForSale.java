package Autotrader;

import java.util.Date;

/**
 * Created by Alena on 02.11.2014.
 */
public class VehiclesForSale {
//Автосалон. Продает новые и подержаные отечественные и иностранные автомобили.
//Автомобили характеризуются: марка, год выпуска, тех. характеристики,особенности исполнения, тех. состояние,запрашиваемая цена.
//на вторник - реализовать класс, который будет описывать автомобили исходя из этой предметной области.
//Make - Year - Specifications- Design Characteristics - Technical Condition - Price

    //Объявляем переменные:
    private String ID = "01";
    private String Make = "Audi S4";
    private int Year = 2006;
    private String Specifications = "The extra set of wheels included. Engine: 4.2L V8 SFI. 106,000 miles ";
    private String DesignCharacteristics = "Black; Model:S4 Quattro;Body: Sedan 4D ";
    private String TechnicalCondition = "Used, in good condition and with a CLEAN HISTORY";
    private int Price = 14000;

    //заполненный конструктор:
    public VehiclesForSale(String ID, String make, int year, String specifications, String designCharacteristics, String technicalCondition, int price) {
        this.ID = ID;
        this.Make = make;
        this.Year = year;
        this.Specifications = specifications;
        this.DesignCharacteristics = designCharacteristics;
        this.TechnicalCondition = technicalCondition;
        this.Price = price;
    }

    //пустой конструктор:
    public VehiclesForSale() {

    }

    //Getters&Setters:
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getSpecifications() {
        return Specifications;
    }

    public void setSpecifications(String specifications) {
        Specifications = specifications;
    }

    public String getDesignCharacteristics() {
        return DesignCharacteristics;
    }

    public void setDesignCharacteristics(String designCharacteristics) {
        DesignCharacteristics = designCharacteristics;
    }

    public String getTechnicalCondition() {
        return TechnicalCondition;
    }

    public void setTechnicalCondition(String technicalCondition) {
        TechnicalCondition = technicalCondition;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }


    //toString:
    @Override
    public String toString() {
        return "VehiclesForSale{" +
                "ID='" + ID + '\'' +
                ", Make='" + Make + '\'' +
                ", Year=" + Year +
                ", Specifications='" + Specifications + '\'' +
                ", DesignCharacteristics='" + DesignCharacteristics + '\'' +
                ", TechnicalCondition='" + TechnicalCondition + '\'' +
                ", Price=" + Price +
                '}';
    }

    //megaSetter:
    public void megaSetter(String ID, String Make, int Year, String Specifications, String DesignCharacteristics, String TechnicalConditions, int Price) {
        this.ID = ID;
        this.Make = Make;
        this.Year = Year;
        this.Specifications = Specifications;
        this.DesignCharacteristics = DesignCharacteristics;
        this.TechnicalCondition = TechnicalConditions;
        this.Price = Price;

    }
}


