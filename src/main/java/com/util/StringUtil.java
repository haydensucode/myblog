package com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author haydensu
 */
public class StringUtil {

    /**
     * 将逗号分隔的字符串转换为list
     * @param strings
     * @return
     */
    public static List<String> asListByComma(String strings){
        List<String> list = new ArrayList<>();
        if (strings != null && strings.length()> 0){
            list = Arrays.asList(strings.split(","));
        }
        return  list;
    }
}
