package ObserverDesignPattern;

/**
 * 
 * @author NandhaKumar KR
 *
 */
//Concrete Observer class
public class FollowerB implements Observer {

  @Override
  public void notifyUpdate(Status statusMessage) {
   System.out.println("Follower B "+statusMessage.getStatusMessage() ); 
  }

}
