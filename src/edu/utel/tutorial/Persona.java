package edu.utel.tutorial;

public record Persona(String nombre, String apellidos) {
    @Override
    public String toString() {
        return """
                Persona {
                    nombre='%s',
                    apellidos='%s'
                }
                """.formatted(nombre, apellidos);
    }
}
