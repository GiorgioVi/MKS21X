import java.util.*;
import java.lang.Integer;

public class Barcode implements Comparable<Barcode>{

//instance variables
private String _zip;

//constructorsss

public Barcode(String zip){

if(zip.length() != 5){ throw new IllegalArgumentException();}
try { Integer.parseInt(zip);
      }catch (NumberFormatException e) {
	   throw new IllegalArgumentException();
       }
_zip = zip;
}

private static int checkSum(String zip){
	int result = 0;
	int counter = 0;
	while(counter < zip.length()){
		result += zip.charAt(counter);
		counter += 1;
	}
	return result % 10;
}
public String toString(){
return "the zip:" + _zip + checkSum(_zip) +"\nBarcode:"
+ toCode(_zip);
}




public static String toCode(String zip){
	String zipcode = zip + checkSum(zip);
	int counter = 0;
	String bar = "|";
	while(counter < zipcode.length()){
		switch(zipcode.charAt(counter)){
			case '1':bar += ":::||";
			break;
      case '2':bar += "::|:|";
			break;
      case '3':bar += "::||:";
			break;
      case '4':bar += ":|::|";
			break;
      case '5':bar += ":|:|:";
			break;
      case '6':bar += ":||::";
			break;
      case '7':bar += "|:::|";
			break;
      case '8':bar += "|::|:";
			break;
      case '9':bar += "|:|::";
			break;
      case '0':bar += "||:::";
			break;
		}
	counter += 1;
	}
return bar + "|";
}

public static String toZip(String zip){
return "bb";
}

public int compareTo(Barcode o){
return _zip.compareTo(o._zip);
}
public static void main(String[] args) {
	Barcode pizza = new Barcode("08451");
	Barcode crust = new Barcode("00000");
	System.out.println(pizza.checkSum("08451"));
	System.out.println(pizza.toString());
	System.out.println(crust.compareTo(pizza));
	System.out.println(pizza.toCode("08451"));
}
}
