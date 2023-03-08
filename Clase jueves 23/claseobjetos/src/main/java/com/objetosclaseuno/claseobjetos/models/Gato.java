package com.objetosclaseuno.claseobjetos.models;

public class Gato extends Animal{
/* se utiliza extends como palabra reservada para llamar al animal */
    public Integer cantBigotes;


    /*el constructor vacio de una clase hija por defecto debe de tener la funcion super() para que asi pueda tener 
     * los atributos de animal 
     */


     /*Este seria el constructor vacio pero por recgla si o si debe de tener el super( ) como palabra reservada  */
public Gato(){
    super();
}

/* segundo constructor lo llamamos seleccionando donde estan todas las cositas y sale asi para poder traer los atributos
 * de la clase padre animal en este caso
 */
public Gato(String nombre, String raza, String pelaje, boolean vacunado, Integer cantBigotes) {
    super(nombre, raza, pelaje, vacunado);
    this.cantBigotes = cantBigotes;
}

/*en este caso no es necesario sobre escribir toodos los set o get que tiene el padre ya que al tenerlos la clase padre de inmediato
 los hereda del padre*/
/*pero de todas formas igual se debe de hacer get set para que tome el atributo particular de gato  */

public Integer getCantBigotes() {
    return cantBigotes;
}

public void setCantBigotes(Integer cantBigotes) {
    this.cantBigotes = cantBigotes;
}


/*hacemos la funcionalidad del pinche gato */

public void maulla (){
    System.out.println("miauuuuu!");
 }


/* realizamos un to string diferente ya que tenemos que llamar al padre  */

/* el to string se hace de lamisma forma anterior click derecho+accion codigo fuente + to string + manualmente
 se llama a la clase padre concatenando al to stringnormal con el "super.tostring()+"*/


@Override
public String toString() {
    return super.toString() + "Gato [cantBigotes=" + cantBigotes + "]";
}
 


    
}
