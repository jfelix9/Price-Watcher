package priceWatcher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class itemTest {

	@Test
	void testItem() {
		item itemx = new item();
		assertEquals(itemx.itemPrice, 20);
		itemx.itemPrice = 30;
		itemx.priceUpdate();
		assertEquals(30, itemx.itemPrice);
		
	}

}
