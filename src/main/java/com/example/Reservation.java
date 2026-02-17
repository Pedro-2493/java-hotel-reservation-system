package com.example;
/**
 * Clase que representa una reserva de hotel
 * Gestiona la información de las reservas incluyendo datos del huésped,
 * fechas de salida y tipo de habitacón 
 * 
 * @author Pedro Luis Zamora Martinez
 * @version 1.0
 */
public class Reservation {
private String reservationId;
private String guestName;
private String roomType;
private int numberOfNights;
private double pricePerNight;

/**
 * Constructor por defecto
 * Inicializa todos los atributos con valores predeterminados
 */
public Reservation(){
    this.reservationId = null;
    this.guestName = null;
    this.roomType = null;
    this.numberOfNights = 0;
    this.pricePerNight = 0.0;
}

/**
 * Constructor parametrizado
 * permite crear una reserva con todos los datos iniciales
 * 
 * @param reservationId Código unico de la reserva 
 * @param guestName Nombre completo del huesped
 * @param roomType Tipo de habitación (Sencilla, Doble, suite)
 * @param numberOfNights Número de noches de estadia
 * @param pricePerNight Precio por noche en dolares
 */
public Reservation(String reservationId, String guestName, String roomType, int numberOfNights, double pricePerNight){
    this.reservationId = reservationId;
    this.guestName = guestName;
    this.roomType = roomType;
    this.numberOfNights = numberOfNights;
    this.pricePerNight = pricePerNight;
}


}
