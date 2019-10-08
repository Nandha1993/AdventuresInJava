package MethodHiding.methodHiding;
/**
 * 
 * @author Nandha Kumar KR
 * 
 * This POC Demonstrates the static method hiding
 * Static Method cannot overwriden because it is resolved at compile time
 * But when the subclass overwriding super class static method with static key word
 * it is called method hiding
 *
 */


public class MethodHidingSuper {

  static void show() {
    System.out.println("Static Method - From Super class");
  }

}
