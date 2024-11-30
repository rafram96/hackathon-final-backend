package com.project_dbp.hack_final.chat;

import com.project_dbp.hack_final.usuario.Usuario;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
