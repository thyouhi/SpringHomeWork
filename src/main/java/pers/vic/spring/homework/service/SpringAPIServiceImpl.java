package pers.vic.spring.homework.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import org.springframework.stereotype.Service;
import pers.vic.spring.homework.util.FileUtil;
import pers.vic.spring.homework.util.PropertyPlaceholder;
import pers.vic.spring.homework.vo.HandicraftVO;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * SpringAPIService实现类
 * @author vic.zhao
 * @since 2016年6月29日
 */
@Service
public class SpringAPIServiceImpl implements ISpringAPIService {

    @Override
    public List<HandicraftVO> getJsonTemplate() throws Exception {
        StringBuilder file = new StringBuilder();
        String templateFilePath = PropertyPlaceholder.getContextProperty("json_template_file");
        String realFilePath = getFileName(templateFilePath);
        BufferedReader bufferedReader = FileUtil.getBufferedReader(realFilePath);
        String jsonStr = bufferedReader.readLine();
        // 转换成对象数组
        List<HandicraftVO> usa2 = JSON.parseObject(jsonStr, new TypeReference<ArrayList<HandicraftVO>>(){});
        return usa2;
    }

    private String getFileName(String filepath) {
        String classpth = this.getClass().getResource("/").getPath();
        String realFilePath = classpth + filepath;
        return realFilePath;
    }
}
