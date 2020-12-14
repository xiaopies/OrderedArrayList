import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  NoNullArrayList(){
    super();

  }

  NoNullArrayList(int index){
    super(index);
  }

  public void add(int index, T value){
    if (value== null){
      throw new IndexOutOfBoundsException(value + "is null");
    }
    else{
      super.add(index, value);
    }
  }
  public boolean add(T value){
    if (value==null){
      throw new IndexOutOfBoundsException(value + "is null");
    }
    else{
    return super.add(value);
  }
}

  public T set(int index, T value){
    if (value==null){
      throw new IndexOutOfBoundsException(value + "is null");
    }
    return super.set(index, value);
  }
}
