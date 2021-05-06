package com.example.syscomelapp.Cliente;

public class UsuarioCliente {

    private int id;
    private String nombre;
    private String apellido;
    private String correoelectronico;
    private String empresa;
    private String direccion;
    private String telefono;
    private String contrasena;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCorreoelectronico() { return correoelectronico; }

    public void setCorreoelectronico(String correoelectronico) { this.correoelectronico = correoelectronico; }

    public String getEmpresa() { return empresa; }

    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public String getDireccion() { return direccion; }

    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getContrasena() { return contrasena; }

    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
}
