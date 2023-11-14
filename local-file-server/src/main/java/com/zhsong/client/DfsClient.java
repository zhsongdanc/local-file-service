package com.zhsong.client;

import com.zhsong.dto.DfsFile;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/*
 * @Author: demussong
 * @Description:
 * @Date: 2023/11/3 16:22
 */
public interface DfsClient {

    public void uploadPart(DfsFile file, long offset, long size, boolean append, InputStream inputStream);

    public void download(DfsFile dfsFile, long downloadOffset, OutputStream outputStream);

    public void setMeteDatas(Map<String, String> meteData, String fileUuid);

    public void setMeteData(String fileUuid, String key, String value);


}
