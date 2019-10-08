package BuilderDesignPattern;

//VendorXYZBuilder's Quote- Concrete Builder Class
public class VendorXYZBuilder implements HouseBuilder{
  
  private House house;
  
  VendorXYZBuilder() {
    house = new House();
  }

  @Override
  public void flooring() {
    house.setFlooring("Granite");    
  }

  @Override
  public void constructionMaterial() {
    house.setConstructionMaterial("Shankar Cement RMT Steel");    
  }

  @Override
  public void electricalWiring() {
   house.setElectricalWiring("Anchor");    
  }

  @Override
  public void carpentryGrade() {
    house.setCarpentryGrade("Teak");    
  }

  @Override
  public House getHouse() {
    // TODO Auto-generated method stub
    return house;
  }

}
