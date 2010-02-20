package cz.novoj.ibatis.init;

import cz.novoj.ibatis.infrastructure.AbstractBaseTest;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Simple verification that we are ablo to connect HSQL database.
 *
 * @author Jan Novotný
 * @version $Id: $
 */
public class HSqlConnectTest extends AbstractBaseTest {

	@Test
	public void testTablesExist() throws Exception {
		Assert.assertEquals(10, countRowsInTable("user"));
	}	

}
