package fr.epsi.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class PersonneTest {

	@Test
	public void test() {
		Personne p1 = new Personne("Adrie", "Excoffier");
		
		Assert.assertEquals("Adrien", p1.getPrenom());
		Assert.assertEquals("Excoffier", p1.getNom());
		Assert.assertEquals("Adrien Excoffier", p1.getNomPrenom());
		Assert.assertNotNull(p1.getV_env());
		
	}

}
