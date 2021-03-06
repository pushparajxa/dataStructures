package com.lang.streams;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsTest {
  public  void main1() {
    List<Integer> integers = new ArrayList<>();
    integers.add(23);
    integers.add(45);

    List<Integer> integers1 = new ArrayList<>();
    integers1.add(23);
    System.out.println("Before"+integers1);
    integers1.removeAll(integers);
    System.out.println("After"+integers1);

    Map<Long, java.lang.String> executionStatus  = new HashMap<>();
    executionStatus.put(1l,"ONE");
    executionStatus.put(2l,"TWO");
    executionStatus.put(3l,"THREE");

    StringBuilder collect =
        executionStatus
            .entrySet()
            .stream().parallel()
            .collect(
                () -> new StringBuilder(),
                (x, y) -> {
                  System.out.println("accumulator: x= "+x+", y= "+y.getKey()+"->"+y.getValue());
                  x.append(y.getKey().toString()).append("->").append(y.getValue()).append("\n");
                },
                (x, y) -> {
                  System.out.println("combiner: x= "+x+", y= "+y);
                  x.append(y);
                });

    System.out.println("\nSupplier result is ="+collect);
  }

  public static void main(String[] args) {
      List<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);
    integers.add(3);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Prefix ");
    System.out.println(integers.stream().map(x->x.toString()).collect(
            Collectors.joining(",",stringBuilder," suffix")));

  }

  public static final class FutureTest{

  }

}
