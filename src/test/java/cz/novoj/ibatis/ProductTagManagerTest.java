package cz.novoj.ibatis;

import cz.novoj.ibatis.model.product.Tag;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Description
 *
 * @author Jan Novotný, FG Forrest a.s. (c) 2007
 * @version $Id: $
 */
public class ProductTagManagerTest extends AbstractBaseTest {
	@Autowired
	private ProductTagMapper productTagMapper;

	@Test
	public void testCountProductTags() throws Exception {
		assertEquals(11, productTagMapper.countTags());
	}

	@Test
	public void testGetProductById() throws Exception {
		Tag tag = productTagMapper.getTagById(1);
		assertNotNull(tag);
		assertEquals(1, (int)tag.getId());
		assertEquals("Samsung", tag.getName());		
	}

	@Test
	public void testCreateTag() throws Exception {
		Tag tag = new Tag("můjNovýTag");
		productTagMapper.createProductTag(tag);
		assertNotNull(tag.getId());

		Tag loadedTag = productTagMapper.getTagById(tag.getId());
		assertEquals(tag, loadedTag);
	}
}