package com.doubleganse.controller;

import com.doubleganse.demo.bean.JsonResponse;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mingjun.Chen on 2016/7/11 0011
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public JsonResponse index() {
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.put("name", "张三");
        jsonResponse.put("age", "33");
        jsonResponse.put("disc", "工人");
        return jsonResponse;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public JsonResponse test(int i){
        System.out.println("handException result: "+(10/i));
        Map<String, String> map = new HashMap<String, String>();
        map.put("id","111");
        map.put("name","柯南");
        return JsonResponse.success().add(map);
    }

}
