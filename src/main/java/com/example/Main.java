package com.example;

/**
 * Clase de demostracion para el sistema de gestion de productos
 * Muestra el uso de constructores, getters, setters y validaciones
 * 
 * @author Pedro Luis Zamora Martinez
 * @version 1.0
 */
public class Main {
    
    /**
     * Imprime informacion detallada de un producto usando getters
     * @param producto El producto a mostrar
     * @param numero Numero del producto
     */
    private static void printProductDetails(Product producto, int numero) {
        System.out.println("--- Informacion de Producto " + numero + " ---");
        System.out.println("ID: " + producto.getId());
        System.out.println("Nombre: " + producto.getName());
        System.out.println("Precio: $" + producto.getPrice());
        System.out.println("Stock: " + producto.getStock());
        System.out.println("Categoria: " + producto.getCategory());
        System.out.println("Valor Total: $" + producto.calculateTotalValue());
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║   SISTEMA DE GESTION DE PRODUCTOS - HOTEL     ║");
        System.out.println("╚════════════════════════════════════════════════╝\n");
        
        // ========== PRODUCTO 1: Constructor por defecto ==========
        System.out.println(">>> Creando Producto 1 con constructor por defecto...\n");
        Product producto1 = new Product();
        
        System.out.println("Estado inicial:");
        System.out.println(producto1);
        
        // Modificar usando setters
        System.out.println("\n>>> Configurando producto con setters...");
        producto1.setId("P001");
        producto1.setName("Reserva Suite Ejecutiva");
        producto1.setPrice(180.00);
        producto1.setStock(10);
        producto1.setCategory("Habitaciones Premium");
        
        System.out.println("\nProducto 1 completo:");
        System.out.println(producto1);
        
        // ========== PRODUCTO 2: Constructor parametrizado ==========
        System.out.println("\n\n>>> Creando Producto 2 con constructor parametrizado...\n");
        Product producto2 = new Product(
            "P002", 
            "Reserva Habitacion Doble", 
            95.50, 
            25,
            "Habitaciones Estandar"
        );
        
        System.out.println("Producto 2 creado:");
        System.out.println(producto2);
        
        // Modificar algunos atributos
        System.out.println("\n>>> Actualizando producto 2...");
        producto2.setPrice(89.99);
        producto2.setStock(20);
        
        System.out.println("Producto 2 actualizado:");
        System.out.println(producto2);
        
        // ========== USANDO GETTERS ==========
        System.out.println("\n\n╔════════════════════════════════════════════════╗");
        System.out.println("║          DETALLES USANDO GETTERS              ║");
        System.out.println("╚════════════════════════════════════════════════╝\n");
        
        printProductDetails(producto1, 1);
        printProductDetails(producto2, 2);
        
        // ========== PROBANDO VALIDACIONES ==========
        System.out.println("\n╔════════════════════════════════════════════════╗");
        System.out.println("║           PROBANDO VALIDACIONES               ║");
        System.out.println("╚════════════════════════════════════════════════╝\n");
        
        System.out.println(">>> Intentando establecer precio negativo...");
        producto1.setPrice(-100.00);
        
        System.out.println("\n>>> Intentando establecer stock negativo...");
        producto2.setStock(-50);
        
        System.out.println("\n>>> Estableciendo valores validos...");
        producto1.setPrice(200.00);
        producto2.setStock(30);
        System.out.println("Valores actualizados correctamente");
        
        // ========== RESUMEN FINAL ==========
        System.out.println("\n\n╔════════════════════════════════════════════════╗");
        System.out.println("║              RESUMEN FINAL                    ║");
        System.out.println("╚════════════════════════════════════════════════╝\n");
        
        System.out.println(producto1);
        System.out.println(producto2);
        
        double valorTotalInventario = producto1.calculateTotalValue() + producto2.calculateTotalValue();
        System.out.println("\nValor total del inventario: $" + valorTotalInventario);
        
        System.out.println("\nGracias por usar el Sistema de Gestion de Productos!");
    }
}