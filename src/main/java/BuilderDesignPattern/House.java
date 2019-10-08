package BuilderDesignPattern;

/**
 * 
 * @author Nandha Kumar KR
 *
 */

// Builder Pattern defines the way of creating complex object.
// It seperates the object construction logic and object representation

//House getting quote from various vendor is the end outcome. The complex object here is House

public class House {

  private String flooring;
  
  private String constructionMaterial;
  
  private String electricalWiring;
  
  private String carpentryGrade;
  

  public String getFlooring() {
    return flooring;
  }

  public String getConstructionMaterial() {
    return constructionMaterial;
  }

  public String getElectricalWiring() {
    return electricalWiring;
  }

  public String getCarpentryGrade() {
    return carpentryGrade;
  }

  public void setFlooring(String flooring) {
    this.flooring = flooring;
  }

  public void setConstructionMaterial(String constructionMaterial) {
    this.constructionMaterial = constructionMaterial;
  }

  public void setElectricalWiring(String electricalWiring) {
    this.electricalWiring = electricalWiring;
  }

  public void setCarpentryGrade(String carpentryGrade) {
    this.carpentryGrade = carpentryGrade;
  }  
  
}
