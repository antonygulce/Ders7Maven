package tr.edu.medipol.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public final void testBuyukHarfCevir() {
		
		String ornek = "Merhaba Arkadaslar";
		
		String sonuc = MetinIslemleri.buyukHarfCevir(ornek);
		
		assertEquals("MERHABA ARKADASLAR", sonuc);
		
	}

}
