package edu.dosw.parcial.entity;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class UsuarioEnlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String nombre;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String programa;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @Column(nullable = false)
    private Estado estado;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @Column(nullable = false)
    private Rol rol;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @Column(nullable = false)
    private Nivel nivel;

    @NotBlank
    @Column(nullable = false, length = 100)
    private List<String> materiasInscritas;

    public UsuarioEnlaceModel {
        materiasInscritas = materiasInscritas == null ? List.of() : List.copyOf(materiasInscritas);
    }
    





    
}
