package calculadora_vectorial;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Una classe par operar amb vectors, de 2 a 3 vectors a la vegada per operació.
 * Cada vector esta format pels seus components, sent cadascun
 * un nombre enter dintre de l'estructura de dades Array.List.
 * @version 1.0, 23/05/2021
 * @author Victor Largo
 */

class vectorial {

/**
 * Atribut privat que conte els components del vector resultant, tipus ArrayList de nombres enters.
 */
  private ArrayList<Integer> resultat;
  
  /**
   * Mètode que suma 2 vectors. Espera 2 paràmetres tipus Array.List de sencers i no retorna res.
   * Llança la excepció personalitzada DiferentLongitudException per assegurar que els vectors a operar disposin 
   * del mateix nombre de components.
   * @param op1 Primer vector tipus Array.List de sencers que es passa com a paràmetre per realitza l'operació
   * @param op2 Segon vector tipus Array.List de sencers que es pasa com a paràmetre per realitza l'operació
   * @throws DiferentLongitudException: Excepció que es llança si els vectors són de diferents longituds.
   */
  public void suma(ArrayList<Integer> op1, ArrayList<Integer> op2) throws DiferentLongitudException {
	  resultat = new ArrayList<Integer>();
	  if (op1.size() != op2.size()) {
		  throw new DiferentLongitudException("Els 2 vectors a sumar han de tenir la mateixa longitud");
	  }
	  else {
		  for(int i=0;i<op1.size();i++) {
			  resultat.add(Integer.valueOf(((Integer)op1.get(i)).intValue()+((Integer)op2.get(i)).intValue()));
		  }
	  }
  }
  
  /**
   * Mètode que suma 3 vectors. Espera 3 paràmetres tipus Array.List de sencers i no retorna res.
   * Llança la excepció personalitzada DiferentLongitudException per assegurar que els vectors a operar disposin 
   * del mateix nombre de components.
   * @param op1 Primer vector tipus Array.List de sencers que es passa com a paràmetre per realitza l'operació.
   * @param op2 Segon vector tipus Array.List de sencers que es pasa com a paràmetre per realitza l'operació.
   * @param op3 Tercer vector tipus Array.List de sencers que es pasa com a paràmetre per realitza l'operació.
   * @throws DiferentLongitudException: Excepció que es llança si els vectors són de diferents longituds.
   */
  public void suma(ArrayList<Integer> op1, ArrayList<Integer> op2, ArrayList<Integer> op3) throws DiferentLongitudException {
    resultat = new ArrayList<Integer>();
    if (op1.size() != op2.size() || op1.size() != op3.size() ) {
		  throw new DiferentLongitudException("Els 3 vectors a sumar han de tenir la mateixa longitud");
	}
    else {
    	for(int i=0;i<op1.size();i++) {
    		resultat.add(Integer.valueOf(((Integer)op1.get(i)).intValue()+((Integer)op2.get(i)).intValue()+((Integer)op3.get(i)).intValue()));
    	}
    }
  }
  
  /**
   * Mètode que resta 2 vectors. Espera 2 paràmetres tipus Array.List de sencers i no retorna res.
   * Llança la excepció personalitzada DiferentLongitudException per assegurar que els vectors a operar disposin 
   * del mateix nombre de components.
   * @param op1 Primer vector tipus Array.List de sencers que es passa com a paràmetre per realitza l'operació.
   * @param op2 Segon vector tipus Array.List de sencers que es pasa com a paràmetre per realitza l'operació.
   * @throws DiferentLongitudException: Excepció que es llança si els vectors són de diferents longituds.
   */
  public void resta(ArrayList<Integer> op1, ArrayList<Integer> op2) throws DiferentLongitudException {
	   resultat = new ArrayList<Integer>();
	   if (op1.size() != op2.size()) {
			  throw new DiferentLongitudException("Els 2 vectors a restar han de tenir la mateixa longitud");
	   }
	   else {
		   for(int i=0;i<op1.size();i++) {
			   resultat.add(Integer.valueOf(((Integer)op1.get(i)).intValue()-((Integer)op2.get(i)).intValue()));
		   }
	   }
  }
  
  /**
   * Mètode que resta 3 vectors. Espera 3 paràmetres tipus Array.List de sencers i no retorna res.
   * Llança la excepció personalitzada DiferentLongitudException per assegurar que els vectors a operar disposin 
   * del mateix nombre de components.
   * @param op1 Primer vector tipus Array.List de sencers que es passa com a paràmetre per realitza l'operació.
   * @param op2 Segon vector tipus Array.List de sencers que es pasa com a paràmetre per realitza l'operació.
   * @param op3 Tercer vector tipus Array.List de sencers que es pasa com a paràmetre per realitza l'operació.
   * @throws DiferentLongitudException: Excepció que es llança si els vectors són de diferents longituds.
   */
  public void resta(ArrayList<Integer> op1, ArrayList<Integer> op2, ArrayList<Integer> op3) throws DiferentLongitudException {
	   resultat = new ArrayList<Integer>();
	   if (op1.size() != op2.size() || op1.size() != op3.size() ) {
			  throw new DiferentLongitudException("Els 3 vectors a restar han de tenir la mateixa longitud");
		}
	    else {
	    	for(int i=0;i<op1.size();i++) {
	    		resultat.add(Integer.valueOf(((Integer)op1.get(i)).intValue()-((Integer)op2.get(i)).intValue()-((Integer)op3.get(i)).intValue()));
	    	}
	    }
  }

