package com.wang;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description 日期工具类-所有时间戳都是毫秒级
 * @Author wang
 * @Date 2021/9/1
 * @Version 1.0.0
 */
public class DateUtils {
    /**
     * 日期格式yyyy-MM-dd
     */
    public static String DATE_PATTERN = "yyyy-MM-dd";

    /**
     * 日期时间格式yyyy-MM-dd HH:mm:ss
     */
    public static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期格式yyyy_MM
     */
    public static String MOUTH_PATTERN = "yyyy_MM";

    /**
     * 日期格式yyyy_MM_dd
     */
    public static String DATE_PATTERN_UNDER = "yyyy_MM_dd";

    /**
     * 字符串数字判断正则表达式
     */
    private static final Pattern pattern = Pattern.compile("-?[0-9]+(\\\\.[0-9]+)?");

    /**
     * 构造函数
     */
    private DateUtils() {
        super();
    }

    /**
     * 正则判断字符串是否是数字
     * @param str
     * @return
     */
    private static boolean isNumber(String str) {
        // 通过Matcher进行字符串匹配
        Matcher m = pattern.matcher(str);
        // 如果正则匹配通过 m.matches() 方法返回 true ，反之 false
        return m.matches();
    }


    /**
     * 秒级-毫秒级转换
     * @param second 毫秒级 字符串格式的时间戳
     * @return
     */
    public static Long covertMillisecond(String second){
        if (Objects.isNull(second)) {
            return 0L;
        }
        //秒-->豪秒
        return Long.parseLong(second) * 1000;
    }

    /**
     * 时间戳转换为LocalDatetime 时区-中国上海-8
     * @param timestamp 时间戳字符串-毫秒级
     * @return LocalDateTime
     */
    public static LocalDateTime timestampToDatetime(String timestamp){
        if (isNumber(timestamp)) {
            long value = Long.parseLong(timestamp);
            Instant instant = Instant.ofEpochMilli(value);
            ZoneId zone = ZoneId.systemDefault();
            return LocalDateTime.ofInstant(instant, zone);
        }
        return null;
    }

    /**
     * LocalDateTime转为字符串时间戳
     * @param localDateTime 时间
     * @return 时间戳字符串-毫秒级
     */
    public static String datetimeToTimestamp(LocalDateTime localDateTime){
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        long epochMilli = instant.toEpochMilli();
        return String.valueOf(epochMilli);
    }

    /**
     * 获取某一天的0点LocalDatetime
     * @return
     */
    public static LocalDateTime getStartDayTime(LocalDateTime localDateTime){
        if (Objects.isNull(localDateTime)) {
            return null;
        }
       return LocalDateTime.of(localDateTime.toLocalDate(),LocalTime.MIN);
    }

    /**
     * 获取某一天的24点LocalDatetime
     * @return
     */
    public static LocalDateTime getEndDayTime(LocalDateTime localDateTime){
        if (Objects.isNull(localDateTime)) {
            return null;
        }
        return LocalDateTime.of(localDateTime.toLocalDate(),LocalTime.MAX);
    }

    /**
     * 获取某一月的第一天0点LocalDatetime
     * @return LocalDateTime
     */
    public static LocalDateTime getStartMonthTime(LocalDateTime localDateTime){
        if (Objects.isNull(localDateTime)) {
            return null;
        }
        return LocalDateTime.of(LocalDate.from(localDateTime.with(TemporalAdjusters.firstDayOfMonth())), LocalTime.MIN);
    }
    /**
     * 获取某一月的最后一天24点LocalDatetime
     * @return LocalDateTime
     */
    public static LocalDateTime getEndMonthTime(LocalDateTime localDateTime){
        if (Objects.isNull(localDateTime)) {
            return null;
        }
        return LocalDateTime.of(LocalDate.from(localDateTime.with(TemporalAdjusters.lastDayOfMonth())), LocalTime.MAX);
    }


    /**
     * 格式化时间-默认yyyy-MM-dd HH:mm:ss格式
     *
     * @param dateTime
     *            LocalDateTime对象
     * @return
     */
    public static String formatDateTime(LocalDateTime dateTime) {
        return formatDateTime(dateTime, DATE_TIME_PATTERN);
    }

    /**
     * 按pattern格式化时间-默认yyyy-MM-dd HH:mm:ss格式
     *
     * @param dateTime
     *            LocalDateTime对象
     * @param pattern
     *            要格式化的字符串
     * @return
     */
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        if (dateTime == null) {
            return null;
        }
        if (pattern == null || pattern.isEmpty()) {
            pattern = DATE_TIME_PATTERN;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }


    /**
     * Date转LocalDateTime
     *
     * @param date
     *            Date对象
     * @return
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    /**
     * LocalDateTime转换为Date
     *
     * @param dateTime
     *            LocalDateTime对象
     * @return
     */
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}
