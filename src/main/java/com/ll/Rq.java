package com.ll;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Rq {
    private final String actionName;
    // final -> 최초 선언 후 재할당 불가
    private final Map<String, String> paramsMap;
    //목록
    // ?
    // searchKeywordType=content
    // &
    // searchKeyword=자바

    public Rq(String cmd) {
        // paramsMap = new HashMap<>();

        String[] cmdBits = cmd.split("\\?", 2);
        actionName = cmdBits[0];
        String queryString = cmdBits.length > 1 ? cmdBits[1].trim() : "";

//        String[] queryStringBits = queryString.split("&");
//
//        for (String queryParam : queryStringBits) {
//            String[] queryParamBits = queryParam.split("=", 2);
//            String key = queryParamBits[0].trim();
//            String value = queryParamBits.length > 1 ? queryParamBits[1].trim() : "";
//
//            if (value.isEmpty()) {
//                continue;
//            }
//
//            paramsMap.put(key, value);
//        }
        paramsMap = Arrays.stream(queryString.split("&"))
                .map(part -> part.split("=", 2))
                .filter(bits -> bits.length > 0 && !bits[0].trim().isEmpty() && !bits[1].trim().isEmpty())
                .collect(Collectors.toMap(
                        bits -> bits[0].trim(),
                        bits -> bits[1].trim()
                ));
    }

    public String getActionName() {
        return actionName;
    }

    public String getParam(String paramName, String defaultValue) {
        if (paramsMap.containsKey(paramName)) {
            return paramsMap.get(paramName);
        } else {
            return defaultValue;
        }
    }

    public int getParamAsInt(String paramName, int defaultValue) {
        String value = getParam(paramName, "");

        if (value.isEmpty()) {
            return defaultValue;
        }

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}