package pers.vic.spring.homework.controller;

import org.junit.Test;
import pers.vic.spring.homework.BaseTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * SpringAPIController Tester.
 *
 * @author vic.zhao
 * @since 2016年6月30日
 */
public class SpringAPIControllerTest extends BaseTest {
    /**
     * 测试getJsonTemplate()
     */
    @Test
    public void testGetJsonTemplate() throws Exception {
        mockMvc.perform(get("/manage/jsonTemplate/get"))
                .andExpect(status().isOk())//请求状态验证，200为成功
                .andExpect(content().json("[{\"id\":2,\"name\":\"An ice sculpture\",\"price\":12.50,\"tags\":[\"cold\",\"ice\"],\"dimensions\":{\"length\":7.0,\"width\":12.0,\"height\":9.5},\"warehouseLocation\":{\"latitude\":-78.75,\"longitude\":20.4}},{\"id\":3,\"name\":\"A blue mouse\",\"price\":25.50,\"dimensions\":{\"length\":3.1,\"width\":1.0,\"height\":1.0},\"warehouseLocation\":{\"latitude\":54.4,\"longitude\":-32.7}}]"));//请求结果验证
    }
}
