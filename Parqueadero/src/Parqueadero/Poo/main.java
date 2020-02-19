package Parqueadero.Poo;
import Parqueadero.unac.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main (String []args) {

        Scanner Sc = new Scanner(System.in);

        Propietario p1 = new Propietario("Alejandra Jaramillo");
        Propietario p2 = new Propietario("Javier Landazabal");
        Propietario p3 = new Propietario("Jhon Camargo");

        Tiposervicio t1 = new Tiposervicio("Publico");
        Tiposervicio t2 = new Tiposervicio("Privado");

        Vehiculo v1 = new Carro("MBD23E",p1,t1,3500.f);
        Vehiculo v2 = new Moto("THP54A", p2,t2,1000.f);
        Vehiculo v3 = new Bus("HJG78D",p3,t1,8000.f);

        List<Vehiculo>Vehiculos = new ArrayList<>();
        Vehiculos.add(v1);
        Vehiculos.add(v2);
        Vehiculos.add(v3);

        HashMap<String, Vehiculo>vehiculos = new HashMap<>();

        for(Vehiculo vehiculoActual: Vehiculos){

            vehiculos.put(vehiculoActual.getPlaca(), vehiculoActual);
        }
        System.out.println("Ingrese la placa del vehiculo");

        String placa = Sc.nextLine();

        System.out.println("Ingrese el tipo de vehiculo que tiene");
        System.out.println("");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Bus");

        int opc = Sc.nextInt();

        Vehiculo datos = vehiculos.get(placa);

        switch (opc){
            case 1:
                String C = "Carro";
                System.out.println("El propietario es: " + datos.getPropietario().getName() + " - El tipo de servicio es: "
                + datos.getTiposervicio().getTipo() + " - El tipo de vehiculo es: " + C);

                System.out.println("");
                v1.Pedir();

                break;

            case 2:
                String M = "moto";
                System.out.println("El propietario es: " + datos.getPropietario().getName() + " - El tipo de servicio es: "
                        + datos.getTiposervicio().getTipo() + " - El tipo de vehiculo es: " + M);

                System.out.println("");
                v2.Pedir();

                break;

            case 3:
                String B = "Bus";
                System.out.println("El propietario es: " + datos.getPropietario().getName() + " - El tipo de servicio es: "
                        + datos.getTiposervicio().getTipo() + " - TEl tipo de vehiculo es: " + B);

                System.out.println("");
                v3.Pedir();

                break;

            default:
                System.out.println("Opción incorrecta");
                break;


        }

        }
        }






