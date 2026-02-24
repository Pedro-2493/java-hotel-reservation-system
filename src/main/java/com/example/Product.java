package com.example;

/**
 * Clase que representa un producto de reserva de hotel
 * Gestiona la informacion de las reservas incluyendo datos del huesped,
 * fechas de estadia y tipo de habitacion
 * 
 * @author Pedro Luis Zamora Martinez
 * @version 1.0
 */
public class Product {
    // Atributos de instancia
    private String id;
    private String name;
    private double price;
    private int stock;
    private String category;

    /**
     * Constructor por defecto
     * Inicializa todos los atributos con valores predeterminados
     */
    public Product() {
        this.id = null;
        this.name = null;
        this.price = 0.0;
        this.stock = 0;
        this.category = null;
    }

    /**
     * Constructor parametrizado
     * Permite crear un producto con todos los datos iniciales
     * 
     * @param id Codigo unico del producto
     * @param name Nombre del producto
     * @param price Precio del producto
     * @param stock Cantidad en inventario
     * @param category Categoria del producto
     */
    public Product(String id, String name, double price, int stock, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    // ==================== GETTERS ====================

    /**
     * Obtiene el ID del producto
     * @return Codigo unico del producto
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el nombre del producto
     * @return Nombre del producto
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el precio del producto
     * @return Precio del producto
     */
    public double getPrice() {
        return price;
    }

    /**
     * Obtiene el stock del producto
     * @return Cantidad en inventario
     */
    public int getStock() {
        return stock;
    }

    /**
     * Obtiene la categoria del producto
     * @return Categoria del producto
     */
    public String getCategory() {
        return category;
    }

    // ==================== SETTERS ====================

    /**
     * Establece el ID del producto
     * @param id Nuevo codigo del producto
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Establece el nombre del producto
     * @param name Nuevo nombre del producto
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Establece el precio del producto
     * Valida que el precio no sea negativo
     * @param price Nuevo precio del producto
     */
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: El precio no puede ser negativo");
        }
    }

    /**
     * Establece el stock del producto
     * Valida que el stock no sea negativo
     * @param stock Nueva cantidad en inventario
     */
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo");
        }
    }

    /**
     * Establece la categoria del producto
     * @param category Nueva categoria del producto
     */
    public void setCategory(String category) {
        this.category = category;
    }

    // ==================== METODOS ADICIONALES ====================

    /**
     * Calcula el valor total del inventario
     * @return Valor total (precio x stock)
     */
    public double calculateTotalValue() {
        return price * stock;
    }

    /**
     * Devuelve una representacion en texto del producto
     * @return String con toda la informacion del producto
     */
    @Override
    public String toString() {
        return "Producto [ID: " + id + 
               ", Nombre: " + name + 
               ", Precio: $" + price + 
               ", Stock: " + stock + 
               ", Categoria: " + category + 
               ", Valor Total: $" + calculateTotalValue() + "]";
    }
}