package com.kart.customer.subscriptions.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public enum SubscriptionTypeEnum {

    DAILY("Daily", "Daily"),
    ONCE_IN_TWO_DAYS("OnceInTwoDays","Alternate day"),
    ONCE_IN_THREE_DAYS ("OnceInThreeDays","Once in three days"),
    ONCE_IN_FOUR_DAYS("OnceInFourDays","Once in four days"),
    ONCE_IN_FIVE_DAYS("OnceInFiveDays","Once in five days"),
    ONCE_IN_SIX_DAYS("OnceInSixDays","Once in six days"),
    ONCE_IN_A_WEEK("OnceInWeek","Once in a week")
    ;

    private SubscriptionTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    private String desc;
    private String code;

    private static Map<String, SubscriptionTypeEnum> lookupByCode;
    static {
        lookupByCode = new HashMap<>();
        for(SubscriptionTypeEnum subscriptionTypeEnum: values()) {
            lookupByCode.put(subscriptionTypeEnum.code, subscriptionTypeEnum);
        }
    }

    public static SubscriptionTypeEnum forCode(String code) {
        if(code == null) return  null;
        return lookupByCode.get(code);
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "SubscriptionTypeEnum{" +
                "desc='" + desc + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

}
