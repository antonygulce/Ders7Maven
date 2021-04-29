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
	
	@Test
	public final void testBuyukHarfCevirNullKontrolu() {
		
		String ornek = "null";
		
		String sonuc = MetinIslemleri.buyukHarfCevir(ornek);
		
		assertEquals("null", sonuc);
		
	}
	
	@Test
	public final void testBuyukHarfCevirBosString() {
		
		String ornek = "";
		
		String sonuc = MetinIslemleri.buyukHarfCevir(ornek);
		
		assertEquals("", sonuc);
		
	}

}
