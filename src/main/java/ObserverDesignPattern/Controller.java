package ObserverDesignPattern;

/**
 * 
 * @author NandhaKumar KR
 *
 */
//Observer Design Pattern promotes loosely coupling between objects
//because the subject is concrete class which is independent to concrete Observers
//prevents OOPs violation - data abstraction is guarded.

public class Controller {

  public static void main(String[] args) {

    FacebookStatusPublisher publisher = new FacebookStatusPublisher();
    FollowerA followerA = new FollowerA();
    FollowerB followerB = new FollowerB();
    FollowerC followerC = new FollowerC();
    
    publisher.registerFollower(followerA);
    publisher.registerFollower(followerB);
    publisher.registerFollower(followerC);
    
    Status statusMessage = new Status("Great Time");
    publisher.notifyAllFollowers(statusMessage);
    
    publisher.unRegisterFollower(followerB);
    publisher.notifyAllFollowers(statusMessage);
    
  }

}
