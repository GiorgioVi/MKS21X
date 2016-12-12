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

	if(zipcode.length() != 6){ throw new IllegalArgumentException();}
	try { Integer.parseInt(zipcode);
	      }catch (NumberFormatException e) {
		   throw new IllegalArgumentException();
	       }
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

public static String toZip(String code){
	if(code.length() != 32){throw new IllegalArgumentException();}
	if(code.charAt(0) != '|' || code.charAt(31) != '|'){
	    throw new IllegalArgumentException();}
	for (int i = 0 ; i < code.length() ; i ++) {
			 if (code.charAt(i) != ':' && code.charAt(i) != '|') {
				  throw new IllegalArgumentException();
						 }
					 }
			String zipcode = "";
   	  String codeV2 = code.substring(1,31);

	int groupings = 0;
	while(groupings < 6){
	    String group = codeV2.substring(groupings*5, groupings*5 + 5);
	    if(group.compareTo("||:::") == 0){
					zipcode += "0";
	    } else if(group.compareTo(":::||") == 0){
	        zipcode += "1";
	    } else if(group.compareTo("::|:|") == 0){
	        zipcode += "2";
	    } else if(group.compareTo("::||:") == 0){
	        zipcode += "3";
	    } else if(group.compareTo(":|::|") == 0){
	        zipcode += "4";
	    } else if(group.compareTo(":|:|:") == 0){
	        zipcode += "5";
	    } else if(group.compareTo(":||::") == 0){
	        zipcode += "6";
	    } else if(group.compareTo("|:::|") == 0){
	        zipcode += "7";
	    } else if(group.compareTo("|::|:") == 0){
	        zipcode += "8";
	    } else if(group.compareTo("|:|::") == 0){
	        zipcode += "9";
	    }
			groupings++;
}
if(checkSum(zipcode.substring(0,5)) != (Integer.parseInt(zipcode) % 10)){
	throw new IllegalArgumentException();
}
	return zipcode.substring(0,5);
}

public int compareTo(Barcode o){
return _zip.compareTo(o._zip);
}

public static void main(String[] args) {
	Barcode b = new Barcode("08451");
System.out.println(b); //084518 |||:::|::|::|::|:|:|::::|||::|:|
System.out.println(toZip("|||:::|::|::|::|:|:|::::|||::|:|")+checkSum("08451")+" "+toCode("08451"));//same as above
System.out.println(b.toString().compareTo("084518 |||:::|::|::|::|:|:|::::|||::|:|")); //0
System.out.println(toCode("08451").compareTo("|||:::|::|::|::|:|:|::::|||::|:|")); //0
System.out.println(b.compareTo(b)); //0
System.out.println((new Barcode("11426")).compareTo(new Barcode("11426"))); //0
System.out.println((new Barcode("99999")).compareTo(b)); //some positive, preferably 1
System.out.println((new Barcode("01111")).compareTo(b)); //some negative, preferably -1
System.out.println(b.compareTo(new Barcode("01111"))); //some negative, preferably 1
System.out.println(b.compareTo(new Barcode("99999"))); //some positive, preferably -1
int sum= 0;
try{
//length
System.out.println((new Barcode("123456")));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//length
System.out.println(toCode("123456"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//length
System.out.println((new Barcode("1234")));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//length
System.out.println(toCode("1234"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//type
System.out.println((new Barcode("12.45")));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//type
System.out.println(toCode("12.45"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//type
System.out.println((new Barcode("12a45")));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//type
System.out.println(toCode("12a45"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//type
System.out.println((new Barcode("12/45")));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//type
System.out.println(toCode("12/45"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//length
System.out.println(toZip("|||:::|:::|::|::|:|:|::::|||::|:|"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//length
System.out.println(toZip("|||:::|::|::|::||:|::::|||::|:|"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//nonbarcode char were used
System.out.println(toZip("|||:::|::|::|a:|:|:|::::|||::|:|"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//nonbarcode char were used
System.out.println(toZip("|||::::::|::||||:|:|:::::||::|:|"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//checkSum is wrong
System.out.println(toZip("|||:::|::|::|::|:|:|::::||||:::|"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//left or right is wrong
System.out.println(toZip(":||:::|::|::|::|:|:|::::||||:::|"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
try{
//left or right is wrong
System.out.println(toZip("|||:::|::|::|::|:|:|::::||||::::"));
}catch(Exception e){
sum+=1;
e.printStackTrace();
}
System.out.println("\nThere were 17 errors, if youre not interested in type, just look below to make \nsure there are 17 lol\n");
System.out.println("The number of errors caught were: "+ sum);
}

}
