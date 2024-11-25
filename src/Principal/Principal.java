package Principal;

import Modelos.DataCambio;
import Operaciones.ConsultaAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

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
                        DataCambio cambio = consulta.convertirModeda("COP", "USD", valor);

                        System.out.println("El valor de "
                                + valor +" ["
                                + cambio.base_code() +"] es igual a =>> "
                                + cambio.conversion_result()
                                +" ["+ cambio.target_code()+"]");

                        break;
                    case 2:
                        DataCambio cambio2 = consulta.convertirModeda("USD", "COP", valor);

                        System.out.println("El valor de "
                                + valor +" ["
                                + cambio2.base_code() +"] es igual a =>> "
                                + cambio2.conversion_result()
                                +" ["+ cambio2.target_code()+"]");
                        break;
                    case 3:
                        DataCambio cambio3 = consulta.convertirModeda("EUR", "USD", valor);

                        System.out.println("El valor de "
                                + valor +" ["
                                + cambio3.base_code() +"] es igual a =>> "
                                + cambio3.conversion_result()
                                +" ["+ cambio3.target_code()+"]");
                        break;
                    case 4:
                        DataCambio cambio4 = consulta.convertirModeda("USD", "EUR", valor);

                        System.out.println("El valor de "
                                + valor +" ["
                                + cambio4.base_code() +"] es igual a =>> "
                                + cambio4.conversion_result()
                                +" ["+ cambio4.target_code()+"]");
                        break;
                    case 5:
                        DataCambio cambio5 = consulta.convertirModeda("CAD", "COP", valor);

                        System.out.println("El valor de "
                                + valor +" ["
                                + cambio5.base_code() +"] es igual a =>> "
                                + cambio5.conversion_result()
                                +" ["+ cambio5.target_code()+"]");
                        break;
                    case 6:
                        DataCambio cambio6 = consulta.convertirModeda("COP", "ARS", valor);

                        System.out.println("El valor de "
                                + valor +" ["
                                + cambio6.base_code() +"] es igual a =>> "
                                + cambio6.conversion_result()
                                +" ["+ cambio6.target_code()+"]");
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
