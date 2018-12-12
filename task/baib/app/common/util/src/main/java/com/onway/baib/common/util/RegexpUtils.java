package com.onway.baib.common.util;

import org.apache.log4j.Logger;
import org.apache.oro.text.regex.MalformedPatternException;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.PatternCompiler;
import org.apache.oro.text.regex.PatternMatcher;
import org.apache.oro.text.regex.Perl5Compiler;
import org.apache.oro.text.regex.Perl5Matcher;

public final class RegexpUtils {

    private static Logger log = Logger.getLogger(RegexpUtils.class);

    private RegexpUtils() {
    }

    /**
     * ƥ���ֻ�����
     */
    public static final String CELL_REGEXP                          = "^[1]\\d{10}$";

    /**
     * ƥ����֤��  6λ��
     */
    public static final String CHECK_CODE                           = "^\\d{6}$";

    /**
     * ƥ��ͼ��
     *
     *
     * ��ʽ: /���·��/�ļ���.��׺ (��׺Ϊgif,dmp,png)
     *
     * ƥ�� : /forum/head_icon/admini2005111_ff.gif �� admini2005111.dmp
     *
     *
     * ��ƥ��: c:/admins4512.gif
     *
     */
    public static final String ICON_REGEXP                          = "^(/{0,1}//w){1,}//.(gif|dmp|png|jpg)$|^//w{1,}//.(gif|dmp|png|jpg)$";

    /**
     * ƥ��email��ַ
     *��ƥ��: foo@bar �� $$$@bar.com
     *
     * ��ʽ: XXX@XXX.XXX.XX<script cf-hash="f9e31" type="text/javascript">
     *
     */
    public static final String EMAIL_REGEXP                         = "(?://w[-._//w]*//w@//w[-._//w]*//w//.//w{2,3}$)";

    /**
     * ƥ��ƥ�䲢��ȡurl
     *
     *
     * ��ʽ: XXXX://XXX.XXX.XXX.XX/XXX.XXX?XXX=XXX
     *
     * ƥ�� : http://www.suncer.com ��news://www
     *
     * ��ƥ��: c:/window
     *
     */
    public static final String URL_REGEXP                           = "(//w+)://([^/:]+)(://d*)?([^#//s]*)";

    /**
     * ƥ�䲢��ȡhttp
     *
     * ��ʽ: http://XXX.XXX.XXX.XX/XXX.XXX?XXX=XXX �� ftp://XXX.XXX.XXX ��
     * https://XXX
     *
     * ƥ�� : http://www.suncer.com:8080/index.html?login=true
     *
     * ��ƥ��: news://www
     *
     */
    public static final String HTTP_REGEXP                          = "(http|https|ftp)://([^/:]+)(://d*)?([^#//s]*)";

    /**
     * ƥ������
     *
     *
     * ��ʽ(��λ��Ϊ0): XXXX-XX-XX�� XXXX-X-X
     *
     *
     * ��Χ:1900--2099
     *
     *
     * ƥ�� : 2005-04-04
     *
     *
     * ��ƥ��: 01-01-01
     *
     */
    public static final String DATE_BARS_REGEXP                     = "^((((19){1}|(20){1})\\d{2})|\\d{2})-[0,1]?\\d{1}-[0-3]?\\d{1}$";

    /**
     * ƥ������
     *
     *
     * ��ʽ: XXXX/XX/XX
     *
     *
     * ��Χ:
     *
     *
     * ƥ�� : 2005/04/04
     *
     *
     * ��ƥ��: 01/01/01
     *
     */
    public static final String DATE_SLASH_REGEXP                    = "^[0-9]{4}/(((0[13578]|(10|12))/(0[1-9]|[1-2][0-9]|3[0-1]))|(02-(0[1-9]|[1-2][0-9]))|((0[469]|11)/(0[1-9]|[1-2][0-9]|30)))$";

    /**
     * ƥ��绰
     *
     *
     * ��ʽΪ: 0XXX-XXXXXX(10-13λ��λ����Ϊ0) ��0XXX XXXXXXX(10-13λ��λ����Ϊ0) ��
     *
     * (0XXX)XXXXXXXX(11-14λ��λ����Ϊ0) �� XXXXXXXX(6-8λ��λ��Ϊ0) ��
     * XXXXXXXXXXX(11λ��λ��Ϊ0)
     *
     *
     * ƥ�� : 0371-123456 �� (0371)1234567 �� (0371)12345678 �� 010-123456 ��
     * 010-12345678 �� 12345678912
     *
     *
     * ��ƥ��: 1111-134355 �� 0123456789
     *
     */
    public static final String PHONE_REGEXP                         = "^(?:0[0-9]{2,3}[-//s]{1}|//(0[0-9]{2,4}//))[0-9]{6,8}$|^[1-9]{1}[0-9]{5,7}$|^[1-9]{1}[0-9]{10}$";

    /**
     * ƥ�����֤
     *
     * ��ʽΪ: XXXXXXXXXX(10λ) �� XXXXXXXXXXXXX(13λ) �� XXXXXXXXXXXXXXX(15λ) ��
     * XXXXXXXXXXXXXXXXXX(18λ)
     *
     * ƥ�� : 0123456789123
     *
     * ��ƥ��: 0123456
     *
     */
    public static final String ID_baibD_REGEXP                       = "^//d{10}|//d{13}|//d{15}|//d{18}$";

