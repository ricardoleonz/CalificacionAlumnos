package entidades.alumnos;

public class Alumnos {

    private double notaSeguimiento;
    private double notaParcial;
    private double notaExamenFinal;

    public void setNotaSeguimiento(double notaSeguimiento) {
        this.notaSeguimiento = notaSeguimiento;
    }

    public double getNotaSeguimiento() {
        return notaSeguimiento;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaExamenFinal(double notaExamenFinal) {
        this.notaExamenFinal = notaExamenFinal;
    }

    public double getNotaExamenFinal() {
        return notaExamenFinal;
    }


    public double calcularNotaFinal(){
        return ((this.getNotaSeguimiento()*0.4)+(this.getNotaParcial()*0.3)+(this.getNotaExamenFinal()*0.3));
    }
}
