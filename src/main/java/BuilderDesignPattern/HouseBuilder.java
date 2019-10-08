package BuilderDesignPattern;

//It is an builder interface consists of actual parts to generate house construction quote
public interface HouseBuilder {

  void flooring();
  
  void constructionMaterial();
  
  void electricalWiring();
  
  void carpentryGrade();
  
  House getHouse();
  
  
}
