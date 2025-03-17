package org.uniquindio.edu.co.poo.model;


import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Universidad {
    private String nombre;
    private String ubicacion;
    private ArrayList<Estudiante> listaEstudiantes;

    /**
     * Este metodo permite inicializar los valores de los atributos de una universidad
     *
     * @param nombre
     * @param ubicacion
     */

    public Universidad(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaEstudiantes = new ArrayList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }

    public String registrarEstudiante(String nombre, String identificacion) {
        if (buscarEstudiante(identificacion) != null) {
            return "El estudiante con identificación " + identificacion + " ya está registrado en la universidad.";
        }
        listaEstudiantes.add(new Estudiante(nombre, identificacion));
        return "El estudiante fue registrado exitosamente.";

    }

    public Estudiante buscarEstudiante(String identificacion) {
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getIdentificacion().equals(identificacion)) {
                return estudianteAux;
            }
        }
        return null;  // Devuelve null si no encuentra el estudiante
    }



    public String registrarNota(String identificacion, String nombreNota, float valorNota) {
        Estudiante estudianteEncontrado = buscarEstudiante(identificacion);
        if (estudianteEncontrado != null) {
            estudianteEncontrado.registrarNota(nombreNota, valorNota);
            return "Nota registrada exitosamente.";
        } else {
            return "El estudiante no está registrado en la universidad.";
        }
    }


    public float calcularDefinitiva() {
        if (listaEstudiantes.isEmpty()) {
            return 0;  // Evita la división por cero
        }
        float sumatoria = 0;
        for (Estudiante estudiante : listaEstudiantes) {
            sumatoria += estudiante.calcularDefinitiva();
        }
        return sumatoria / listaEstudiantes.size();
    }


    public String actualizarNota(String identificacion, String nombreNota, float nuevoValorNota) {
        Estudiante estudianteEncontrado = buscarEstudiante(identificacion);
        if (estudianteEncontrado == null) {
            return "El estudiante no está registrado en la universidad.";
        }
        return estudianteEncontrado.actualizarNota(nombreNota, nuevoValorNota);
    }



    public void predecirAprobacion() {
        StringBuilder mensaje = new StringBuilder("Estudiantes con posibilidad de aprobar:\n");
        boolean hayPosibilidades = false;

        for (Estudiante estudiante : listaEstudiantes) {
            float promedioActual = estudiante.calcularDefinitiva();
            if (promedioActual < 3.0f) {
                float mejoraNecesaria = calcularMejoraParaAprobar(estudiante);
                if (mejoraNecesaria > 0) {
                    mensaje.append(estudiante.getNombre())
                            .append(" necesita mejorar una nota en al menos ")
                            .append(String.format("%.2f", mejoraNecesaria))
                            .append("\n");
                    hayPosibilidades = true;
                }
            }
        }

        if (!hayPosibilidades) {
            mensaje.append("No hay estudiantes con posibilidad de mejorar su promedio.");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    private float calcularMejoraParaAprobar(Estudiante estudiante) {
        float sumaNotas = 0;
        int cantidadNotas = estudiante.getListaNotas().size();
        float menorNota = Float.MAX_VALUE;

        if (cantidadNotas == 0) {
            return 0; // No se puede mejorar si no hay notas
        }

        for (Nota nota : estudiante.getListaNotas()) {
            sumaNotas += nota.getValor();
            if (nota.getValor() < menorNota) {
                menorNota = nota.getValor();
            }
        }

        float sumaNecesaria = (3.0f * cantidadNotas) - sumaNotas;
        return Math.min(5.0f, Math.max(0, menorNota + sumaNecesaria));
    }

    public void mejorEstudiantePorNota(int indiceNota) {
        Estudiante mejorEstudiante = null;
        float mejorNota = -1;

        for (Estudiante estudiante : listaEstudiantes) {
            float nota = estudiante.obtenerNotaPorIndice(indiceNota);
            if (nota > mejorNota) {
                mejorNota = nota;
                mejorEstudiante = estudiante;
            }
        }

        if (mejorEstudiante != null) {
            JOptionPane.showMessageDialog(null,
                    "El mejor estudiante en la nota " + (indiceNota + 1) + " es " +
                            mejorEstudiante.getNombre() + " con " + mejorNota);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna nota en la posición solicitada.");
        }
    }

    public void mostrarNotasEstudiante(String identificacion) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdentificacion().equals(identificacion)) {
                StringBuilder mensaje = new StringBuilder("Notas de " + estudiante.getNombre() + ":\n");

                for (Nota nota : estudiante.getListaNotas()) {
                    mensaje.append(nota.getNombre()).append(": ").append(nota.getValor()).append("\n");
                }

                mensaje.append("Promedio: ").append(String.format("%.2f", estudiante.calcularDefinitiva()));
                JOptionPane.showMessageDialog(null, mensaje.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
    }

    public void mostrarListaEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
            return;
        }

        StringBuilder mensaje = new StringBuilder("Lista de estudiantes y promedios:\n");

        for (Estudiante estudiante : listaEstudiantes) {
            mensaje.append(estudiante.getNombre()).append(" - Promedio: ")
                    .append(String.format("%.2f", estudiante.calcularDefinitiva())).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

}