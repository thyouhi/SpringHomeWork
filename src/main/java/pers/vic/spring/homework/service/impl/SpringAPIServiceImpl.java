package pers.vic.spring.homework.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import pers.vic.spring.homework.service.ISpringAPIService;
import pers.vic.spring.homework.util.PropertyPlaceholder;
import pers.vic.spring.homework.vo.HandicraftVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
        //从文件中读取json样本
        String jsonTemplate = getJsonStr();

        //将json字符串格式化
        List<HandicraftVO> handicraftVOList = JSON.parseObject(jsonTemplate, new TypeReference<ArrayList<HandicraftVO>>(){});

        return handicraftVOList;
    }

    private String getJsonStr()throws Exception{
        StringBuilder jsonTemplate = new StringBuilder();
        //从config.properties中读取json样本数据的存放路径
        String filePath = PropertyPlaceholder.getContextProperty("json_template_file");

        //获取Resource
        Resource resource = new DefaultResourceLoader().getResource(filePath);

        //读取文件中存放的json样本字符串
        if (resource != null && resource.exists()) {
            if (resource.isReadable()) {
                InputStream is = null;
                BufferedReader br = null;
                try {
                    //获取InputStream
                    is = resource.getInputStream();
                    //拼接InputStream和BufferedReader
                    br = new BufferedReader(new InputStreamReader(is));
                    String line;
                    //此处由于题目要求，只读一行
                    if ((line=br.readLine()) != null) {
                        jsonTemplate.append(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    //关闭InputStream
                    if (is != null) {
                        is.close();
                    }
                    //关闭BufferedReader
                    if (br != null) {
                        br.close();
                    }
                }
            }
        }
        return jsonTemplate.toString();
    }
}
