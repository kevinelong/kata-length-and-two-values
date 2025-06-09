/*
5, true, false     -->  [true, false, true, false, true]
10, "blue", "red"  -->  ["blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"]
0, "one", "two"    -->  []
 */
package org.example;
import java.util.stream.IntStream;
public class Main {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] values = {firstValue,secondValue};
        return IntStream.range(0, n).mapToObj(i -> values[i%2]).toArray(String[]::new);
    }
    public static void main(String[] args) {
        System.out.println(String.join(", ",alternate(10, "blue", "red")));
    }
}
/*
import java.util.ArrayList;
public class Kata {
  public static String[] alternate(int n, String firstValue, String secondValue) {
    ArrayList<String> list = new ArrayList<String>();
    int which = 0;
    for(int i=0;i<n;i++){
      if(which==0){
        list.add(firstValue);
        which=1;
      }  else{
        list.add(secondValue);
        which=0;
      }
    }
    return list.toArray(new String[0]);
  }
}
 */