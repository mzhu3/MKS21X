public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;
    public static String[] conversions;
    private String Barcode;


    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	try{
	    int as = Integer.parseInt(zip);}
	catch(NumberFormatException b){
	    System.out.println("String of INTEGER zips");
	}
	if(zip.length() != 5 ){
	    System.out.println( "5 integer zip only");
	    // throw new IllegalArgumentException();
	}
	else{
	    try{
	    _zip = zip;
	    _checkDigit = checkSum();
	    conversions =new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
	    Barcode = Convert(_zip);
	    }
	    catch(NumberFormatException e){
		System.out.println("Only Integers");
	    }
	}
    
   
	//	catch(NullPointerException e){
	//   System.out.println("Fix your zip number please");
    }



	



// postcondition: Creates a copy of a bar code.
public BarCode(BarCode x){
    conversions =new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
    _zip = ConvertToZip(x.Barcode);
    _checkDigit = checkSum();
    Barcode = Convert(_zip);
	

}


//post: computes and returns the check sum for _zip
private int checkSum(){
	
    int sum = 0;
    for(int i = 0 ; i < _zip.length() - 1; i++){
	sum += Integer.parseInt(_zip.substring(i, i + 1));
    }
    sum += Integer.parseInt(_zip.substring(_zip.length()-1));
    return sum%10;
}
public String Convert(String zips){
    String ans="|" ;
    for (int i = 0; i < zips.length() - 1; i ++){
	ans += conversions[Integer.parseInt(zips.substring(i, i + 1))];
    }
    ans += conversions[Integer.parseInt(zips.substring(zips.length()-1))];
    ans += "|";
    return ans;
	
	    
}
public String ConvertToZip(String Barcodes){
    String ans = Barcodes.substring(1,Barcodes.length()-1);
    String zipper = "";
    for(int i = 0; i < ans.length() - 6; i++){
	for(int j = 0; j < conversions.length; j++){
	    if(ans.substring(i,i + 6).equals(conversions[j])){
		zipper+=j;
	    }
	}
    }
    return zipper;
}

				       


//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|" 
public String toString(){
    return _zip + _checkDigit +" " + Convert(_zip);
}


public boolean equals(Object other){

    return this == other ||
	( other instanceof BarCode) &&this. _zip.equals(((BarCode)other)._zip);
}
// postcondition: false if the object is not a BarCode, 
// false if it is a non-matching barcode
// true when they match.


public int compareTo(Object other){
    if( toString(). equals((((BarCode)other).toString()))){
	return 0;
    }
    else{
	return -1;
    }
}
// postcondition: compares the zip + checkdigit
public static void main(String[] args){
    //BarCode b1 = new BarCode("asdasd");
    BarCode b2 = new BarCode("12315");
    System.out.println(b2);
    // System.out.println(b2.toString());
    //System.out.println(b1._checkDigit);
    //System.out.println(b1.compareTo(b2));
}

}
