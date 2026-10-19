void main() {
    Tarea t1 = new Tarea();
    Tarea t2 = new Tarea();
    Tarea t3 = new Tarea();

    t1.titulo = "Ordenar horario";
    t1.responsable = "Maria Lopez";
    t1.horasEstimadas = 3;
    t1.completada = false;

    t2.titulo = "Crear informe";
    t2.responsable = "Angelina Menedez";
    t2.horasEstimadas = 7;
    t2.completada = false;

    t3.titulo = "Analizar datos";
    t3.responsable = "Gabriel Rivera";
    t3.horasEstimadas = 2;
    t3.completada = false;

    System.out.println("--TAREA 1--");
    t1.mostrarInformacion();
    System.out.println("--TAREA 2--");
    t2.mostrarInformacion();
    System.out.println("--TAREA 3--");
    t3.mostrarInformacion();

    System.out.println("--Tareas completas--");
    t1.completada();

    System.out.println("---Estado---");
    t1.mostrarEstado();
    t2.mostrarEstado();
    t3.mostrarEstado();



}