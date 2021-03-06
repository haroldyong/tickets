package com.track.common.constant;

/**
 * 通用常量
 * @Author cheng
 * @create 2019-10-29 10:46
 *
 */
public class Constants {

        /**
         * UTF-8 字符集
         */
        public static final String UTF8 = "UTF-8";

        /**
         * 通用成功标识
         */
        public static final String SUCCESS = "0";

        /**
         * 通用失败标识
         */
        public static final String FAIL = "1";

        /**
         * 登录成功
         */
        public static final String LOGIN_SUCCESS = "Success";

        /**
         * 注销
         */
        public static final String LOGOUT = "Logout";

        /**
         * 登录失败
         */
        public static final String LOGIN_FAIL = "Error";

        /**
         * 自动去除表前缀
         */
        public static String AUTO_REOMVE_PRE = "true";

        /**
         * 当前记录起始索引
         */
        public static String PAGE_NUM = "pageNum";

        /**
         * 每页显示记录数
         */
        public static String PAGE_SIZE = "pageSize";

        /**
         * 排序列
         */
        public static String ORDER_BY_COLUMN = "orderByColumn";

        /**
         * 排序的方向 "desc" 或者 "asc".
         */
        public static String IS_ASC = "isAsc";

        /**
         * 环信注册IM账号密码
         */
        public static String PASSWORD = "123456";

        /**
         * logback追踪Id
         */
        public static String UNIQUE_ID = "traceId";

        /**
         * logback追踪用户Id
         */
        public static String USER_ID = "userId";

        /**
         * logback追踪用户
         */
        public static String USER_NAME = "userName";

        /**
         * 令牌桶限流key
         */
        public static String BUCKET = "BUCKET:";

        /**
         * 令牌桶限流数量
         */
        public static String BUCKET_COUNT = "BUCKET_COUNT:";

        /**
         * 令牌桶限流流成员key
         */
        public static String BUCKET_MONITOR = "BUCKET_MONITOR:";

        /**
         * 全局限流标识
         */
        public static String LIMIT_ALL = "TICKETS_LIMIT_ALL";

}
