package com.fanjiao.common.core.exception.file;

import com.fanjiao.common.core.exception.BaseException;

/**
 * 文件信息异常类
 * 
 * @author bubble
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
