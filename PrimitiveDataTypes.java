// Primitive data types: byte, short, int, long, float, double, char, boolean

class PrimitiveDataTypes{
    public static void main(String args[]){

        //Whole numbers
        System.out.println("\n********** Byte, Short, Int, Long : Min Values **********");
        byte    bMin  = Byte.MIN_VALUE;
        short   sMin  = Short.MIN_VALUE;
        int     iMin  = Integer.MIN_VALUE;
        long    lMin  = Long.MIN_VALUE;
        
        System.out.println(bMin);
        System.out.println(sMin);
        System.out.println(iMin);
        System.out.println(lMin);

        System.out.println("\n********** Byte, Short, Int, Long : Max Values **********");
        byte    bMax  = Byte.MAX_VALUE;
        short   sMax  = Short.MAX_VALUE;
        int     iMax  = Integer.MAX_VALUE;
        long    lMax  = Long.MAX_VALUE;

        System.out.println(bMax);
        System.out.println(sMax);
        System.out.println(iMax);
        System.out.println(lMax);

        System.out.println("\n********** Byte, Short, Int, Long : Examples **********");
        byte    bValue = 100;
        short   sValue = 1000;
        int     iValue = 1000000000;
        long    lValue = 100000000000L; // add either l or L

        System.out.println(bValue);
        System.out.println(sValue);
        System.out.println(iValue);
        System.out.println(lValue);

        //Decimal number 
        System.out.println("\n********** Float, Double : Min Values **********");
        float   fMin = Float.MIN_VALUE;
        double  dMin = Double.MIN_VALUE;

        System.out.println(fMin);
        System.out.println(dMin);

        System.out.println("\n********** Float, Double : Max Values **********");
        float   fMax = Float.MAX_VALUE;
        double  dMax = Double.MAX_VALUE;

        System.out.println(fMax);
        System.out.println(dMax);

        System.out.println("\n********** Float, Double : Examples **********");
        float   fValue = 1.333333333333f; // add either f or F || 7 decimal digits of precision || 4 bytes
        double  dValue = 1.333333333333;  // optional add either d or D || 15 decimal digits of precision || 8 bytes

        System.out.println(fValue);
        System.out.println(dValue);

        //Single Character
        System.out.println("\n********** Char : Examples **********");
        char c = 'A';
        System.out.println(c);

        //Boolean Values
        System.out.println("\n********** Boolean : Examples **********");
        boolean b = true;
        System.out.println(b);

    }
}