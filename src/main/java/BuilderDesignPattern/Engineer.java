package BuilderDesignPattern;

public class Engineer {
  
  private HouseBuilder chosenbuilder;
  
  Engineer(HouseBuilder builder) {
    chosenbuilder = builder;
  }
  
  public void constructHouse() {
    chosenbuilder.flooring();
    chosenbuilder.constructionMaterial();
    chosenbuilder.electricalWiring();
    chosenbuilder.carpentryGrade();
  }
  
  public House getHouseQuote() {
    return chosenbuilder.getHouse();
  }
  

}
