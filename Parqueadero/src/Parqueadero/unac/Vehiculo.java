package Parqueadero.unac;

public abstract class Vehiculo {

    private String placa;
    private Propietario propietario;
    private Tiposervicio tiposervicio;

    public Vehiculo(String placa, Propietario propietario, Tiposervicio tiposervicio) {
        this.placa = placa;
        this.propietario = propietario;
        this.tiposervicio = tiposervicio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Tiposervicio getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(Tiposervicio tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public abstract void Pedir();

}