  /**
   * Mètode que multiplica 2 vectors. Espera 2 paràmetres tipus Array.List de sencers i no retorna res.
   * Llança la excepció personalitzada DiferentLongitudException per assegurar que els vectors a operar disposin 
   * del mateix nombre de components.
   * @param op1 Primer vector tipus Array.List de sencers que es passa com a paràmetre per realitza l'operació.
   * @param op2 Segon vector tipus Array.List de sencers que es pasa com a paràmetre per realitza l'operació.
   * @throws DiferentLongitudException: Excepció que es llança si els vectors són de diferents longituds.
   */
  public void multiplicacio(ArrayList<Integer> op1, ArrayList<Integer> op2) throws DiferentLongitudException {
    resultat = new ArrayList<Integer>();
    if (op1.size() != op2.size()) {
		  throw new DiferentLongitudException("Els 2 vectors a multiplicar han de tenir la mateixa longitud");
    }
    else {
    	for(int i=0;i<op1.size();i++) {
    		resultat.add(Integer.valueOf(((Integer)op1.get(i)).intValue()*((Integer)op2.get(i)).intValue()));
    	}
    }
  }

  /**
   * Mètode que multiplica 3 vectors. Espera 3 paràmetres tipus Array.List de sencers i no retorna res.
   * Llança la excepció personalitzada DiferentLongitudException per assegurar que els vectors a operar disposin 
   * del mateix nombre de components.
   * @param op1 Primer vector tipus Array.List de sencers que es passa com a paràmetre per realitza l'operació.
   * @param op2 Segon vector tipus Array.List de sencers que es pasa com a paràmetre per realitza l'operació.
   * @param op3 Tercer vector tipus Array.List de sencers que es pasa com a paràmetre per realitza l'operació.
   * @throws DiferentLongitudException: Excepció que es llança si els vectors són de diferents longituds.
   */
  public void multiplicacio(ArrayList<Integer> op1, ArrayList<Integer> op2, ArrayList<Integer> op3) throws DiferentLongitudException {
    resultat = new ArrayList<Integer>();
    if (op1.size() != op2.size() || op1.size() != op3.size() ) {
		  throw new DiferentLongitudException("Els 3 vectors a multiplicar han de tenir la mateixa longitud");
	}
    else {
    	for(int i=0;i<op1.size();i++) {
    		resultat.add(Integer.valueOf(((Integer)op1.get(i)).intValue()*((Integer)op2.get(i)).intValue()*((Integer)op3.get(i)).intValue()));
    	}
    }
  }

  /**
   * Mètode que extreu el total de la suma dels components d'un vector.
   * Rep com a unic paràmetre d'entrada un vector de tipus ArrayList de sencers.
   * Retorna un nombre enter corresponent al total de la suma dels components del vector.
   * @param op1 vector tipus Array.List de sencers que es passa com a paràmetre per realitza l'operació
   * @return acum: Nombre enter corresponet a la suma dels components del vector.
   */
  public int total(ArrayList<Integer> op1) {
    int acum = 0;
    for(int i=0;i<op1.size();i++)
    acum += ((Integer)op1.get(i)).intValue();
    return acum;
  }
  
  /**
   * Mètode que inverteix l'ordre del components del vector 2 vectors. Rep com a paràmetre un vector tipus ArrayList de sencers,
   * inverteix el seu ordre i no retorna res.
   * @param op1 Primer vector tipus Array.List de sencers que es passa com a paràmetre per realitza l'operació
   */
  public void inversio(ArrayList<Integer> op1) {
    resultat = new ArrayList<Integer>();
    for (int i=0;i<op1.size();i++) resultat.add(op1.get(i));
    Collections.reverse(resultat);
  }
  
  /**
   * Mètode que retorna l'atribut privat de la classe vectorial, resultat, no rep cap paràmetre d'entrada.
   * @return resultat: vector resultant després d'haver realitzat l'operació.
   */
  public ArrayList<Integer> getResultat() {
    return resultat;
  }
}

@SuppressWarnings("serial")
class DiferentLongitudException extends Exception {
	public DiferentLongitudException(String missatge) {
		super(missatge);
	}
}
