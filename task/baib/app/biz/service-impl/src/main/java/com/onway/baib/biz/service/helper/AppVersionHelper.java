/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.biz.service.helper;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;

import com.onway.baib.biz.service.query.SysConfigCacheService;
import com.onway.baib.core.enums.SysConfigCacheKeyEnum;
import com.onway.baib.core.model.SysConfigModel;
import com.onway.cif.common.service.enums.AppTypeEnum;


/**
 * 
 * 
 * @author guangdong.li
 * @version $Id: AppVersionHelper.java, v 0.1 20 Feb 2016 11:03:29 guangdong.li Exp $
 */
public class AppVersionHelper {

    @Resource
    private SysConfigCacheService sysConfigCacheService;

    public static String[]        newIOSVersion     = StringUtils.split("1.5.0", "\\.");

    public static String[]        newAndroidVersion = StringUtils.split("1.0.3.5", "\\.");

    /** �˰汾֮ǰ��֧������ͻ���,֮��֧�� */
    public static String[]        IOSVersion;

    /** �˰汾֮ǰ��֧������ͻ���,֮��֧�� */
    public static String[]        androidVersion;

    public void init(SysConfigModel config) {
        Object version = config.getConfigValue();
        if (version != null) {
            String ver = (String) version;
            String vers[] = ver.split("\\|");
            if (vers.length >= 1) {
                androidVersion = StringUtils.split(vers[0], "\\.");
            }
            if (vers.length >= 2) {
                IOSVersion = StringUtils.split(vers[1], "\\.");
            }
        }
    }

    /**
     * ����汾�Ƿ�֧�ֲ��컯����չʾ
     * 
     * @param version
     * @param platform
     * @return
     */
    public boolean isSupportDifferShowProfit(String version, String platform) {
        SysConfigModel config = sysConfigCacheService.getConfigValue(
            SysConfigCacheKeyEnum.SHOW_DIFFER_PROFIT_DATA).getResultObject();
        String[] iosdifferShowProfit = {};
        String[] androidDifferShowProfitVersion = {};
        boolean isSupport = false;
        Object differShowProfitVersion = config.getConfigValue();
        if (StringUtils.isBlank(version) || differShowProfitVersion == null) {
            return isSupport;
        }

        String ver_config = (String) differShowProfitVersion;
        String vers[] = ver_config.split("\\|");
        if (vers.length >= 1) {
            androidDifferShowProfitVersion = StringUtils.split(vers[0], "\\.");
        }
        if (vers.length >= 2) {
            iosdifferShowProfit = StringUtils.split(vers[1], "\\.");
        }
        String[] ver = StringUtils.split(version, "\\.");
        if (StringUtils.equals(platform, AppTypeEnum.ANDROID.code())
            && (compare(ver, androidDifferShowProfitVersion) >= 0)) {
            isSupport = true;
        }
        if (StringUtils.equals(platform, AppTypeEnum.IOS.code())
            && (compare(ver, iosdifferShowProfit) >= 0)) {
            isSupport = true;
        }
        return isSupport;
    }

    /**
     * ����汾�Ƿ�֧����Ʋ�Ʒ
     * 
     * @param version
     * @param fundCode
     * @return
     */
    public boolean isSupportFinancialProduct(String version, String platform) {
        SysConfigModel config = sysConfigCacheService.getConfigValue(
            SysConfigCacheKeyEnum.SHOW_NEW_PRODUCT).getResultObject();
        this.init(config);
        boolean isSupport = false;
        if (version == null) {
            return isSupport;
        }

        String[] ver = StringUtils.split(version, "\\.");
        if (StringUtils.equals(platform, AppTypeEnum.ANDROID.code())
            && (compare(ver, androidVersion) >= 0)) {
            isSupport = true;
        }
        if (StringUtils.equals(platform, AppTypeEnum.IOS.code()) && (compare(ver, IOSVersion) >= 0)) {
            isSupport = true;
        }
        return isSupport;

    }

    /**
     * ����汾�Ƿ�֧�ֱ��ղ�Ʒ
     * 
     * @param version
     * @param fundCode
     * @return
     */

