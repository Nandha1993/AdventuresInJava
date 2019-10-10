package ObserverDesignPattern;

/**
 * 
 * @author NandhaKumar KR
 *
 */
//Concrete Observer class
public class FollowerC implements Observer{

  @Override
  public void notifyUpdate(Status statusMessage) {
    System.out.println("Follower C " +statusMessage.getStatusMessage());    
  }

}
