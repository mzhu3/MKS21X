public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;
    public static String[] conversions;

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	_zip = zip;
	_checkDigit = checkSum();
	conversions =new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){}


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	
	int sum = 0;
	for(int i = 0 ; i < _zip.length() - 1; i++){
	    sum += Integer.parseInt(_zip.substring(i, i + 1));
	}
	sum += Integer.parseInt(_zip.substring(_zip.length()-1));
	return sum%10;
    }
    public String Convert(){
	String ans="|" ;
	for (int i = 0; i < _zip.length() - 1; i ++){
	    ans += conversions[Integer.parseInt(_zip.substring(i, i + 1))];
	}
	ans += conversions[Integer.parseInt(_zip.substring(_zip.length()-1))];
	ans += "|";
	return ans;
	
	    
    }
    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|" 
    public String toString(){
	return _zip + _checkDigit +" " + Convert();
    }


    public boolean equals(Object other){

	return this == other ||
	    ( other instanceof BarCode) &&this. _zip.equals(((BarCode)other)._zip);
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Object other){
	return 1;
    }
    // postcondition: compares the zip + checkdigit
    public static void main(String[] args){
	BarCode b1 = new BarCode("12345");
	System.out.println(b1.toString());
	//System.out.println(b1._checkDigit);
    }

}
