package com.frame.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @author weining
 * @date 2019/12/10 16:46
 */
@Data
public class PageBean<T> {
    private int code;
    private String msg;
    private long count;
    private List<T> data;

    public PageBean(){

    }
    public PageBean(long c,List<T> list){
        code=0;
        msg="OK";
        count=c;
        data=list;
    }
}
