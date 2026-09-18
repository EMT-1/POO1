package Examen_1;

import java.util.Scanner;

public class p080_SimuladorFinanciero {

    // ============================================================
    // 1) CÁLCULO DE AHORRO CON APORTACIONES PERIÓDICAS
    // ============================================================
    /**
     * Calcula el monto total de ahorro acumulado tras un número determinado
     * de períodos, dado un depósito inicial, una aportación periódica y una
     * tasa de interés mensual, acumulando el interés mes a mes.
     *
     * @param montoInicial        Cantidad de dinero con la que se inicia el ahorro (>= 0).
     * @param aportacionPeriodica Cantidad que se añade en cada período (>= 0).
     * @param tasaInteresMensual  Tasa mensual en decimal (ej. 0.01 = 1%). Debe ser >= 0.
     * @param numeroPeriodos      Número de períodos/meses a ahorrar (> 0).
     * @return Monto total ahorrado al finalizar los períodos indicados.
     * @throws IllegalArgumentException si algún parámetro es inválido.
     */
    public static double calcularAhorro(double montoInicial,
                                        double aportacionPeriodica,
                                        double tasaInteresMensual,
                                        int numeroPeriodos) {

        if (montoInicial < 0) {
            throw new IllegalArgumentException("El monto inicial no puede ser negativo.");
        }
        if (aportacionPeriodica < 0) {
            throw new IllegalArgumentException("La aportación periódica no puede ser negativa.");
        }
        if (tasaInteresMensual < 0) {
            throw new IllegalArgumentException("La tasa de interés no puede ser negativa.");
        }
        if (numeroPeriodos <= 0) {
            throw new IllegalArgumentException("El número de períodos debe ser mayor que cero.");
        }

        double saldo = montoInicial;
        for (int mes = 1; mes <= numeroPeriodos; mes++) {
            // Interés sobre el saldo actual + aportación del mes (al final del mes)
            saldo = saldo * (1 + tasaInteresMensual) + aportacionPeriodica;
        }
        return saldo;
    }

    // ============================================================
    // 2) INTERÉS COMPUESTO
    // ============================================================
    /**
     * Calcula el monto final aplicando interés compuesto: M = C * (1 + i)^n
     *
     * @param capitalInicial Capital inicial (> 0).
     * @param tasaInteres    Tasa por período en decimal (ej. 0.05 = 5%). Debe ser > 0.
     * @param numeroPeriodos Número de períodos (> 0).
     * @return Monto final tras aplicar interés compuesto.
     * @throws IllegalArgumentException si algún parámetro no es positivo.
     */
    public static double calcularInteresCompuesto(double capitalInicial,
                                                  double tasaInteres,
                                                  int numeroPeriodos) {

        if (capitalInicial <= 0) {
            throw new IllegalArgumentException("El capital inicial debe ser mayor que cero.");
        }
        if (tasaInteres <= 0) {
            throw new IllegalArgumentException("La tasa de interés debe ser mayor que cero.");
        }
        if (numeroPeriodos <= 0) {
            throw new IllegalArgumentException("El número de períodos debe ser mayor que cero.");
        }

        return capitalInicial * Math.pow(1 + tasaInteres, numeroPeriodos);
    }

    // ============================================================
    // 3) PERFIL FINANCIERO
    // ============================================================
    /**
     * Determina el perfil financiero según edad y monto de inversión:
     *   - Edad < 30 y monto > 10,000  -> "Agresivo"
     *   - Edad > 50                   -> "Conservador"
     *   - Resto                       -> "Moderado"
     *
     * @param edad  Edad del usuario (> 0).
     * @param monto Monto de inversión disponible (>= 0).
     * @return Perfil financiero ("Agresivo", "Conservador" o "Moderado").
     * @throws IllegalArgumentException si la edad no es positiva o el monto es negativo.
     */
    public static String obtenerPerfil(int edad, double monto) {

        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor que cero.");
        }
        if (monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo.");
        }

