import java.util.Iterator;
import java.util.NoSuchElementException;

public class superArrayIterator implements Iterator<String>{
private SuperArray workingArray;
private int element;

  public superArrayIterator(SuperArray data){
    workingArray = data;
    element = 0;
  }

  public boolean hasNext(){return element < workingArray.size();}

  public String next(){
      if (hasNext()){
        return workingArray.get(element++);
      }
      else{throw new NoSuchElementException(); }
  }
  public void remove(){ throw new UnsupportedOperationException();}


}
