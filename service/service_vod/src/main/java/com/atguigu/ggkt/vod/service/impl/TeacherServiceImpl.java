package com.atguigu.ggkt.vod.service.impl;

import com.atguigu.ggkt.model.vod.Teacher;
import com.atguigu.ggkt.vod.service.TeacherService;
import com.atguigu.ggkt.vod.mapper.TeacherMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【teacher(讲师)】的数据库操作Service实现
* @createDate 2022-07-04 11:15:47
*/
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher>
implements TeacherService {

}
