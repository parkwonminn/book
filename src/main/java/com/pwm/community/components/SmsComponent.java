package com.pwm.community.components;

import org.apache.tomcat.util.codec.binary.Base64;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Component
public class SmsComponent {
    private static final String ACCESS_KEY = "7pRaHTr9VNiIOdBIduho";

    private static final String SECRET_KEY = "aNopL6fTFB288SAU4HLcjEfaisIZX8vMBKtItizg";

    private static final String SERVICE_ID = "ncp:sms:kr:292567153092:study";

    private static final String CALLER = "01088517089";

    public int send(String to, String content) throws NoSuchAlgorithmException, InvalidKeyException {
        //long 타입 : 정수형 에서 가장 큰 타입. 8byte
        //System.currentTimeMillis() : 현재시각을 밀리세컨드 단위로 반환한다.
        long timestamp = System.currentTimeMillis();
        //String.format : 문자 리턴되는 문자열의 형태를 지정하는 메소드.
        String signature = String.format("POST /sms/v2/services/%s/messages\n%d\n%s",
                SmsComponent.SERVICE_ID,
                timestamp,
                SmsComponent.ACCESS_KEY);
        //비밀키를 생성한다. SmsComponent.SECRET_KEY 를 getBytes(StandardCharsets.UTF_8) : Byte 단위(UTF_8)형식으로, 알고리즘 이름은 HmacSHA256 이다.
        SecretKeySpec secretKeySpec =
                new SecretKeySpec(SmsComponent.SECRET_KEY.getBytes(StandardCharsets.UTF_8), "HmacSHA256");

        /
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        byte[] rawHmac =mac.doFinal(signature.getBytes(StandardCharsets.UTF_8));
        signature = Base64.encodeBase64String(rawHmac);

        JSONObject bodyJson = new JSONObject();
        bodyJson.put("type","SMS");

    }

}
