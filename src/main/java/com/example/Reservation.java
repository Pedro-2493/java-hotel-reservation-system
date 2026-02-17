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

//==================- GETTERS -=================

/**
 * Obtiene el Id de la reserva
 * @return Código unico de la reserva
 */
public String getReservationId(){
    return reservationId;
}

/**
 * Obtiene el nombre del huesped
 * @return Nombre completo del huesped
 */
public String guestName (){
    return guestName;
}

/**
 * Obtiene el tipo de habitación 
 * @return Cantidad de noches de la reserva
 */
public int getNumberOfNights(){
    return numberOfNights;
}

/**
 * Obtiene el precio por noche
 * @return Precio por noche en Dolares
 */
public double getPricePerNight(){
    return pricePerNight;
}

//==================- SETTERS -=================

/**
 * Establece el ID de la reserva
 * @param reservationId Nuevo codigo de reserva
 */
public void setReservationId(String reservationId){
    this.reservationId = reservationId;
}

/**
 * establece el nombre del huesped
 * @param guestName Nuevo nombre del huesped
 */
public void setGuestName(String guestName){
    this.guestName = guestName;
}

/**
 * Establece el tipo de ahabitación
 * @param roomType Nuevo tipo de habitación
 */
public void setRoomType(String roomType){
    this.roomType = roomType;
}

/**
 * Establece el numero de noches 
 * Establece que el numero sea positivo
 * @param numberOfNights Nueva cantidad de noches
 */
public void setNumberOfNights(int numberOfNights){
    if(numberOfNights > 0){
        this.numberOfNights = numberOfNights;
    } else {
        System.out.println("El número de noches debe ser mayor a 0(cero)");
    }
}

/**
 * Establece el precio por noche
 * Valida que el precio no sea negativo
 * @param pricePerNight Nuevo precio por noche
 */
public void setPricePerNigth(double pricePerNight){
    if(pricePerNight >= 0){
        this.pricePerNight = pricePerNight;
    } else {
        System.out.println("Ingrese un numero valido, el numero no puede ser negativo.");
    }
}


}


