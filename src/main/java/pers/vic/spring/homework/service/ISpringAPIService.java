package pers.vic.spring.homework.service;

import pers.vic.spring.homework.vo.HandicraftVO;

import java.util.List;

/**
 * ISpringAPIService
 * @author vic.zhao
 * @since 2016年6月29日
 */
public interface ISpringAPIService {

    /**
     * 获取文件中的json数据
     * @return
     * @throws Exception
     */
    public List<HandicraftVO> getJsonTemplate() throws Exception;
}

