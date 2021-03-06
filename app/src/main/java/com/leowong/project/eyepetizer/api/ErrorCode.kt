package com.leowong.project.eyepetizer.api

/**
 * Created by xuhao on 2017/12/5.
 * desc:
 */
object ErrorCode {


    /**
     * 未知错误
     */
    val UNKNOWN_ERROR = 1002

    /**
     * 服务器内部错误
     */
    val SERVER_ERROR = 1003

    /**
     * 网络连接超时
     */
    val NETWORK_ERROR = 1004

    /**
     * API解析异常（或者第三方数据结构更改）等其他异常
     */
    val API_ERROR = 1005

}