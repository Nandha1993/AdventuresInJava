package ObserverDesignPattern;

/**
 * 
 * @author NandhaKumar KR
 *
 */

//Concrete Observer classes - FollowerA, FollowerB, FollowerC implements Observer Interface
public interface Observer {
  
   void notifyUpdate(Status statusMessage);

}
