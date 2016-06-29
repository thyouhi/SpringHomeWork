package pers.vic.spring.homework.util;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 文件处理工具类
 * @author vic.zhao
 * @since 2016年6月29日
 */
public class FileUtil {

    /**
     * 根据文件路径获取BufferedReader
     * 如果filePath为空则采用默认文件路径
     *
     * @param filePath
     * @return BufferedReader
     * @throws Exception
     */
    public static BufferedReader getBufferedReader(String filePath) throws Exception{
        BufferedReader bufferedReader = null;
        FileReader fileReader = new FileReader(filePath);
        bufferedReader = new BufferedReader(fileReader);
        return bufferedReader;
    }

    /**
     * 关闭BufferedReader
     *
     * @param bufferedReader
     * @return
     * @throws Exception
     */
    public static void closeBufferedReader(BufferedReader bufferedReader) throws Exception{
        if(null != bufferedReader){
            bufferedReader.close();
        }
    }
}
