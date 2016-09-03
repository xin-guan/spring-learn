package com.doubleganse.controller;

import com.doubleganse.demo.bean.JsonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mingjun.Chen on 2016/7/11 0011
 */
@RestController
public class HomeController {

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public JsonResponse index() {
        JsonResponse jsonResponse = new JsonResponse();
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "张三");
        map.put("age", "33");
        map.put("disc", "工人");
        jsonResponse.add(map);
        return jsonResponse.add(map);
    }

    @ResponseBody
    @RequestMapping("/test")
    public Map<String, String> test(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("id","111");
        map.put("name","kady");
        return map;
    }

}
