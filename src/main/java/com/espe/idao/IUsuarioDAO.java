package com.espe.idao;
import com.espe.model.Usuario;

import java.util.List;

public interface IUsuarioDAO {
    void guardar (Usuario usuario);
    void editar (Usuario usuario);
    Usuario buscarUsuario (int id);
    List<Usuario> obtenerUsuarios();
    // desarrollado por Anyel EC
    void eliminar(int id);
}