        if (edad < 30 && monto > 10_000) {
            return "Agresivo";
        } else if (edad > 50) {
            return "Conservador";
        } else {
            return "Moderado";
        }
    }

    // ============================================================
    // 4) MAIN CON MENÚ INTERACTIVO
    // ============================================================
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== SIMULADOR FINANCIERO =====");
            System.out.println("1. Calcular ahorro con aportaciones periódicas");
            System.out.println("2. Calcular interés compuesto");
            System.out.println("3. Obtener perfil financiero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            // Validación: asegura que el usuario ingrese un entero
            while (!scanner.hasNextInt()) {
                System.out.print("Opción inválida. Ingresa un número del 1 al 4: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpieza del buffer tras leer el entero

            try {
                switch (opcion) {
                    case 1: {
                        System.out.println("\n--- Cálculo de Ahorro ---");
                        double montoInicial = leerDoubleNoNegativo(scanner, "Monto inicial: ");
                        double aportacion  = leerDoubleNoNegativo(scanner, "Aportación mensual: ");
                        double tasa        = leerTasaComoPorcentaje(scanner,
                                "Tasa de interés mensual (en %, ej. 1 = 1%): ");
                        int periodos       = leerEnteroPositivo(scanner, "Número de meses: ");

                        double resultado = calcularAhorro(montoInicial, aportacion, tasa, periodos);
                        System.out.printf("Ahorro total tras %d meses: $%,.2f%n", periodos, resultado);
                        break;
                    }
                    case 2: {
                        System.out.println("\n--- Interés Compuesto ---");
                        double capital = leerDoublePositivo(scanner, "Capital inicial: ");
                        double tasa    = leerTasaComoPorcentaje(scanner,
                                "Tasa de interés por período (en %, ej. 5 = 5%): ");
                        int periodos   = leerEnteroPositivo(scanner, "Número de períodos: ");

                        double resultado = calcularInteresCompuesto(capital, tasa, periodos);
                        System.out.printf("Monto final: $%,.2f%n", resultado);
                        break;
                    }
                    case 3: {
                        System.out.println("\n--- Perfil Financiero ---");
                        int edad     = leerEnteroPositivo(scanner, "Edad: ");
                        double monto = leerDoubleNoNegativo(scanner, "Monto de inversión disponible: ");

                        String perfil = obtenerPerfil(edad, monto);
                        System.out.println("Perfil financiero: " + perfil);
                        break;
                    }
                    case 4:
                        System.out.println("\nGracias por usar el Simulador Financiero. ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("\nOpción no válida. Intenta de nuevo.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 4);

        scanner.close();
    }

    // ============================================================
    // HELPERS DE LECTURA Y VALIDACIÓN
    // ============================================================

    /**
     * Lee un double >= 0 por consola.
     */
    private static double leerDoubleNoNegativo(Scanner scanner, String mensaje) {
        double valor = leerDouble(scanner, mensaje);
        while (valor < 0) {
            System.out.println("El valor no puede ser negativo.");
            valor = leerDouble(scanner, mensaje);
        }
        return valor;
    }

    /**
     * Lee un double > 0 por consola.
     */
    private static double leerDoublePositivo(Scanner scanner, String mensaje) {
        double valor = leerDouble(scanner, mensaje);
        while (valor <= 0) {
            System.out.println("El valor debe ser mayor que cero.");
            valor = leerDouble(scanner, mensaje);
        }
        return valor;
    }

    /**
     * Lee un double válido (cualquier valor real) por consola.
     */
    private static double leerDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. " + mensaje);
            scanner.next();
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); // limpieza del buffer
        return valor;
    }

    /**
     * Lee un entero > 0 por consola.
     */
    private static int leerEnteroPositivo(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. " + mensaje);
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // limpieza del buffer

        while (valor <= 0) {
            System.out.print("Debe ser mayor que cero. " + mensaje);
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. " + mensaje);
                scanner.next();
            }
            valor = scanner.nextInt();
            scanner.nextLine();
        }
        return valor;
    }

    /**
     * Lee una tasa escrita por el usuario en porcentaje (ej. 5 para 5%)
     * y la convierte a decimal (0.05) antes de devolverla.
     * Valida que la tasa no sea negativa.
     */
    private static double leerTasaComoPorcentaje(Scanner scanner, String mensaje) {
        double porcentaje = leerDouble(scanner, mensaje);
        while (porcentaje < 0) {
            System.out.println("La tasa no puede ser negativa.");
            porcentaje = leerDouble(scanner, mensaje);
        }
        return porcentaje / 100.0;
    }
}