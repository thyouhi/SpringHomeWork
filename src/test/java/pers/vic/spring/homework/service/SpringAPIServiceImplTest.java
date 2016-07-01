package pers.vic.spring.homework.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import pers.vic.spring.homework.BaseTest;
import pers.vic.spring.homework.vo.HandicraftVO;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * SpringAPIServiceImpl Tester.
 *
 * @author vic.zhao
 * @since 2016年6月30日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring-core-config.xml","file:src/main/webapp/WEB-INF/spring-mvc-config.xml"})
@WebAppConfiguration(value = "file:src/main/webapp")
public class SpringAPIServiceImplTest extends BaseTest {

    @Autowired
    private ISpringAPIService springAPIService;

    /**
     * 测试getJsonTemplate()
     */
    @Test
    public void testGetJsonTemplate() throws Exception {
        List<HandicraftVO> handicraftVOList = springAPIService.getJsonTemplate();
        Assert.assertNotNull(handicraftVOList);
        String jsontemplate = "[{\"id\":2,\"name\":\"An ice sculpture\",\"price\":12.50,\"tags\":[\"cold\",\"ice\"],\"dimensions\":{\"length\":7.0,\"width\":12.0,\"height\":9.5},\"warehouseLocation\":{\"latitude\":-78.75,\"longitude\":20.4}}, {\"id\":3,\"name\":\"A blue mouse\",\"price\":25.50,\"dimensions\":{\"length\":3.1,\"width\":1.0,\"height\":1.0},\"warehouseLocation\":{\"latitude\":54.4,\"longitude\":-32.7}}]";
        Assert.assertEquals(jsontemplate, handicraftVOList.toString());
    }

    /**
     * 测试getJsonStr()
     */
    @Test
    public void testGetJsonStr() throws Exception {
        try {
            Method method = springAPIService.getClass().getMethod("getJsonStr");
            method.setAccessible(true);
            String jsonStr = method.invoke(springAPIService).toString();
            String jsontemplate = "[{\"id\":2,\"name\":\"An ice sculpture\",\"price\":12.50,\"tags\":[\"cold\",\"ice\"],\"dimensions\":{\"length\":7.0,\"width\":12.0,\"height\":9.5},\"warehouseLocation\":{\"latitude\":-78.75,\"longitude\":20.4}},{\"id\":3,\"name\":\"A blue mouse\",\"price\":25.50,\"dimensions\":{\"length\":3.1,\"width\":1.0,\"height\":1.0},\"warehouseLocation\":{\"latitude\":54.4,\"longitude\":-32.7}}]";
            Assert.assertEquals(jsontemplate, jsonStr);
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        }
    }
}
