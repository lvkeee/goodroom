package com.frame.common.util;


import com.alibaba.fastjson.JSON;
import com.frame.common.dto.TokenDto;
import com.frame.common.exception.UserException;

/**
 * @author weining
 * @date 2019/12/25 16:58
 */
public class TokenUtil {
    //生成令牌
    public static String createToken(int uid,String phone){
        TokenDto dto = new TokenDto();
        dto.setUid(uid);
        dto.setPhone(phone);
        return JwtUtil.createJWT(JSON.toJSONString(dto));
    }

    //解析令牌
    public static TokenDto pareToken(String token) throws UserException {
        String str = JwtUtil.parseJWT(token);
        if (str!=null&&str.length()>0){
           try {
               return JSON.parseObject(str,TokenDto.class);
           }catch (Exception e){
               throw new UserException("令牌不合法");
           }
        }else {
            throw new UserException("令牌为空");
        }
    }
}
