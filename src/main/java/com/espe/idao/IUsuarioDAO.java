package com.espe.idao;
import com.espe.model.Usuario;

import java.util.List;

public interface IUsuarioDAO {
    void guardar (Usuario usuario);
    void editar (Usuario usuario);
    Usuario buscarUsuario (int id);
    List<Usuario> obtenerUsuarios();
    // desarrollado por Anyel EC
<<<<<<< HEAD
    void eliminar(int id);
}
=======
}
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
