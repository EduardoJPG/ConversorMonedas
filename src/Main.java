import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int option = 0;
        while (option != 8){
            System.out.println("***************Bienvenido***************");
            System.out.println("""
                    *Ingresa la conversion que deseas realizar:
                    1-> Dolar a peso Argentino
                    2-> peso Argentino a Dolar
                    3-> Dolar a real brasilero
                    4-> real brasilero a Dolar 
                    5-> Dolar a peso colombiano
                    6-> peso colombiano a Dolar 
                    7-> otra moneda
                    8-> Salir ----> """);
            option = lectura.nextInt();
            lectura.nextLine();

            switch (option){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo ------>");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
    }
}