    public boolean isSupportInsuranceProduct(String version, String platform) {
        //        SysConfigModel config = sysConfigCacheService.getConfigValue(
        //            SysConfigCacheKeyEnum.SHOW_INSURANCE_PRODUCT).getResultObject();
        //
        //        this.init(config);
        //        boolean isSupport = false;
        //        if (version == null) {
        //            return isSupport;
        //        }
        //        String[] ver = StringUtils.split(version, "\\.");
        //        if (StringUtils.equals(platform, AppTypeEnum.ANDROID.code())
        //            && (compare(ver, androidVersion) >= 0)) {
        //            isSupport = true;
        //        }
        //        if (StringUtils.equals(platform, AppTypeEnum.IOS.code()) && (compare(ver, IOSVersion) >= 0)) {
        //            isSupport = true;
        //        }
        return false;

    }

    /**
     * ����汾�Ƿ�֧����ӯͨ��Ʒ
     * 
     * @param version
     * @param fundCode
     * @return
     */

    public boolean isSupportRytProduct(String version, String platform) {
        SysConfigModel config = sysConfigCacheService.getConfigValue(
            SysConfigCacheKeyEnum.SHOW_RYT_PRODUCT).getResultObject();

        this.init(config);
        boolean isSupport = false;
        if (version == null) {
            return isSupport;
        }

        String[] ver = StringUtils.split(version, "\\.");
        if (StringUtils.equals(platform, AppTypeEnum.ANDROID.code())
            && (compare(ver, androidVersion) >= 0)) {
            isSupport = true;
        }
        if (StringUtils.equals(platform, AppTypeEnum.IOS.code()) && (compare(ver, IOSVersion) >= 0)) {
            isSupport = true;
        }
        return isSupport;

    }

    /**
     * ����汾�Ƿ�֧�ֲ�ƷԤ��
     * 
     * @param version
     * @param platform
     * @return
     */
    public boolean isSupportPreNotice(String version, String platform) {
        SysConfigModel config = sysConfigCacheService.getConfigValue(
            SysConfigCacheKeyEnum.SHOW_PRE_NOTICE).getResultObject();
        this.init(config);
        boolean isSupport = false;
        if (version == null) {
            return isSupport;
        }

        String[] ver = StringUtils.split(version, "\\.");
        if (StringUtils.equals(platform, AppTypeEnum.ANDROID.code())
            && (compare(ver, androidVersion) >= 0)) {
            isSupport = true;
        }
        if (StringUtils.equals(platform, AppTypeEnum.IOS.code()) && (compare(ver, IOSVersion) >= 0)) {
            isSupport = true;
        }
        return isSupport;
    }

    /**
     * �ж��Ƿ�֧����ʾbannerҳչʾ�Ƽ����
     * 
     * @param version
     * @param platform
     * @param code
     * @return
     */
    //    public boolean isSupportShowRecoLoan(String version, String platform) {
    //        Config config = configComponent.getConfig(ConfigAreaEnum.APP,
    //            ConfigNameEnum.SHOW_BANNER_RECO_LOAN.name());
    //        this.init(config);
    //        boolean isSupport = false;
    //        if (version == null) {
    //            return isSupport;
    //        }
    //
    //        String[] ver = StringUtils.split(version, "\\.");
    //        if (StringUtils.equals(platform, AppTypeEnum.ANDROID.code())
    //            && (compare(ver, androidVersion) >= 0)) {
    //            isSupport = true;
    //        }
    //        if (StringUtils.equals(platform, AppTypeEnum.IOS.code()) && (compare(ver, IOSVersion) >= 0)) {
    //            isSupport = true;
    //        }
    //        return isSupport;
    //    }

    /**
     * �ж��Ƿ�֧����ʾbannerҳչʾ�Ƽ����
     * 
     * @param version
     * @param platform
     * @param code
     * @return
     */
    //    public boolean isSupportShowRecoLoanNew(String version, String platform) {
    //        Config config = configComponent.getConfig(ConfigAreaEnum.APP,
    //            ConfigNameEnum.SHOW_BANNER_RECO_LOAN_NEW.name());
    //        this.init(config);
    //        boolean isSupport = false;
    //        if (version == null) {
    //            return isSupport;
    //        }
    //
    //        String[] ver = StringUtils.split(version, "\\.");
    //        if (StringUtils.equals(platform, AppTypeEnum.ANDROID.code())
    //            && (compare(ver, androidVersion) >= 0)) {
    //            isSupport = true;
    //        }
    //        if (StringUtils.equals(platform, AppTypeEnum.IOS.code()) && (compare(ver, IOSVersion) >= 0)) {
    //            isSupport = true;
    //        }
    //        return isSupport;
    //    }

