package com.ll;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();

        testRq1();
    }

    private static void testRq1() {
        Rq rq = new Rq("목록?searchKeywordType=content&searchKeyword=자바&page=2&id=9");

        int page = rq.getParamAsInt("page", -1);
        int sort = rq.getParamAsInt("sort", -1);
        int id = rq.getParamAsInt("id", -1);

        System.out.println("actionName : " + rq.getActionName());
        System.out.println("params searchKeywordType : " + rq.getParam("searchKeywordType", ""));
        System.out.println("params searchKeyword : " + rq.getParam("searchKeyword", ""));
        System.out.println("params searchKeyword : " + rq.getParam("searchKeyword", ""));
        System.out.println("params page : " + page);
        System.out.println("params sort : " + sort);
        System.out.println("params sort : " + id);


    }
}