package entidades;

public class Triangulo{
    private double catetoOposto;
    private double hipotenusa;
    private double catetoAdjacente;

    public Triangulo(){

    }

    public Triangulo(double catetoOposto, double hipotenusa, double catetoAdjacente) {
        this.catetoOposto = catetoOposto;
        this.hipotenusa = hipotenusa;
        this.catetoAdjacente = catetoAdjacente;
    }

    public double getCatetoOposto() {
        return catetoOposto;
    }

    public void setCatetoOposto(double catetoOposto) {
        this.catetoOposto = catetoOposto;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public double getCatetoAdjacente() {
        return catetoAdjacente;
    }

    public void setCatetoAdjacente(double catetoAdjacente) {
        this.catetoAdjacente = catetoAdjacente;
    }

    public double area() {
        return (getCatetoAdjacente() * getHipotenusa()) / 2;
    }

    public double perimetro() {
        return getHipotenusa() + getCatetoAdjacente() + getCatetoOposto();
    }


    public String tipoTriangulo(){
        if(getCatetoOposto() == getCatetoAdjacente() && getCatetoOposto() == getHipotenusa() && getCatetoAdjacente() == getHipotenusa()){
            return "Equilatero! ";
        } else if (getCatetoOposto() != getCatetoAdjacente() && getCatetoOposto() != getHipotenusa() && getCatetoAdjacente() != getHipotenusa()){
            return "Escaleno! ";
        }
        return "Isoceles! ";
    }
}
