package persistencia;

import controlador.Paises;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Persistencia {

    public void guardar(Paises paises) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("paises.obj"));
        salida.writeObject(paises);
        salida.close();
        System.out.println("La lista fue almacenada correctamente");
    }

    public Paises recuperar() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("paises.obj"));
        Paises paises = (Paises) entrada.readObject();
        entrada.close();
        System.out.println("La lista fue cargada satisfactoriamente");
        return paises;

    }

}
