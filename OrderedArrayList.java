import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int index){
    super(index);
  }
  private int happy(T value){
    if (value==null){
      return 0;
    }
    for ( int i = 0; i<super.size(); i++){
      if (value.compareTo(super.get(i))<=0){
        return i;
      }
    }
    if (super.size()==0){
      return 0;
    }
    if (value.compareTo(super.get(super.size()-1))>=0){
      return super.size();
    }
    return 0;
  }
  public boolean add(T value){
    super.add(happy(value), value);
    return true;
  }
  public void add(int index, T value){
    super.add(happy(value), value);
  }
  public T set(int index, T value){
    T previous = super.get(index);
    if (value!= null){
      super.remove(index);
    }
    super.add(happy(value), value);
    return previous;
  }

}
