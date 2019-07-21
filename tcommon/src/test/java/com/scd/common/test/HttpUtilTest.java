package com.scd.common.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.scd.common.model.vo.BreakFileInfo;
import com.scd.common.model.vo.Result;
import com.scd.common.utils.HttpUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @author chengdu
 * @date 2019/7/21.
 */
public class HttpUtilTest {

    @Test
    public void testHttpGet() throws IOException {
        String url = "http://localhost:8080/file/client/check?fileId=17198cb92958dd4468523b17526eeb4b";
        String result = HttpUtil.executeGet(url);
        Assert.assertNotNull(result);
        Result<BreakFileInfo> fileInfoResult = JSON.parseObject(result, new TypeReference<Result<BreakFileInfo>>(){});
        Assert.assertTrue(fileInfoResult.getData() instanceof BreakFileInfo);
    }
}
