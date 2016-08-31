//Martin Chibwe
/* int myVar = 5;
 * double doubleValue = 156.5d;
 *
 *Primitive numeric variables default to 0 
 * 
 * */


import java.math.BigDecimal;
public class primitiveVariables{

    
    public static void main(String[] args){

        byte b = 127;

        short sh = 1;
        int i = 1;
        float f = 1f;
        double d = 1d; 
        if(b < Byte.MAX_VALUE){
                b++;
        }



        System.out.println("Byte:  " + b);
 
        double value = .012;
        double pSum = value + value + value;
        System.out.println("Sum of primitives: " + pSum);
        
        //To Fix This 
        String strValue = Double.toString(value);
        System.out.println("strValue :" + strValue);

        //To Fix This
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of BigDecimals: " + bSum.toString());


        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd value is " + intValue2);


        //could lose data when converting watch out
        //
        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is " + byteValue);
    }



}
