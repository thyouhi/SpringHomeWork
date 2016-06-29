package pers.vic.spring.homework.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.vic.spring.homework.service.ISpringAPIService;
import pers.vic.spring.homework.vo.HandicraftVO;

import java.util.ArrayList;
import java.util.List;

/**
 * SpringAPIController
 * @author vic.zhao
 * @since 2016年6月29日
 */
@Controller
@RequestMapping("managemanet")
public class SpringAPIController {

    private final Logger logger = LoggerFactory.getLogger(SpringAPIController.class);

    @Autowired
    private ISpringAPIService springAPIService;

    /**
     * 读取文件中的json数据返回
     * @return
     */
    @RequestMapping(value = "jsonTemplate/get", method = RequestMethod.GET)
    @ResponseBody
    public List<HandicraftVO> getJsonTemplate(){
        List<HandicraftVO> result = new ArrayList<>();
        try{
            HandicraftVO handicraftVO = new HandicraftVO();
            handicraftVO.setId(1);
            result.add(handicraftVO);
            result = springAPIService.getJsonTemplate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
