package com.exam.onlineexamapi.domain.enums;

import java.util.HashMap;
import java.util.Map;

public enum ExamPaperTypeEnum {
    Fixed(1, "固定试卷"),
    TimeLimit(2, "时段试卷"),
    Task(3, "任务试卷");

    int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    ExamPaperTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    private static final Map<Integer, ExamPaperTypeEnum> keyMap = new HashMap<>();

    static {
        for (ExamPaperTypeEnum examPaperTypeEnum : ExamPaperTypeEnum.values()) {
            keyMap.put(examPaperTypeEnum.getCode(), examPaperTypeEnum);
        }
    }

    public static ExamPaperTypeEnum fromCode(Integer code) {
        return keyMap.get(code);
    }
}
