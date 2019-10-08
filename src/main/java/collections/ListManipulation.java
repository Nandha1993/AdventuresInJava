package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListManipulation {

  public static void main(String[] args) {
    System.out.println("Please enter your choice : ");
    Scanner sc = new Scanner(System.in);
    List<Integer> items = new ArrayList<Integer>(); 
    items.add(2);
    items.add(8);
    items.add(1);
    items.add(5);
    items.add(-4);
    while(true) {
      System.out.println("1. Stream API");
      System.out.println("2 Filter predicate");
      System.out.println("3 Stream manipulations");
      System.out.println("4 Stream map and flat map");
      System.out.println("5 Stream Parallel execution");
      System.out.println("6 Single sorting sequence");
      System.out.println("7 Multiple sorting sequence");
      int ch = sc.nextInt();
      switch(ch) {
        case 1 :
        {
          System.out.println("The Stream API is introduced in Java 8, that used to process the collection"
              + " of objects , it is sequence of objects that supports various operations "
              + "which can be pipelined to produce desired result");
          System.out.println("Short poc on retrieval of object using stream ");
          showStream(items);
          break;
        }
        case 2:
        {
          System.out.println("Java 8 Stream API added value to the java programming"
              + "It is now comparable to python programming because of free style coding "
              );
          System.out.println("In Java 7 and its below versions we have to write"
              + " multiple code statements to achive "
              + "desired result based on filtering, Java 8 made it very simpler by "
              + "introducing the operation "
              + "filter based on predicate pipelined "
              + "in the stream API");
          filterBasedOnpredicate(items);
          break;
        }
        case 3: 
        {
          System.out.println("Stream Manipulations");
          System.out.println("Java 8 Streams are designed in such a way "
              + "that most of the stream operations returns streams only."
              + "This help us creating chain of the stream operations. This is called as pipe-lining.");
          streamManipulate(items);
          break;
        }
        case 4:
        {
          System.out.println("Map is an intermediate operation used to manipulate elements of stream");
          System.out.println("map() takes a Stream and transform it to another Stream. "
              + "It applies a function on each element of Stream and store return value into new Stream. It does not flatten the stream. But flatMap() is the combination of a map"
              + " and a flat operation i.e, it applies a function to elements as well as flatten them.");
          streamMap(items);
          break;
        }
        case 5:
        {
          System.out.println("Java Stream API provides functional programming style to mannipulate"
              + "elements of collections ");
          System.out.println("Parallel stream is an greatest added advantage from java 8 ,"
              + "which uses advantage of multi-core architecture");
          System.out.println("Parallel stream partions the stream into multiple stream, "
              + "where each operations performed parallely");
          System.out.println("The stream implemetation by default is sequential in Java 8"
              + " because the parallel stream everytime is overhead to application");
          showParallelStream(items);
          break;
        }
      }
    }

  }

  private static void showParallelStream(List<Integer> items) {
    long t1,t2;
    t1=System.currentTimeMillis();
    items.stream().filter(predicate -> predicate.intValue() > 0).
    map(item -> sum(item)).collect(Collectors.toList());
    t2=System.currentTimeMillis();
    System.out.println("Time taken for sequential stream: "+(t2-t1) );
    
    /// Parallel Stream
    t1=System.currentTimeMillis();
    items.stream().parallel().filter(predicate -> predicate.intValue() > 0).
    map(item -> sum(item)).collect(Collectors.toList());
    t2=System.currentTimeMillis();
    System.out.println("Time taken for parallel stream: "+(t2-t1) );
    
  }
  
  private static int sum(int value) {
    return value+2;
  }

  private static void streamMap(List<Integer> items) {
   items.stream().sorted().map(item -> item.intValue()*2).forEach((item)->System.out.println(item));   
   String example[][] = {{"abc","cde"},{"fgh","ijk"}};
   Stream<String> flatStream = Stream.of(example)
       .flatMap(item -> Arrays.stream(item).map(i -> i.toUpperCase()));
   flatStream.forEach(System.out::println);
  }

  private static void streamManipulate(List<Integer> items) {
     items = items.stream().sorted().limit(3)
         .filter(n -> n.intValue() > 0).collect(Collectors.toList());
     System.out.println(items);
  }

  private static void filterBasedOnpredicate(List<Integer> items) {
    items = items.stream().filter(item -> item > 2).collect(Collectors.toList());
    System.out.println(items);
  }

  private static void showStream(List<Integer> items) {
   items.stream().forEach(item ->System.out.println(item));    
  }

}
