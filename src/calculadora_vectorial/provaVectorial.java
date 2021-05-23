package calculadora_vectorial;

import java.util.ArrayList;

class provaVectorial {
  private static final int N = 15;

  public static void main(String[] args) {
   vectorial v = new vectorial();
   ArrayList<Integer> op1 = new ArrayList<Integer>();
   ArrayList<Integer> op2 = new ArrayList<Integer>();
   for(int i=0;i<N;i++) {
     int valorEntero1 =(int)Math.floor(Math.random()*100.0);
     op1.add(Integer.valueOf(valorEntero1));
     int valorEntero2 = (int)Math.floor(Math.random()*100.0);
     op2.add(Integer.valueOf(valorEntero2));
   }
   try {
	   v.suma(op1,op2);
   }
   catch (DiferentLongitudException e) {
	   System.out.println(e.getMessage());
   }
   ArrayList<Integer> op3=v.getResultat();
   String d1="",d2="",d3="";
   for(int i=0;i<op1.size();i++) {
     d1 += ""+((Integer)op1.get(i)).toString()+"|";
     d2 += ""+((Integer)op2.get(i)).toString()+"|";
     d3 += ""+((Integer)op3.get(i)).toString()+"|";
   }
   System.out.println(d1+"\n"+d2+"\n"+d3);
   v.inversio(op1);
   op3=v.getResultat();
   d1="";
   d3="";
   for(int i=0;i<op1.size();i++) {
     d1 += ""+((Integer)op1.get(i)).toString()+"|";
     d3 += ""+((Integer)op3.get(i)).toString()+"|";
	 }
   System.out.println(d1+"\n"+d3);
  }
}