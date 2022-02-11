package com.example.demo.controller;

import com.example.demo.dto.UserDeleteDto;
import com.example.demo.dto.UserSaveDto;
import com.example.demo.dto.UserSelectDto;
import com.example.demo.dto.UserUpdateDto;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/User")
public class UserController {
    @Resource
    private UserService userservice;

    @PostMapping("/save")
    public ResponseEntity save( @RequestBody UserSaveDto userSaveDto){
        userservice.save(userSaveDto);
       return ResponseEntity.ok("添加成功");
    }

    @PostMapping("/deleteById")
    public ResponseEntity delete( @RequestBody UserDeleteDto userDeleteDto) {
        userservice.delete(userDeleteDto);
        return ResponseEntity.ok("删除成功");
    }

    @PostMapping("/update")
    public ResponseEntity update( @RequestBody UserUpdateDto userUpdateDto) {
        userservice.update(userUpdateDto);
        return ResponseEntity.ok("更新成功");
    }

    @GetMapping("/select")
    public ResponseEntity select( @RequestParam UserSelectDto userSelectDto) {
        userservice.select(userSelectDto);
        return ResponseEntity.ok("查询成功");
    }



}
