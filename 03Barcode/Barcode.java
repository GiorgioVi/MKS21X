import java.util.*;

public class Barcode implements Comparable<Barcode>{

//instance variables
private String _zip;
private int _checkDigit;

//constructorsss

public Barcode(String zip){

	if(zip.length() != 5){ throw new RuntimeException();}
	_zip = zip;
}
public Barcode clone(){
}



public int compareTo(Barcode other){

}

private int CheckSum(){ 

}

}
