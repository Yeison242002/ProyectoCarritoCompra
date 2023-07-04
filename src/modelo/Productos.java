package modelo;

import java.util.ArrayList;
import java.util.List;

public class Productos {

    private String nombre;
    private String tipo;
    private String color;
    private double precio;
    private int idProducto;
    private String genero;

    public Productos(String nombre, String tipo, String color, double precio, int idProducto, String genero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
        this.idProducto = idProducto;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
     private List<ElementoCarrito> elementosCarrito;

    public Productos() {
        elementosCarrito = new ArrayList<>();
    }

    public List<ElementoCarrito> getElementosCarrito() {
        return elementosCarrito;
    }

    public void agregarAlCarrito(ElementoCarrito elemento) {
        elementosCarrito.add(elemento);
    }

    public static void main(String[] args) {
        List<Productos> productosList = new ArrayList<>();

        productosList.add(new Productos("Tommy Hilfiger", "Suéter", "Negro", 150.000, 1, "Hombre"));
        productosList.add(new Productos("Tommy Blower", "Suéter", "Azul Marino", 130.000, 2, "Hombre"));
        productosList.add(new Productos("Sumer Red", "Suéter", "Granate", 50.000, 3, "Hombre"));
        productosList.add(new Productos("Levi´s Housemarck", "Suéter", "Crema", 200.000, 4, "Hombre"));
        productosList.add(new Productos("Champion Girl", "Suéter", "Añil", 95.000, 5, "Mujer"));
        productosList.add(new Productos("Blower M", "Suéter", "Negro, Azul, Gris", 180.000, 6, "Mujer"));
        productosList.add(new Productos("Dam Glup", "Suéter", "Azul Marino", 200.000, 7, "Mujer"));

        productosList.add(new Productos("Wonder Clasicos", "Pantalón", "Gris", 200.000, 8, "Hombre"));
        productosList.add(new Productos("Bermuda Blower", "Pantalón", "Aciano oscuro", 170.000, 9, "Hombre"));
        productosList.add(new Productos("Mich Jean", "Pantalón", "Gris Azulado", 200.000, 10, "Hombre"));
        productosList.add(new Productos("Mich Jean Dama", "Pantalón", "Azul oscuro", 210.000, 11, "Mujer"));
        productosList.add(new Productos("Coul Holgado", "Pantalón", "Aciano", 170.000, 12, "Mujer"));
        productosList.add(new Productos("Jeans Sport", "Pantalón", "Azul Denim", 250.000, 13, "Mujer"));

        productosList.add(new Productos("Runner Prime", "Calzado", "Negro", 350.000, 14, "Hombre"));
        productosList.add(new Productos("Air Plus", "Calzado", "Blanco", 280.000, 15, "Hombre"));
        productosList.add(new Productos("Zapatos Casual", "Calzado", "Marrón", 200.000, 16, "Hombre"));
        productosList.add(new Productos("Zapatos Deportivos", "Calzado", "Negro", 250.000, 17, "Hombre"));
        productosList.add(new Productos("Zapatillas Deportivas", "Calzado", "Negro", 280.000, 18, "Mujer"));
        productosList.add(new Productos("Air Max", "Calzado", "Blanco", 320.000, 19, "Mujer"));
        productosList.add(new Productos("Zapatos Casuales", "Calzado", "Marrón", 200.000, 20, "Mujer"));

        productosList.add(new Productos("Vestido Elegante", "Vestido", "Negro", 500.000, 21, "Mujer"));
        productosList.add(new Productos("Vestido Casual", "Vestido", "Rojo", 400.000, 22, "Mujer"));
        productosList.add(new Productos("Vestido Estampado", "Vestido", "Azul", 450.000, 23, "Mujer"));
        productosList.add(new Productos("Vestido de Fiesta", "Vestido", "Dorado", 600.000, 24, "Mujer"));

        productosList.add(new Productos("Bolso de Mano", "Accesorio", "Negro", 150.000, 25, "Unisex"));
        productosList.add(new Productos("Cinturón de Cuero", "Accesorio", "Marrón", 120.000, 26, "Unisex"));
        productosList.add(new Productos("Gorra Deportiva", "Accesorio", "Rojo", 70.000, 27, "Unisex"));

        for (Productos producto : productosList) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Tipo: " + producto.getTipo());
            System.out.println("Color: " + producto.getColor());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("ID Producto: " + producto.getIdProducto());
            System.out.println("Género: " + producto.getGenero());
            System.out.println("----------------------");
        }
    }
}
