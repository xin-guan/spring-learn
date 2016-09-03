package com.doubleganse.demo.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Mingjun.Chen on 2016/7/11 0011
 */
public class JsonResponse implements Serializable {

    // 由于返回给前端的data字段不能为null,默认给个空对象
    private static final Object EMPTY = new Object();

    private Integer code = 0; // 0:成功 1:失败
    private String msg = ""; // 提示
    private Object data = EMPTY; // 返回的数据


    public static JsonResponse success() {
        return new JsonResponse(StateCode.SUCCESS);
    }

    public static JsonResponse success(String msg) {
        return success().setMsg(msg);
    }

    public static JsonResponse success(Integer code, String msg) {
        return success(msg).setCode(code);
    }

    public static JsonResponse failed() {
        return new JsonResponse(StateCode.FAILED);
    }

    public static JsonResponse failed(String msg) {
        return failed().setMsg(msg);
    }

    public static JsonResponse failed(Integer code, String msg) {
        return failed(msg).setCode(code);
    }

    private Map<String, Object> getDataAsMap() {
        if (EMPTY == data) {
            data = new HashMap<String, Object>();
            return (Map<String, Object>) data;
        }
        if (data instanceof Map) {
            return (Map<String, Object>) data;
        }
        throw new IllegalStateException("数据类型不兼容，不能将" + data.getClass().getSimpleName() + "类型转成Map类型");
    }

    private List<Object> getDataAsList() {
        if (EMPTY == data) {
            data = new ArrayList<Object>();
            return (List<Object>) data;
        } else if (data instanceof List) {
            return (List<Object>) data;
        }
        throw new IllegalStateException("数据类型不兼容，不能将" + data.getClass().getSimpleName() + "类型转换为");
    }

    public JsonResponse put(String key, Object value) {
        this.getDataAsMap().put(key, value);
        return this;
    }

    public JsonResponse putAll(Map<String, Object> map) {
        this.getDataAsMap().putAll(map);
        return this;
    }

    public JsonResponse add(Object bean) {
        if (null == bean) {
            return this;
        }
        if (bean instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) bean;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                this.put(entry.getKey().toString(), entry.getValue());
            }
        } else if (bean instanceof Collection) {
            Collection<?> collection = (Collection<?>) bean;
            this.getDataAsList().addAll(collection);
        } else if (bean.getClass().isArray()) {
            List<Object> list = this.getDataAsList();
            Integer len = Array.getLength(bean);
            for (int i = 0; i < len; i++) {
                list.add(Array.get(bean, i));
            }
        } else if (bean instanceof Number || bean instanceof String || bean instanceof Boolean) {
            if (EMPTY == data) {
                data = bean;
            } else {
                throw new IllegalStateException("不能将" + bean.getClass().getSimpleName() + "类型追加到" + data.getClass().getSimpleName() + "类型");
            }
        } else {// 为了利用JSON注解，采用JSON接口来处理
            JSONObject o = (JSONObject) JSON.toJSON(bean);
            getDataAsMap().putAll(o);
        }
        return this;
    }

    public JsonResponse() {
    }

    public JsonResponse(StateCode stateCode) {
        this.code = stateCode.getCode();
        this.msg = stateCode.msg;
    }

    private enum StateCode {
        SUCCESS(0, "操作成功"), FAILED(1, "操作失败");
        private int code;
        private String msg;

        StateCode(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }

    public static Object getEMPTY() {
        return EMPTY;
    }

    public Integer getCode() {
        return code;
    }

    public JsonResponse setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public JsonResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

}
