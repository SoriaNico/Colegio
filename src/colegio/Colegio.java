
package colegio;

public class Colegio {   
    public static void main(String[] args) {
        
        /* a) Crear las materias: 
        Ingles I de primer año.
        Matemáticas de primer año.
        Laboratorio I de primer año.*/
        Materia ing = new Materia(001, "Ingles I",1);
        Materia mat = new Materia(002, "Matemáticas",1);
        Materia lab = new Materia(003, "Laboratorio I",1);
        
        /*b) Crear 2 alumnos:
        López Martin con legajo 1001.
        Martínez Brenda con legajo 1002.*/        
        Alumno alum1 = new Alumno (1001, "López", "Martin");
        Alumno alum2 = new Alumno (1002, "Martínez", "Brenda");
        
        //c) Inscribir a López en las 3 materias.        
        alum1.agregarMateria(ing);
        alum1.agregarMateria(mat);
        alum1.agregarMateria(lab);
        
        //d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
        alum2.agregarMateria(ing);
        alum2.agregarMateria(mat);
        alum2.agregarMateria(lab);
        alum2.agregarMateria(lab);
        
        //e) Visualizar la cantidad de materias a las que está inscripto cada alumno.
        alum1.cantidadMaterias();
        alum2.cantidadMaterias();
        
        /*¿Por qué ambos tienen la misma cantidad si al último alumno lo inscribió en 4 materias?
        ¿Qué tipo de colección implementó para evitar materias repetidas?
        - Utilicé el tipo de colección 'Set' y su implementación 'HashSet' la cual no permite duplicados.
        Por esta razón, el último alumno muestra solo 3(tres) materias inscriptas.*/
    }
}
