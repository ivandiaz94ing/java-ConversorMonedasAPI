package Principal;

import Modelos.DataCambio;
import Operaciones.ConsultaAPI;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();

        int opcion;
        double valor;

        System.out.println("********** Conversor de moneda en linea **********");
        do {


            System.out.println("""
                    1) Peso Colombiano =>> Dolar
                    2) Dolar =>> Peso Colombiano
                    3) Euro =>> Dolar
                    4) Dolar =>> Euro
                    5) Dolar Canadiense =>> Peso Colombiano
                    6) Peso Colombiano =>> Peso Argentino
                    7) Salir
                    """);
            System.out.println("**********************************************");
            System.out.print("Elegir una taza de cambio: ");



            try {
                opcion = input.nextInt();
                if (opcion < 7) {
                    System.out.print("Ingresar el valor a convertir: ");
                    valor = input.nextDouble();
                } else {
                    valor = 0;
                }

                switch (opcion) {
                    case 1:
                        consulta.convertirModeda("COP", "USD", valor);
                        break;
                    case 2:
                        System.out.println("Opcion =>> " + opcion);
                        break;
                    case 3:
                        System.out.println("Opcion =>> " + opcion);
                        break;
                    case 4:
                        System.out.println("Opcion =>> " + opcion);
                        break;
                    case 5:
                        System.out.println("Opcion =>> " + opcion);
                        break;
                    case 6:
                        System.out.println("Opcion =>> " + opcion);
                        break;
                    case 7:
                        System.out.println("Finalizando el programa");

                        break;
                    default:
                        System.out.println("Opción Invalida");
                        break;
                }

            } catch (Exception e) {
                System.out.println("No Insertaste un valor correcto");
                opcion=8;
                input.next();


            }

            System.out.println("**********************************************");
            System.out.println();
        } while (opcion != 7);
    }
}
