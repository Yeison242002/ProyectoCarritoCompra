
package modelo;

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
    
    public static class Sueteres extends Productos {
        public Sueteres(String nombre, String tipo, String color, double precio, int idProducto, String genero) {
            super(nombre, tipo, color, precio, idProducto, genero);
        }
    }
    
    public static class Pantalones extends Productos {
        public Pantalones(String nombre, String tipo, String color, double precio, int idProducto, String genero) {
            super(nombre, tipo, color, precio, idProducto, genero);
        }
    }
    
    public static class Calzados extends Productos {
        public Calzados(String nombre, String tipo, String color, double precio, int idProducto, String genero) {
            super(nombre, tipo, color, precio, idProducto, genero);
        }
    }
    
    public static class Vestidos extends Productos {
        public Vestidos(String nombre, String tipo, String color, double precio, int idProducto, String genero) {
            super(nombre, tipo, color, precio, idProducto, genero);
        }
    }
    
    public static class Accesorios extends Productos {
        public Accesorios(String nombre, String tipo, String color, double precio, int idProducto, String genero) {
            super(nombre, tipo, color, precio, idProducto, genero);
        }
    }
    
    

    public static void main(String[] args) {
        Sueteres sueter1 = new Sueteres("Tommy Hilfiger", "Suéter", "Negro", 150.000, 1, "Hombre");
        Sueteres sueter2 = new Sueteres("Tommy Blower", "Suéter", "Azul Marino", 130.000, 2, "Hombre");
        Sueteres sueter3 = new Sueteres("Sumer Red", "Suéter", "Granate", 50.000, 3, "Hombre");
        Sueteres sueter4 = new Sueteres("Levi´s Housemarck", "Suéter", "Crema", 200.000, 4, "Hombre");
        Sueteres sueter5 = new Sueteres("Champion Girl", "Suéter", "Añil", 95.000, 5, "Mujer");
        Sueteres sueter6 = new Sueteres("Blower M", "Suéter", "Negro, Azul, Gris", 180.000, 6, "Mujer");
        Sueteres sueter7 = new Sueteres("Dam Glup", "Suéter", "Azul Marino", 200.000, 7, "Mujer");
       
        
        Pantalones pantalon1 = new Pantalones("Wonder Clasicos", "Pantalón", "Gris", 200.000, 8, "Hombre");
        Pantalones pantalon2 = new Pantalones("Bermuda Blower", "Pantalón", "Aciano oscuro", 170.000, 9, "Hombre");
        Pantalones pantalon3 = new Pantalones("Mich Jean", "Pantalón", "Gris Azulado", 200.000, 10, "Hombre");
        Pantalones pantalon4 = new Pantalones("Mich Jean Dama", "Pantalón", "Azul oscuro", 210.000, 11, "Mujer");
        Pantalones pantalon5 = new Pantalones("Coul Holgado", "Pantalón", "Aciano", 80.000, 12, "Mujer");
        
        Calzados calzado1 = new Calzados("HGL Brow", "Calzado", "Gris", 190.000, 13, "Hombre");
        Calzados calzado2 = new Calzados("Nautica deportivos", "Calzado", "Gris Claro", 300.000, 14, "Hombre");
        Calzados calzado3 = new Calzados("Brower Clasicos", "Calzado", "Verde Palta", 500.000, 15, "Hombre");
        Calzados calzado4 = new Calzados("Steve Madden", "Calzado", "Negro", 250.000, 16, "Mujer");
        Calzados calzado5 = new Calzados("Madden Girl", "Calzado", "Crema", 100.000, 17, "Mujer");
        
        Vestidos vestido1 = new Vestidos("Light Holgado", "Vestido", "Gris", 200.000, 18, "Mujer");
        Vestidos vestido2 = new Vestidos("Madden Minch", "Vestido", "Negro", 350.000, 19, "Mujer");
        Vestidos vestido3 = new Vestidos("Floral -25", "Vestido", "Foral", 200.000, 20, "Mujer");
        Vestidos vestido4 = new Vestidos("Herm Girl", "Vestido", "Blanco", 650.000, 21, "Mujer");
       
        
        Accesorios accesorio1 = new Accesorios("Soul Break", "Accesorio", "Negro", 99.000, 22, "Unisex");
        Accesorios accesorio2 = new Accesorios("Soul Brom", "Accesorio", "Crema", 160.000, 23, "Unisex");
        Accesorios accesorio3 = new Accesorios("Madden Lith", "Accesorio", "Negro", 600.000, 24, "Unisex");
        Accesorios accesorio4 = new Accesorios("Herm Browm", "Accesorio", "Gris Oscuro", 300.000, 25, "Unisex");
        Accesorios accesorio5 = new Accesorios("Champion Roja", "Accesorio", "Rojo", 100.000, 26, "Unisex");
        Accesorios accesorio6 = new Accesorios("Calcetines Grices", "Accesorio", "Gris", 50.000, 27, "Unisex");
        
        System.out.println("Suéter 1 - Nombre: " + sueter1.getNombre() + ", Tipo: " + sueter1.getTipo() + ", Color: " + sueter1.getColor() + ", Precio: " + sueter1.getPrecio() + ", ID: " + sueter1.getIdProducto() + ", Género: " + sueter1.getGenero());

        System.out.println("Pantalón 3 - Nombre: " + pantalon3.getNombre() + ", Tipo: " + pantalon3.getTipo() + ", Color: " + pantalon3.getColor() + ", Precio: " + pantalon3.getPrecio() + ", ID: " + pantalon3.getIdProducto() + ", Género: " + pantalon3.getGenero());

        System.out.println("Calzado 5 - Nombre: " + calzado5.getNombre() + ", Tipo: " + calzado5.getTipo() + ", Color: " + calzado5.getColor() + ", Precio: " + calzado5.getPrecio() + ", ID: " + calzado5.getIdProducto() + ", Género: " + calzado5.getGenero());

        System.out.println("Vestido 2 - Nombre: " + vestido2.getNombre() + ", Tipo: " + vestido2.getTipo() + ", Color: " + vestido2.getColor() + ", Precio: " + vestido2.getPrecio() + ", ID: " + vestido2.getIdProducto() + ", Género: " + vestido2.getGenero());

        System.out.println("Accesorio 4 - Nombre: " + accesorio4.getNombre() + ", Tipo: " + accesorio4.getTipo() + ", Color: " + accesorio4.getColor() + ", Precio: " + accesorio4.getPrecio() + ", ID: " + accesorio4.getIdProducto() + ", Género: " + accesorio4.getGenero());

}}

