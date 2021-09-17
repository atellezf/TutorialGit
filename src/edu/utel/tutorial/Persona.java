package edu.utel.tutorial;

public record Persona(String nombre, String apellidos) {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
