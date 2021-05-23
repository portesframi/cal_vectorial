package calculadora_vectorial;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class vectorialTest {
	private vectorial v = new vectorial();
	private ArrayList<Integer> esperat,resultat,vector0,vector1,vector2;
		
	@Test
	public void testSuma2_vectors_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(4));
		esperat.add(Integer.valueOf(6));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(3));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(3));
		try {
			v.suma(vector0,vector1);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertEquals(esperat,resultat);
	}
	
	@Test
	public void testSuma2_vectors_no_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(7));
		esperat.add(Integer.valueOf(6));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(3));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(3));
		try {
			v.suma(vector0,vector1);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertNotEquals(esperat,resultat);
	}

	@Test
	public void testSuma2_vectors_excepcio() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(7));
		esperat.add(Integer.valueOf(6));
		vector0.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(3));
		try {
			v.suma(vector0,vector1);
			fail("S'esperava la excepció DiferentLongitudException");
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testSuma3_vectors_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		vector2 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(4));
		esperat.add(Integer.valueOf(6));
		esperat.add(Integer.valueOf(8));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(1));
		vector1.add(Integer.valueOf(3));
		vector1.add(Integer.valueOf(4));
		vector2.add(Integer.valueOf(1));
		vector2.add(Integer.valueOf(1));
		vector2.add(Integer.valueOf(2));
		try {
			v.suma(vector0,vector1,vector2);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertEquals(esperat,resultat);
	}
	
	@Test
	public void testSuma3_vectors_no_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		vector2 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(4));
		esperat.add(Integer.valueOf(6));
		esperat.add(Integer.valueOf(8));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(1));
		vector1.add(Integer.valueOf(3));
		vector1.add(Integer.valueOf(4));
		vector2.add(Integer.valueOf(6));
		vector2.add(Integer.valueOf(1));
		vector2.add(Integer.valueOf(2));
		try {
			v.suma(vector0,vector1,vector2);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertNotEquals(esperat,resultat);
	}
	
	@Test
	public void testSuma3_vectors_excepcio() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		vector2 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(4));
		esperat.add(Integer.valueOf(6));
		esperat.add(Integer.valueOf(8));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(1));
		vector1.add(Integer.valueOf(3));
		vector1.add(Integer.valueOf(4));
		vector2.add(Integer.valueOf(6));
		vector2.add(Integer.valueOf(2));
		try {
			v.suma(vector0,vector1,vector2);
			fail("S'esperava la excepció DiferentLongitudException");
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testResta2_vectors_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(4));
		esperat.add(Integer.valueOf(6));
		vector0.add(Integer.valueOf(8));
		vector0.add(Integer.valueOf(9));
		vector1.add(Integer.valueOf(4));
		vector1.add(Integer.valueOf(3));
		try {
			v.resta(vector0,vector1);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertEquals(esperat,resultat);
	}
	
	@Test
	public void testResta2_vectors_no_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(3));
		esperat.add(Integer.valueOf(6));
		vector0.add(Integer.valueOf(8));
		vector0.add(Integer.valueOf(9));
		vector1.add(Integer.valueOf(4));
		vector1.add(Integer.valueOf(3));
		try {
			v.resta(vector0,vector1);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertNotEquals(esperat,resultat);
	}
	
	@Test
	public void testResta2_vectors_excepcio() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(4));
		esperat.add(Integer.valueOf(6));
		vector0.add(Integer.valueOf(8));
		vector0.add(Integer.valueOf(9));
		vector1.add(Integer.valueOf(3));
		try {
			v.resta(vector0,vector1);
			fail("S'esperava la excepció DiferentLongitudException");
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testResta3_vectors_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		vector2 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(4));
		esperat.add(Integer.valueOf(6));
		esperat.add(Integer.valueOf(8));
		vector0.add(Integer.valueOf(10));
		vector0.add(Integer.valueOf(13));
		vector0.add(Integer.valueOf(20));
		vector1.add(Integer.valueOf(4));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(10));
		vector2.add(Integer.valueOf(2));
		vector2.add(Integer.valueOf(5));
		vector2.add(Integer.valueOf(2));
		try {
			v.resta(vector0,vector1,vector2);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertEquals(esperat,resultat);
	}
	
	@Test
	public void testResta3_vectors_no_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		vector2 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(58));
		esperat.add(Integer.valueOf(6));
		esperat.add(Integer.valueOf(8));
		vector0.add(Integer.valueOf(10));
		vector0.add(Integer.valueOf(13));
		vector0.add(Integer.valueOf(20));
		vector1.add(Integer.valueOf(4));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(10));
		vector2.add(Integer.valueOf(2));
		vector2.add(Integer.valueOf(5));
		vector2.add(Integer.valueOf(2));
		try {
			v.resta(vector0,vector1,vector2);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertNotEquals(esperat,resultat);
	}
	
	@Test
	public void testResta3_vectors_excepcio() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		vector2 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(58));
		esperat.add(Integer.valueOf(6));
		esperat.add(Integer.valueOf(8));
		vector0.add(Integer.valueOf(10));
		vector0.add(Integer.valueOf(13));
		vector1.add(Integer.valueOf(4));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(10));
		vector2.add(Integer.valueOf(2));
		vector2.add(Integer.valueOf(5));
		vector2.add(Integer.valueOf(2));
		try {
			v.resta(vector0,vector1,vector2);
			fail("S'esperava la excepció DiferentLongitudException");
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testMultiplica2_vectors_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(4));
		esperat.add(Integer.valueOf(9));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(3));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(3));
		try {
			v.multiplicacio(vector0,vector1);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertEquals(esperat,resultat);
	}
	
	@Test
	public void testMultiplica2_vectors_no_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(4));
		esperat.add(Integer.valueOf(6));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(3));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(3));
		try {
			v.multiplicacio(vector0,vector1);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertNotEquals(esperat,resultat);
	}

	@Test
	public void testMultiplica2_vectors_excepcio() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(7));
		esperat.add(Integer.valueOf(6));
		vector0.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(2));
		try {
			v.multiplicacio(vector0,vector1);
			fail("S'esperava la excepció DiferentLongitudException");
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testMultiplica3_vectors_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		vector2 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(8));
		esperat.add(Integer.valueOf(27));
		esperat.add(Integer.valueOf(40));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(3));
		vector0.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(3));
		vector1.add(Integer.valueOf(4));
		vector2.add(Integer.valueOf(2));
		vector2.add(Integer.valueOf(3));
		vector2.add(Integer.valueOf(5));
		try {
			v.multiplicacio(vector0,vector1,vector2);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertEquals(esperat,resultat);
	}
	
	@Test
	public void testMultiplica3_vectors_no_funcional() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		vector2 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(8));
		esperat.add(Integer.valueOf(18));
		esperat.add(Integer.valueOf(40));
		vector0.add(Integer.valueOf(2));
		vector0.add(Integer.valueOf(3));
		vector0.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(3));
		vector1.add(Integer.valueOf(4));
		vector2.add(Integer.valueOf(2));
		vector2.add(Integer.valueOf(3));
		vector2.add(Integer.valueOf(5));
		try {
			v.multiplicacio(vector0,vector1,vector2);
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
		resultat = v.getResultat();
		assertNotEquals(esperat,resultat);
	}
	
	@Test
	public void testMultiplica3_vectors_excepcio() {
		resultat = new ArrayList<Integer>();
		esperat = new ArrayList<Integer>();
		vector0 = new ArrayList<Integer>();
		vector1 = new ArrayList<Integer>();
		vector2 = new ArrayList<Integer>();
		esperat.add(Integer.valueOf(58));
		esperat.add(Integer.valueOf(6));
		esperat.add(Integer.valueOf(8));
		vector0.add(Integer.valueOf(10));
		vector0.add(Integer.valueOf(13));
		vector1.add(Integer.valueOf(4));
		vector1.add(Integer.valueOf(2));
		vector1.add(Integer.valueOf(10));
		vector2.add(Integer.valueOf(2));
		vector2.add(Integer.valueOf(2));
		try {
			v.multiplicacio(vector0,vector1,vector2);
			fail("S'esperava la excepció DiferentLongitudException");
		}
		catch (DiferentLongitudException e) {
			System.out.println(e.getMessage());
		}
	}
}

