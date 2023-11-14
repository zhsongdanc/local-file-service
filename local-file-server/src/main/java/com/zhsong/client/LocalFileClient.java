package com.zhsong.client;

import com.zhsong.dto.DfsFile;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/*
 * @Author: demussong
 * @Description:
 * @Date: 2023/11/3 16:43
 */
public class LocalFileClient implements DfsClient{

    @Override
    public void uploadPart(DfsFile file, long offset, long size, boolean append, InputStream inputStream) {

    }

    @Override
    public void download(DfsFile dfsFile, long downloadOffset, OutputStream outputStream) {

    }

    @Override
    public void setMeteDatas(Map<String, String> meteData, String fileUuid) {

    }

    @Override
    public void setMeteData(String fileUuid, String key, String value) {

    }
}
