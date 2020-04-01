package controlador;


import java.io.Serializable;
import java.util.ArrayList;
import modelo.Pais;

public class Paises implements Serializable {

    ArrayList<Pais> paises = new ArrayList<Pais>();

    public void agregarPais(Pais pais) {
        paises.add(pais);

    }

    public boolean eliminarPais(Pais paisAEliminar) {
        boolean elimino = false;

        if (paisAEliminar == null) {
            elimino = false;
        } else {
            paises.remove(paisAEliminar);
            elimino = true;
        }
        return elimino;

    }

    public String mostrarPaisesContagiados() {

        String listado = null;
        for (Pais pais : paises) {
            if (listado != null) {
                listado = listado + " \n" + pais.toStringContagios();
            } else {
                listado = pais.toStringContagios() + " \n";
            }
        }
        return listado;
    }

    public String mostrarPaisesMuertes() {
        String listado = null;
        for (Pais pais : paises) {
            if (listado != null) {
                listado = listado + " \n" + pais.toStringMuertos();
            } else {
                listado = pais.toStringMuertos() + " \n";
            }
        }
        return listado;
    }

    public Pais buscarPorNombre(String nombreBuscado) {
        Pais objAux = null;
        for (Pais pais : paises) {
            if (nombreBuscado.equalsIgnoreCase(pais.getNombre())) {
                objAux = pais;
                return objAux;
            }
        }
        return objAux;
    }

    public void ordenarPorBrbujaCont() {
        for (int i = 0; i < paises.size() - 1; i++) {
            for (int j = 0; j < paises.size() - 1; j++) {

                if (paises.get(j).getNumeroContagiados() < paises.get(j + 1).getNumeroContagiados()) {
                    Pais aux = paises.get(j + 1);
                    Pais aux2 = paises.get(j);
                    paises.set(j, aux);
                    paises.set(j + 1, aux2);

                }

            }
        }
    }

    public void ordenarPorBrbujaMuer() {
        for (int i = 0; i < paises.size() - 1; i++) {
            for (int j = 0; j < paises.size() - 1; j++) {

                if (paises.get(j).getNumeroMuertos() < paises.get(j + 1).getNumeroMuertos()) {
                    Pais aux = paises.get(j + 1);
                    Pais aux2 = paises.get(j);
                    paises.set(j, aux);
                    paises.set(j + 1, aux2);

                }

            }
        }
    }

}
