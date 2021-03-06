package com.service;

import com.pojo.BlogSetting;

import java.util.List;

/**
 * @author haydensu
 */
public interface BlogSettingService {
    /**
     * 获得所有博客设置
     * @return
     */
    List<BlogSetting> getAllBlogSettings();
}
