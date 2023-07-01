
package modelo;

public class Productos {
    
    public static class Sueteres extends Productos {
        public Sueteres(String tipo, String color, double precio, int idProducto, String genero) {
            super(tipo, color, precio, idProducto, genero);
        }
    }
    
    public static class Pantalones extends Productos {
        public Pantalones(String tipo, String color, double precio, int idProducto, String genero) {
            super(tipo, color, precio, idProducto, genero);
        }
    }
    
    public static class Calzados extends Productos {
        public Calzados(String tipo, String color, double precio, int idProducto, String genero) {
            super(tipo, color, precio, idProducto, genero);
        }
    }
    
    public static class Vestidos extends Productos {
        public Vestidos(String tipo, String color, double precio, int idProducto, String genero) {
            super(tipo, color, precio, idProducto, genero);
        }
    }
    
    public static class Accesorios extends Productos {
        public Accesorios(String tipo, String color, double precio, int idProducto, String genero) {
            super(tipo, color, precio, idProducto, genero);
        }
    }
    
    private String tipo;
    private String color;
    private double precio;
    private int idProducto;
    private String genero;

    public Productos(String tipo, String color, double precio, int idProducto, String genero) {
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
        this.idProducto = idProducto;
        this.genero = genero;
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

    public static void main(String[] args) {
        Sueteres sueter1 = new Sueteres("Suéter", "Azul", 39.99, 1, "Unisex");
        Sueteres sueter2 = new Sueteres("Suéter", "Rojo", 45.99, 2, "Hombre");
        Sueteres sueter3 = new Sueteres("Suéter", "Verde", 49.99, 3, "Mujer");
        Sueteres sueter4 = new Sueteres("Suéter", "Gris", 35.99, 4, "Unisex");
        Sueteres sueter5 = new Sueteres("Suéter", "Negro", 42.99, 5, "Mujer");
        
        Pantalones pantalon1 = new Pantalones("Pantalón", "Azul", 59.99, 1, "Unisex");
        Pantalones pantalon2 = new Pantalones("Pantalón", "Negro", 65.99, 2, "Hombre");
        Pantalones pantalon3 = new Pantalones("Pantalón", "Gris", 54.99, 3, "Mujer");
        Pantalones pantalon4 = new Pantalones("Pantalón", "Beige", 49.99, 4, "Unisex");
        Pantalones pantalon5 = new Pantalones("Pantalón", "Verde", 57.99, 5, "Hombre");
        
        Calzados calzado1 = new Calzados("Calzado", "Negro", 79.99, 1, "Unisex");
        Calzados calzado2 = new Calzados("Calzado", "Blanco", 84.99, 2, "Mujer");
        Calzados calzado3 = new Calzados("Calzado", "Marrón", 72.99, 3, "Hombre");
        Calzados calzado4 = new Calzados("Calzado", "Azul", 67.99, 4, "Unisex");
        Calzados calzado5 = new Calzados("Calzado", "Gris", 76.99, 5, "Mujer");
        
        Vestidos vestido1 = new Vestidos("Vestido", "Rojo", 99.99, 1, "Mujer");
        Vestidos vestido2 = new Vestidos("Vestido", "Negro", 105.99, 2, "Mujer");
        Vestidos vestido3 = new Vestidos("Vestido", "Azul", 94.99, 3, "Mujer");
        Vestidos vestido4 = new Vestidos("Vestido", "Verde", 89.99, 4, "Mujer");
        Vestidos vestido5 = new Vestidos("Vestido", "Blanco", 97.99, 5, "Mujer");
        
        Accesorios accesorio1 = new Accesorios("Accesorio", "Plateado", 19.99, 1, "Unisex");
        Accesorios accesorio2 = new Accesorios("Accesorio", "Dorado", 24.99, 2, "Unisex");
        Accesorios accesorio3 = new Accesorios("Accesorio", "Negro", 21.99, 3, "Unisex");
        Accesorios accesorio4 = new Accesorios("Accesorio", "Rojo", 16.99, 4, "Unisex");
        Accesorios accesorio5 = new Accesorios("Accesorio", "Verde", 18.99, 5, "Unisex");
        
        System.out.println("Suéter 1 - Tipo: " + sueter1.getTipo() + ", Color: " + sueter1.getColor() + ", Precio: " + sueter1.getPrecio() + ", ID: " + sueter1.getIdProducto() + ", Género: " + sueter1.getGenero());
        
        System.out.println("Pantalón 3 - Tipo: " + pantalon3.getTipo() + ", Color: " + pantalon3.getColor() + ", Precio: " + pantalon3.getPrecio() + ", ID: " + pantalon3.getIdProducto() + ", Género: " + pantalon3.getGenero());
        
        System.out.println("Calzado 5 - Tipo: " + calzado5.getTipo() + ", Color: " + calzado5.getColor() + ", Precio: " + calzado5.getPrecio() + ", ID: " + calzado5.getIdProducto() + ", Género: " + calzado5.getGenero());
        
        System.out.println("Vestido 2 - Tipo: " + vestido2.getTipo() + ", Color: " + vestido2.getColor() + ", Precio: " + vestido2.getPrecio() + ", ID: " + vestido2.getIdProducto() + ", Género: " + vestido2.getGenero());
        
        System.out.println("Accesorio 4 - Tipo: " + accesorio4.getTipo() + ", Color: " + accesorio4.getColor() + ", Precio: " + accesorio4.getPrecio() + ", ID: " + accesorio4.getIdProducto() + ", Género: " + accesorio4.getGenero());
    }
}

