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
public boolean setAuthor(String newAuthor){
author = newAuthor;
return true;
}
public boolean setTitle(String newTitle){
title = newTitle;
return true;
}
public boolean setISBN(String newISBN){
isbn = newISBN;
return true;
}
public String getAuthor(){

return author;
}
public String getTitle(){
return title;
}
public String getISBN(){
return isbn;
}

public String toString(){
  return author + ", " + title + ", " + isbn;
}

public static void main(String[] args) {

}
}
