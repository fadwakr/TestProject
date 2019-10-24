package maven_project;

import static org.junit.Assert.*;

import org.junit.Test;

import maven_project.entities.Product;

public class Test_product {

	@Test
	public void test() {
		Product p1 = new Product("Apple", 2) ;
	    int n1 = p1.Affichage_product(p1.getQuant_product(), p1.getName_product());
	    System.out.println("Apple :  " + n1 );
	     assertEquals(4, n1);
	    
	    Product p2 = new Product("Orange", 3) ;
	    int n2 = p2.Affichage_product(p2.getQuant_product(), p2.getName_product());
	    System.out.println("Orange :  " + n2);
	     assertEquals(3, n2);

	    
	    Product p3 = new Product("Watermelon", 2) ;
	    int n3 = p3.Affichage_product(p3.getQuant_product(), p3.getName_product());
	    System.out.println("Watermelon :  " + n3 );
	     assertEquals(5, n3);

	}

}
