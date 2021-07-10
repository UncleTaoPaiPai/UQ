package com.zyz.lmpl;

import com.zyz.proxy.ZuFang;

public class zhongjie implements ZuFang {

    Fangdong fangdong = new Fangdong();

    public void zufang() throws Exception {
        System.out.println("收取房东中介费");
        fangdong.zufang();
        System.out.println("收取我们的中介费");
    }
}
