package BuilderDesignPattern;

//VendorABCBuilder's Quote- Concrete Builder Class
public class VendorABCBuilder implements HouseBuilder {
  
  private House house;
  
  VendorABCBuilder() {
    house = new House();
  }

  @Override
  public void flooring() {
    house.setFlooring("Virtified-Tiles");    
  }

  @Override
  public void constructionMaterial() {
   house.setConstructionMaterial("Sankar Cement, RMT Steel");    
  }

  @Override
  public void electricalWiring() {
    house.setElectricalWiring("Finolaux");    
  }

  @Override
  public void carpentryGrade() {
    house.setCarpentryGrade("Green Ply");    
  }

  @Override
  public House getHouse() {
    return house;
  }

}
