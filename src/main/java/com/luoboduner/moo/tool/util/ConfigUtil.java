package com.luoboduner.moo.tool.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.setting.Setting;

/**
 * <pre>
 * 配置管理
 * </pre>
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2017/6/14.
 */
public class ConfigUtil extends ConfigBaseUtil {

    private static ConfigUtil configUtil = new ConfigUtil();

    public static ConfigUtil getInstance() {
        return configUtil;
    }

    private ConfigUtil() {
        super();
    }

    private boolean autoCheckUpdate;

    private String beforeVersion;

    private String theme;

    private String font;

    private int fontSize;

    public boolean isAutoCheckUpdate() {
        return setting.getBool("autoCheckUpdate", "setting.normal", true);
    }

    public void setAutoCheckUpdate(boolean autoCheckUpdate) {
        setting.put("setting.normal", "autoCheckUpdate", String.valueOf(autoCheckUpdate));
    }

    public String getBeforeVersion() {
        return setting.getStr("beforeVersion", "setting.normal", "v_3.0.0_190516");
    }

    public void setBeforeVersion(String beforeVersion) {
        setting.put("setting.normal", "beforeVersion", beforeVersion);
    }

    public String getTheme() {
        return setting.getStr("theme", "setting.appearance", "Darcula(推荐)");
    }

    public void setTheme(String theme) {
        setting.put("setting.appearance", "theme", theme);
    }

    public String getFont() {
        return setting.getStr("font", "setting.appearance", "微软雅黑");
    }

    public void setFont(String font) {
        setting.put("setting.appearance", "font", font);
    }

    public int getFontSize() {
        return setting.getInt("fontSize", "setting.appearance", 13);
    }

    public void setFontSize(int fontSize) {
        setting.put("setting.appearance", "fontSize", String.valueOf(fontSize));
    }
}