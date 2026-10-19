public class Tarea {

    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion(){

        System.out.println("Tarea:" + titulo);
        System.out.println("Responsable:" + responsable);
        System.out.println("Horas estimadas:" + horasEstimadas);
        System.out.println("Realizado:" + completada);

    }

    public void completada (){
        completada = true;
        System.out.println("Tarea: " + titulo);
    }

    void mostrarResponsable (){
        System.out.println("El responsable es: " + titulo + " " + responsable);
    }

    void mostrarEstado(){
        System.out.println("El estado de:  " + titulo + " " + completada);
    }
}
