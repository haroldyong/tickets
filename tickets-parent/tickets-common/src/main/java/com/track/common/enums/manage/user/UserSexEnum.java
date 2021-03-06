package com.track.common.enums.manage.user;

import com.track.common.enums.BaseEnum;
import lombok.Getter;

import java.util.Objects;

/**
 * @Author cheng
 * @create 2019-09-02 10:28
 *
 * 用户性别 0：未知、1：男、2：女
 *
 */
@Getter
public enum UserSexEnum implements BaseEnum {

    Unknown(0,"未知"),
    BOY(1,"男"),
    GIRL(2,"女");

    private Integer id;

    private String name;

    UserSexEnum(Integer id , String name){
        this.id = id;
        this.name = name;
    }

    //重写toString方法，返回值为显示的值
    @Override
    public String toString(){
        return this.getName();
    }

    //通过ID获取结果
    public static UserSexEnum fromId(Integer id){
        for (UserSexEnum type : UserSexEnum.values()){
            if (type.getId().equals(id))
                return type;
        }
        return null;
    }

    //通过名称来获取结果
    public static UserSexEnum fromName(String name){
        for (UserSexEnum type : UserSexEnum.values()){
            if (type.getName().equals(name)){
                return type;
            }
        }
        return null;
    }

    //通过enumName获取结果
    public static UserSexEnum fromEnumName(String name){
        for (UserSexEnum type : UserSexEnum.values()){
            if (type.name().equals(name))
                return type;
        }
        return null;
    }

    @Override
    public boolean isExist(Object field) {
        //通过ID判断
        return Objects.nonNull(fromId(Integer.parseInt(field.toString())));

        //通过enumName判断
//        return Objects.nonNull(fromEnumName(field.toString()));
    }
}
