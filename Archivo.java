public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double dato = 0;
    double dato2 = 0;
    String operacion = "";
    System.out.println("Hola");
    System.out.println("Calculadora basica");
System.out.println("Ingresa el primer numero");
    dato = sc.nextDouble();
    System.out.println("Ingresa la operacion que deseas realizar (+, -, *, /)");
    operacion = sc.next();
    System.out.println("Ingresa el segundo numero");
    dato2 = sc.nextDouble();
    double resultado = 0;
    switch (operacion) {
        case "+":
            resultado = dato + dato2;
            break;
        case "-":
            resultado = dato - dato2;
            break;
        case "*":
            resultado = dato * dato2;
            break;
        case "/":
            if (dato2 != 0) {
                resultado = dato / dato2;
            } else {
                System.out.println("Error: Division por cero");
                return;
            }
            break;
        default:
            System.out.println("Operacion no valida");
            return;
    }
    System.out.println("El resultado es: " + resultado);
}