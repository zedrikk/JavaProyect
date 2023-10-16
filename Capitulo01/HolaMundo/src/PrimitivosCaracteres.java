public class PrimitivosCaracteres {
    public static void main(String[] args){
        char caracter = '\u0040';
        char decimal = 64;
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte ="+ System.getProperty("line.separator") + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("char valor minimo = " + Character.MIN_VALUE);
        System.out.println("char valor maximo = " + Character.MAX_VALUE);
    }
}
