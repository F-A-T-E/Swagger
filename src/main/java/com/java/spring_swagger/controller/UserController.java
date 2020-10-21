package com.java.spring_swagger.controller;

import com.java.spring_swagger.entity.User;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Date: 2020/10/21 10:00
 * @Author: miaoxiong
 * @ModifiedBy:miaoxiong
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
@Api(tags = "用户服务的相关接口描述")
public class UserController {

    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有用户接口",
            notes="<span style='color:red;'>描述：</span>&nbsp;&nbsp;用来查询所有用户信息的接口")
    public Map<String,Object> findAll(){

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("success","查询所有成功");
        map.put("state",true);
        return map;
    }

    @PostMapping("save")
    @ApiOperation(value = "保存用户信息接口",
            notes="<span style='color:red;'>描述：</span>&nbsp;&nbsp;用来保存所有用户信息的接口")
  //  @ApiImplicitParams({
        //    @ApiImplicitParam(name = "id", value = "用户id", dataType = "String", defaultValue = "21",paramType = "path"),
          //  @ApiImplicitParam(name = "name", value = "用户姓名", dataType = "String", defaultValue = "小明",paramType = "path")
      /*      @ApiImplicitParam(name = "id", value = "用户id", dataType = "String", defaultValue = "21",paramType = "body"),
            @ApiImplicitParam(name = "name", value = "用户姓名", dataType = "String", defaultValue = "小明",paramType = "body")
*/
//    })
  //  public Map<String,Object> save(@PathVariable("id") String id, @PathVariable("name") String name){
    @ApiResponses({
            @ApiResponse(code=401,message = "当前请求未被授权"),
            @ApiResponse(code=404,message = "当前请求不存在"),
            @ApiResponse(code=200,message = "保存用户信息成功")
    })
      public Map<String,Object> save(@RequestBody User user){
        System.out.println("id:"+user.getId());
        System.out.println("name:"+user.getName());
        Map<String,Object> map = new HashMap<>();
        map.put("success","查询所有成功");
        map.put("state",true);
        return map;
    }
}
