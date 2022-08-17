import java.util.*;
class Main {
  public static void main(String[] args) {
    LinkedList<Integer> first = new LinkedList<>();
    first.add(1);
    first.add(2);
    first.add(4);
    LinkedList<Integer> second = new LinkedList<>();
    second.add(1);
    second.add(3);
    second.add(4);
    LinkedList<Integer> merge = mergeTwoLists(first,second);
    for(int i = 0; i < merge.size(); i++){
      System.out.print(merge.get(i) + " ");
    }
  }
  public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> first, LinkedList<Integer> second) {
    int index = 0;
    for(int i = 0; i < second.size(); i++){
      while(index < first.size() && first.get(index) <= second.get(i)){
        index++;
      }
      first.add(index, second.get(i));
    }
    return first;
  }
}