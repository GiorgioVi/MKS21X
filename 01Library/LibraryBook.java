abstract class LibraryBook extends Book
implements Comparable<LibraryBook>{

private String callNumber;


  public LibraryBook(String newAuthor, String newTitle, String newISBN,
                     String newcallNumber){
  super(newAuthor, newTitle, newISBN);
    callNumber = newcallNumber;
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
  callNumber = newCall;
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
  return callNumber;
  }

  abstract void checkout(String patron, String due);
  abstract void returned();
  abstract String circulationStaus();

  public int compareTo(LibraryBook o){
    if(getcallNumber().equals(o.getcallNumber())){
      return 0;
    }
    else if ((getcallNumber().compareTo(o.getcallNumber()) < 0)) {
      return -1;
    }
    else{ return 1;}
  }
  public String toString(){
    return super.toString() + ", " + callNumber;
  }
  public static void main(String[] args) {

  }

}
