package BuilderDesignPattern;


//Test Class to test the builder pattern
public class TestBuilderPattern {

  public static void main(String[] args) {

    VendorABCBuilder abcBuilder = new VendorABCBuilder();
    Engineer engineer = new Engineer(abcBuilder);
    engineer.constructHouse();
    House house = engineer.getHouseQuote();
    System.out
        .println("House Quote : \n" + house.getFlooring() + "\n" + house.getConstructionMaterial()
            + "\n" + house.getElectricalWiring() + "\n" + house.getCarpentryGrade());

  }

}
