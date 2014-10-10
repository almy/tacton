package unitTests;

import com.myftiu.data.structure.Organisation;
import com.myftiu.service.WebCartService;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

/**
 * @author by ali myftiu on 10/10/14.
 */
public class OragnisationTest {

	private static final WebCartService WEB_CART_SERVICE = new WebCartService();
	private static final Organisation ORGANISATION = WEB_CART_SERVICE.getOrganisationRoot();
	private static final Organisation node4 = new Organisation("Sub Org 4");


	Comparable<String> searchCriteria = new Comparable<String>() {
		@Override
		public int compareTo(String treeData) {
			if (treeData == null)
				return 1;
			boolean nodeOk = treeData.contains("Sub Org 4");
			return nodeOk ? 0 : 1;
		}
	};

	@Test
	public void testOrganisation() {

		assertEquals(ORGANISATION.findTreeNode(searchCriteria).toString(), node4.toString());
	}


}
