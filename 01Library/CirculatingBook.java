public class CirculatingBook extends LibraryBook{

private String currentHolder;
private String dueDate;


public CirculatingBook(String newAuthor, String newTitle, String newISBN,
                   String newcallNumber){
super(newAuthor, newTitle, newISBN, newcallNumber);
}


public boolean setAuthor(String newAuthor){
super.setAuthor(newAuthor);
return true;
}
public boolean setTitle(String newTitle){
super.setTitle(newTitle);
return true;
}
public boolean setISBN(String newISBN){
super.setISBN(newISBN);
return true;
}
public boolean setcallNumber(String newCall){
super.setcallNumber(newCall);
return true;
}
public String getAuthor(){
return super.getAuthor();
}
public String getTitle(){
return super.getTitle();
}
public String getISBN(){
return super.getISBN();
}
public String getcallNumber(){
return super.getcallNumber();
}

public void checkout(String patron, String dueDatex){
  currentHolder = patron;
  dueDate = dueDatex;
}
public void returned(){
  currentHolder = null;
  dueDate = null;
}
public String circulationStaus(){
  if(currentHolder == null){
    return getTitle() + " is available on shelves";
  }
  else{
    return currentHolder + ", " + dueDate;
  }
}
public String toString(){
  if (currentHolder == null){
    return super.toString();
  }
  else{
    return super.toString() + ", " + circulationStaus();
  }
}
}
