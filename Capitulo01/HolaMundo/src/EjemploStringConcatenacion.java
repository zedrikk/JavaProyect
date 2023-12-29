public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación JAVA";
        String profesor = "Andres Guzman";
        
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);
        
        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroB + numeroA);
        System.out.println(detalle + (numeroB + numeroA));

        System.out.println(numeroB + numeroA + detalle);

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
