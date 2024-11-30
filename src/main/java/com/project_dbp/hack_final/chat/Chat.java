package com.project_dbp.hack_final.chat;

import com.project_dbp.hack_final.usuario.Usuario;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ChatName;

    private Date dateCreation;

    @ManyToOne(optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

}
