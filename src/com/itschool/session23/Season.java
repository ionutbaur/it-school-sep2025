package com.itschool.session23;

import java.time.Month;
import java.util.Set;

public enum Season /*implements SeasonInterf*/ {

    WINTER("nice winter", Set.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY)),
    SUMMER("nice summer", Set.of(Month.JUNE, Month.JULY, Month.AUGUST)),
    SPRING("nice spring", Set.of(Month.MARCH, Month.APRIL, Month.MAY)),
    AUTUMN("nice autumn", Set.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER));

    private final String niceName;
    private final Set<Month> months;

    // enum constructors are always private
    Season(String niceName, Set<Month> months) {
        this.niceName = niceName;
        this.months = months;
    }

    public String getNiceName() {
        return niceName;
    }

    public Set<Month> getMonths() {
        return months;
    }
}
