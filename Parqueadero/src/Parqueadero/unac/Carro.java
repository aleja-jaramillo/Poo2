package Parqueadero.unac;
import java.util.Scanner;

public class Carro extends Vehiculo {

    private float tarifa;

    public Carro(String placa, Propietario propietario, Tiposervicio tiposervicio, float tarifa) {
        super(placa, propietario, tiposervicio);
        this.tarifa = tarifa;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    @Override

    public void Pedir(){
        System.out.println("¿Paga usted mensualidad?");
        System.out.println("1. Si");
        System.out.println("2. No");

        Scanner Sc = new Scanner(System.in);
        int opc = Sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Puede salir");
                break;
            case 2:
                System.out.println("¿Cuantas horas ha utilizado el parqueadero?");
                int num = Sc.nextInt();
                System.out.println("");
                if (num > 6) {
                    this.tarifa = num * 3500 + ((num * 3500) * 0.5f);
                } else {
                    this.tarifa = num * 3500;

                }System.out.println("El vehiculo con placas: " + getPlaca() + " estubo: " + num + " Horas en el parqueadero, "
                    + "Su Total es de: " + getTarifa() + " Pesos");
                break;
            default:
                System.out.println("Opción Incorrecta");
                break;
        }

    }
}