    /**
     * ƥ���ʱ����
     *
     * ��ʽΪ: XXXXXX(6λ)
     *
     * ƥ�� : 012345
     *
     * ��ƥ��: 0123456
     *
     */
    public static final String ZIP_REGEXP                           = "^[0-9]{6}$";                                                                                                                // ƥ���ʱ����

    /**
     * �����������ַ���ƥ�� (�ַ����в��������� ��ѧ�η���^ ������' ˫����" �ֺ�; ����, ñ��: ��ѧ����- �Ҽ�����> �������< ��б��/
     * ���ո�,�Ʊ��,�س����� )
     *
     * ��ʽΪ: x �� һ��һ�ϵ��ַ�
     *
     * ƥ�� : 012345
     *
     * ��ƥ��: 0123456 // ;,:-<>//s].+$";//
     */
    public static final String NON_SPECIAL_CHAR_REGEXP              = "^[^'/";

    /**
     * ƥ��Ǹ������������� + 0)
     */
    public static final String NON_NEGATIVE_INTEGERS_REGEXP         = "^//d+$";

    /**
     * ƥ�䲻������ķǸ������������� > 0)
     */
    public static final String NON_ZERO_NEGATIVE_INTEGERS_REGEXP    = "^[1-9]+//d*$";

    /**
     *
     * ƥ��������
     *
     */
    public static final String POSITIVE_INTEGER_REGEXP              = "^[0-9]*[1-9][0-9]*$";

    /**
     *
     * ƥ����������������� + 0��
     *
     */
    public static final String NON_POSITIVE_INTEGERS_REGEXP         = "^((-//d+)|(0+))$";

    /**
     *
     * ƥ�为����
     *
     */
    public static final String NEGATIVE_INTEGERS_REGEXP             = "^-[0-9]*[1-9][0-9]*$";

    /**
     *
     * ƥ������
     *
     */
    public static final String INTEGER_REGEXP                       = "^-?//d+$";

    /**
     *
     * ƥ��Ǹ����������������� + 0��
     *
     */
    public static final String NON_NEGATIVE_RATIONAL_NUMBERS_REGEXP = "^//d+(//.//d+)?$";

    /**
     *
     * ƥ����������
     *
     */
    public static final String POSITIVE_RATIONAL_NUMBERS_REGEXP     = "^(([0-9]+//.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*//.[0-9]+)|([0-9]*[1-9][0-9]*))$";

    /**
     *
     * ƥ��������������������� + 0��
     *
     */
    public static final String NON_POSITIVE_RATIONAL_NUMBERS_REGEXP = "^((-//d+(//.//d+)?)|(0+(//.0+)?))$";

    /**
     *
     * ƥ�为������
     *
     */
    public static final String NEGATIVE_RATIONAL_NUMBERS_REGEXP     = "^(-(([0-9]+//.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*//.[0-9]+)|([0-9]*[1-9][0-9]*)))$";

    /**
     *
     * ƥ�両����
     *
     */
    public static final String RATIONAL_NUMBERS_REGEXP              = "^(-?//d+)(//.//d+)?$";

    /**
     *
     * ƥ����26��Ӣ����ĸ��ɵ��ַ���
     *
     */
    public static final String LETTER_REGEXP                        = "^[A-Za-z]+$";

    /**
     *
     * ƥ����26��Ӣ����ĸ�Ĵ�д��ɵ��ַ���
     *
     */
    public static final String UPWARD_LETTER_REGEXP                 = "^[A-Z]+$";

    /**
     *
     * ƥ����26��Ӣ����ĸ��Сд��ɵ��ַ���
     *
     */
    public static final String LOWER_LETTER_REGEXP                  = "^[a-z]+$";

    /**
     *
     * ƥ�������ֺ�26��Ӣ����ĸ��ɵ��ַ���
     *
     */
    public static final String LETTER_NUMBER_REGEXP                 = "^[A-Za-z0-9]+$";

    /**
     *
     * ƥ�������֡�26��Ӣ����ĸ�����»�����ɵ��ַ���
     *
     */
    public static final String LETTER_NUMBER_UNDERLINE_REGEXP       = "^//w+$";

    /**
     * ��Сд���е�������ʽ����
     *
     * @param source
     *            �����Դ�ַ���
     * @param regexp
     *            �����������ʽ
     * @return ���Դ�ַ�������Ҫ�󷵻���,���򷵻ؼ�
     */
    public static boolean isHardRegexpValidate(String source, String regexp) {

        try {
            // ���ڶ���������ʽ����ģ������
            PatternCompiler compiler = new Perl5Compiler();

            // ������ʽ�Ƚ��������
            PatternMatcher matcher = new Perl5Matcher();

            // ʵ����С��Сд���е�������ʽģ��
            Pattern hardPattern = compiler.compile(regexp);

            // ����������
            return matcher.contains(source, hardPattern);

        } catch (MalformedPatternException e) {
            log.warn(e);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHardRegexpValidate("15757184644", RegexpUtils.CELL_REGEXP));
    }

}