package entidades;

public enum Mensajes {
    MENSAJE_NOTA_SEGUIMIENTO("Ingrese la nota de seguimiento: "),

    MENSAJE_TITULO_SEGUIMIENTO("Nota de Seguimiento"),

    MENSAJE_NOTA_PARCIAL("Ingrese la nota del parcial: "),

    MENSAJES_TITULO_PARCIAL("Nota del parcial"),

    MENSAJE_NOTA_EXAMEN_FINAL("Ingrese la nota del examen final: "),

    MENSAJES_TITULO_EXAMEN("Nota del examen final"),

    MENSAJES_TITULO_RESULTADO("Resultado"),

    MENSAJE_CALIFICACION_4_5(" Excelente, tu rendimiento ha sido el mejor."),

    MENSAJE_CALIFICACION_3_39(" Tu rendimiento es aceptable, pero finalizaste bien."),

    MENSAJE_CALIFICACION_2_29(" Te sugerimos comprometerte más con tu estudio."),

    MENSAJE_CALIFICACION_1_19(" Malas noticias, no cumpliste con el mínimo para avanzar."),

    MENSAJE_CALIFICACION_0_09(" Nuevamente vuelve a iniciar tus estudios y dedícate."),

    MENSAJE_RESULTADO("Tu nota fue ");


    private String mensaje;

    Mensajes(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
