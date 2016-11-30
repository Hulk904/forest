package com.dempe.forest.example;

import com.dempe.forest.codec.compress.GZipCompress;
import com.dempe.forest.core.CompressType;
import com.dempe.forest.core.SerializeType;
import com.dempe.forest.core.annotation.Action;
import com.dempe.forest.core.annotation.Param;
import com.dempe.forest.core.annotation.Export;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2016/11/28
 * Time: 19:17
 * To change this template use File | Settings | File Templates.
 */
@Action("sample")
public class SampleAction {

    @Export(uri = "hello", compressType = CompressType.gizp, serializeType = SerializeType.kyro)
    public String hello(@Param String word) {
        return "hello>>>" + word;
    }

}