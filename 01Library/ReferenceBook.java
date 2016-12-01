public class ReferenceBook extends LibraryBook{

private String collection;


  public ReferenceBook(String newAut, String newTit,
   String newISBN, String callNumer0, String newcollection){
     super(newAut, newTit, newISBN, callNumer0);
     collection = newcollection;

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
  public boolean setCollection(String newcollect){
  collection = newcollect;
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
  public String getCollection(){
  return collection;
  }


  public void checkout(String patron, String duedate){
     System.out.println(patron + " cannot check out a ReferenceBook");

  }
  public void returned(){
    System.out.println("reference book could not have been checked out -- return impossible");
  }
  public String circulationStaus(){
    return "non-circulating reference book";

  }
  public String toString(){
    return super.toString() + ", " + getCollection();

  }


}
