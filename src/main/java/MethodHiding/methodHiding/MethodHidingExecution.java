package MethodHiding.methodHiding;
/***
 * 
 * @author Nandha Kumar KR
 * 
 * Since method show() is class method(static)
 * So the method invocation is determined by the type of reference variable
 * rather than type of object.
 *
 */

public class MethodHidingExecution {

  public static void main(String[] args) {
   
    MethodHidingSuper methodHidingSuper = new MethodOverridingSub();
    methodHidingSuper.show();
    //prints Static Method - From Super class
  }

}
