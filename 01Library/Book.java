public class Book{
private String author;
private String title;
private String isbn;

public Book(){

};
public Book(String newAuthor, String newTitle, String newISBN){
  author = newAuthor;
  title = newTitle;
  isbn = newISBN;
}
private boolean SetAuthor(String newAuthor){
author = newAuthor;
return true;
}
private boolean SetTitle(String newTitle){
title = newTitle;
return true;
}
private boolean SetISBN(String newISBN){
isbn = newISBN;
return true;
}
private String getAuthor(){

return author;
}
private String getTitle(){
return title;
}
private String getISBN(){
return isbn;
}

public String toString(){
  return author + ", " + title + ", " + isbn;
}

public static void main(String[] args) {

}
}
