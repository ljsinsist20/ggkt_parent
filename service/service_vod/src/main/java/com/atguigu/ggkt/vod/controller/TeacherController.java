package com.atguigu.ggkt.vod.controller;

/**
 * @author: ljs
 * @Pcakage: com.atguigu.ggkt.vod.controller.TeacherController
 * @Date: 2022年07月04日 11:26
 * @Description:
 */

import com.atguigu.ggkt.model.vod.Teacher;
import com.atguigu.ggkt.vod.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 讲师 前端控制器
 * @author atguigu
 */
@RestController
@RequestMapping(value="/admin/vod/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //查询所有讲师列表
    @GetMapping("findAll")
    public List<Teacher> findAll(){
        List<Teacher> list = teacherService.list();
        return list;
    }
}
