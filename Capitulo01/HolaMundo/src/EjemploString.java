public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        //Compara referencia
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);
        //Compara por valor
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);
    }
}
