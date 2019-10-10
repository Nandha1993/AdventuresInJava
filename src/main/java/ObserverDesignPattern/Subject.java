package ObserverDesignPattern;

/**
 * 
 * @author Nandha Kumar KR
 *
 */
// Observer Design Pattern
//Subject establish one to many relationship with observers

public interface Subject {

  public void registerFollower(Observer o);
  public void unRegisterFollower(Observer o);
  public void notifyAllFollowers(Status status);
  
}
