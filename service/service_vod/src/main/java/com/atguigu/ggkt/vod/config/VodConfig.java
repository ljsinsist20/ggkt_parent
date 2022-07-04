package com.atguigu.ggkt.vod.config;

/**
 * @author: ljs
 * @Pcakage: com.atguigu.ggkt.vod.config.VodConfig
 * @Date: 2022年07月04日 11:28
 * @Description:
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */
@Configuration
@MapperScan("com.atguigu.ggkt.vod.mapper")
public class VodConfig {
}
