package src.aplicacion;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;         
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Principal{
    public static void main(String[] args){

        LocalDate fechaLocal = LocalDate.now();
        DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd//MM//yyyy");
        System.out.println("1.Fecha actual en formato de España: " + fechaLocal.format(formatFecha));

        ZoneId zonaCaracas = ZoneId.of("America/Caracas");
        ZonedDateTime fechaCaracas = ZonedDateTime.now(zonaCaracas);
        System.out.println("2. Fecha actual en Caracas: " + fechaCaracas.format(formatFecha));

        int descubrimientoAmerica = 1942;
        int anostranscurridos = fechaLocal.getYear() - descubrimientoAmerica;
        System.out.println("3. Años transcurridos desde el descubrimiento de America: " + anostranscurridos);

        LocalTime horaLocal = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH: mm : ss");
        System.out.println("4. Hora actual en formato de España: " + horaLocal.format(formatoHora));
      
        LocalTime horaCaracas = fechaCaracas.toLocalTime();
        System.out.println("5. Hora actual en Caracas: " + horaCaracas.format(formatoHora));


        Duration diferenciaHoraria = Duration.between(fechaCaracas.toLocalTime(), horaLocal);
        System.out.println("6. Diferencia horaria entre Madrid y Caracas: " + diferenciaHoraria.toHours());

        LocalDateTime neilArmstrongTime = LocalDateTime.of(1969, 7, 21, 3, 56);
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd//MM/yyyy");
        System.out.println("7. Fecha y hora de la llegada a la luna en Madrid: " + neilArmstrongTime);


    }

}


