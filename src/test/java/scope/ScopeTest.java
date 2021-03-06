package scope;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import board.dao.BoardDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"application-context.xml"})
public class ScopeTest {
	Logger logger = LoggerFactory.getLogger(ScopeTest.class);
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void defaultScopeTest() {
		logger.debug("start defaultScopeTest");
		//given
		BoardDao boardDao1 = applicationContext.getBean("boardDao", BoardDao.class);
		BoardDao boardDao2 = applicationContext.getBean("boardDao", BoardDao.class);
		
		//when
		
		//then
		logger.debug(boardDao1.toString());
		logger.debug(boardDao2.toString());
		assertEquals(boardDao1, boardDao2);
		logger.debug("end defaultScopeTest");
	}
	
	@Test
	public void singletonScopeTest() {
		logger.debug("start singletonScopeTest");
		//given
		BoardDao boardDao1		= applicationContext.getBean("boardDaoSingleton1", BoardDao.class);
		BoardDao boardDao1_1	= applicationContext.getBean("boardDaoSingleton1", BoardDao.class);
		BoardDao boardDao2		= applicationContext.getBean("boardDaoSingleton2", BoardDao.class);
		
		//when
		
		//then
		logger.debug(boardDao1.toString());
		logger.debug(boardDao2.toString());
		assertNotEquals(boardDao1, boardDao2);
		
		assertEquals(boardDao1, boardDao1_1);
		logger.debug("end singletonScopeTest");
	}
	
	@Test
	public void prototypeScopeTest() {
		logger.debug("start prototypeScopeTest");
		//given
		BoardDao boardDaoPrototype = applicationContext.getBean("boardDaoPrototype", BoardDao.class);
		BoardDao boardDaoPrototype2 = applicationContext.getBean("boardDaoPrototype", BoardDao.class);
		
		//when
		
		//then
		logger.debug(boardDaoPrototype.toString());
		logger.debug(boardDaoPrototype2.toString());
		assertNotEquals(boardDaoPrototype, boardDaoPrototype2);
		logger.debug("end prototypeScopeTest");
	}
}