package com.track.common.utils.wetch.pay;

import com.github.wxpay.sdk.WXPayConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author yeJH
 * @since 2019/7/5 16:26
 */
@Slf4j
@Component
public class WXConfigUtil implements WXPayConfig {
    private byte[] certData;

    @Value("${wetch.applet.APP_ID}")
    public String APP_ID;

    @Value("${wetch.applet.KEY}")
    public String KEY;

    @Value("${wetch.applet.MCH_ID}")
    public String MCH_ID;

    public WXConfigUtil() throws Exception {
        //判断项目服务环境
        /*boolean isWindows = System.getProperty("os.name").toLowerCase().contains("win");
        String certPath;
        if(isWindows) {
            //Windows环境
            certPath = "E:" + File.separator + "cert" + File.separator + "BoHUI20190802_apiclient_cert.p12";
        } else {
            certPath = File.separator + "congya" + File.separator + "cert" + File.separator + "BoHUI20190802_apiclient_cert.p12";
        }
        File file = new File(certPath);
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();*/
    }

    @Override
    public String getAppID() {
        return APP_ID;
    }

    @Override
    public String getMchID() {
        return MCH_ID;
    }

    @Override
    public String getKey() {
        return KEY;
    }

    @Override
    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    @Override
    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    @Override
    public int getHttpReadTimeoutMs() {
        return 10000;
    }
}


