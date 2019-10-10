package ObserverDesignPattern;

/**
 * 
 * @author NandhaKumar KR
 *
 */
//Concrete Observer class
public class FollowerA implements Observer{

  @Override
  public void notifyUpdate(Status statusMessage) {
    System.out.println("Follower A "+ statusMessage.getStatusMessage());
  }

}
