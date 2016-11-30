abstract class LibraryBook extends Book
implements Comparable<LibraryBook>{

private String callNumber;


  public LibraryBook(){
    super();
  }
  public LibraryBook(String newAuthor, String newTitle, String newISBN,
                     String newcallNumber){
    super.setAuthor(newAuthor);
    super.setTitle(newTitle);
    super.setISBN(newISBN);
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
  public static void main(String[] args) {

  }

}
