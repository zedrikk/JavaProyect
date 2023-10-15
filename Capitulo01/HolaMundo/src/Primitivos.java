public class Primitivos {
    public static void main(String[] args) {
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo byte corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo byte corresponde en bits a " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);

        int numeroInt =  2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo byte corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo byte corresponde en bits a " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        long numeroLong =  21474836555L;
        System.out.println("numeroInt = " + numeroLong);
        System.out.println("Tipo byte corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo byte corresponde en bits a " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);

        var numeroVar = 2147483648L;
        
        //Primitivos Float
        
        float realFloat = 0.00000000015f;//1.5e4f;//2.12e3f; //2120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bits a = " + Float.SIZE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bits a = " + Double.SIZE);
        System.out.println("Máximo valor para float = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        
    }
}
