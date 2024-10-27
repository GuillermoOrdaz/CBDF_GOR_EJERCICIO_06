package com.example.cam.models;
//Base de datos o persistencia
import jakarta.persistence.*;
//Validación antes de ingresar a la base de datos
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor

@NoArgsConstructor

@Entity

@Table(name = "cliente")
public class ClienteEntity {
    //Esta es la llave primaria y que MySQL genere id
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //En caso de requerir un nombre diferente al de la clase
    @NotBlank
    @Size(min = 3, message = "El nombre del cliente debe tener mínimo 3 letras")
    @Column(name = "nombre_cliente")
    private String nombre;

    @NotBlank(message = "Se debe de ingresar un apellido")
    private String apellido;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank
    //@Pattern(regexp = "^\\\\d{10}$")
    private String telefono;

    @NotBlank
    private String direccion;

    @Min(18)
    private int edad;

    @NotBlank
    //@Pattern(regexp = "^[A-Z]{4}\\\\d{6}[A-Z0-9]{3}$")
    private String rfc;


}
