package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Nandha Kumar KR
 *
 */

//Concrete Subject class
public class FacebookStatusPublisher implements Subject {
  
  //List of subsribed observers
  List<Observer> observers = new ArrayList<Observer>(); 

  @Override
  public void registerFollower(Observer o) {
    observers.add(o);
  }

  @Override
  public void unRegisterFollower(Observer o) {
    observers.remove(o);
    
  }

  @Override
  public void notifyAllFollowers(Status statusMessage) {
    for(Observer o : observers) {
      o.notifyUpdate(statusMessage);
    }
    
  }

}