    /**
     * �ж��Ƿ�֧�ֿ��֧��
     * 
     * @param version
     * @param platform
     * @param code
     * @return
     */
    //    public boolean isSupportQuickPay(String version, String platform) {
    //        Config config = configComponent.getConfig(ConfigAreaEnum.APP,
    //            ConfigNameEnum.SHOW_QUICK_PAY.name());
    //        this.init(config);
    //        boolean isSupport = false;
    //        if (version == null) {
    //            return isSupport;
    //        }
    //
    //        String[] ver = StringUtils.split(version, "\\.");
    //        if (StringUtils.equals(platform, AppTypeEnum.ANDROID.code())
    //            && (compare(ver, androidVersion) >= 0)) {
    //            isSupport = true;
    //        }
    //        if (StringUtils.equals(platform, AppTypeEnum.IOS.code()) && (compare(ver, IOSVersion) >= 0)) {
    //            isSupport = true;
    //        }
    //        return isSupport;
    //    }

    public String getPointPicUrl(String version, String platform, String source) {
        if (StringUtils.isEmpty(source)) {
            return "";
        }

        String[] ver = StringUtils.split(version, "\\.");
        if (StringUtils.equals(platform, AppTypeEnum.ANDROID.code())) {
            if (compare(ver, newAndroidVersion) >= 0) {
                source = source.replaceAll("#imageName#", "b");
            } else {
                source = source.replaceAll("#imageName#", "a");
            }
        }

        if (StringUtils.equals(platform, AppTypeEnum.IOS.code())) {
            if (compare(ver, newIOSVersion) >= 0) {
                source = source.replaceAll("#imageName#", "b");
            } else {
                source = source.replaceAll("#imageName#", "a");
            }
        }

        return source;
    }

    /**
     * �Ƚ�������ͬ����������Ĵ�С�� 1�����ڣ� 0�� ���ڣ� -1 ��С��
     * 
     * @param a
     * @param b
     * @return
     */
    public static int compare(String[] a, String[] b) {
        if (a == null || b == null) {
            return 0;
        }
        if (a.length != b.length) {
            return 0;
        }
        int length = a.length;

        for (int i = 0; i < length; i++) {
            int tempA = Integer.parseInt(a[i]);
            int tempB = Integer.parseInt(b[i]);
            if (tempA == tempB) {
                continue;
            }
            if (tempA > tempB) {
                return 1;
            }
            if (tempA < tempB) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        /*String version = "1.9.6";
        String platform = "IOS";
        String code = "1001";
        boolean b = false;

        String value = "2.0.2.1,1.10.1:1001|2.0.2.1,1.10.1:1002";
        if (StringUtils.isBlank(value)) {
            b = true;
        }
        String[] values = StringUtils.split(value, "|");
        long ver = NumberUtils.toLong(version.replaceAll("\\.", ""));
        for (String string : values) {
            String[] vs = StringUtils.split(string, ":");
            if (vs.length <= 1) {
                continue;
            }
            // ������ ��Ʒ��ţ��ͷ���
            String[] codes = StringUtils.split(vs[1], ",");
            if (!ArrayUtils.containsIgnoreCase(codes, code)) {
                continue;
            }
            // �������ʾ���� ��Ʒ����ˣ������и������֧�֣����ǲ�֧�� vers[0] �ǰ�׿Ҫ��İ汾��vers[1]��iOsҪ���֧�ְ汾
            String[] vers = StringUtils.split(vs[0], ",");
            // ��׿���õİ汾С�ڵ�ǰ�汾��֧��
            if (StringUtils.equals(platform, AppTypeEnum.ANDROID.code())
                && (ver >= NumberUtils.toLong(vers[0].replaceAll("\\.", "")))) {
                b = true;
            }
            // ios���õİ汾С�ڵ�ǰ�汾��֧��
            if (StringUtils.equals(platform, AppTypeEnum.IOS.code())
                && (ver >= NumberUtils.toLong(vers[1].replaceAll("\\.", "")))) {
                b = true;
            }
            // ��Ʒ��Ű����ˣ�����֧�� ������ֱ�ӷ���
            b = false;
        }
        System.out.print(b);*/

        String[] a = { "1", "12", "2", "2" };
        String[] b = { "1", "12", "1", "2" };
        System.out.print(AppVersionHelper.compare(a, b));
        String[] t = StringUtils.split("1.5.0", "\\.");
        System.out.println(t.length);
    }
}
