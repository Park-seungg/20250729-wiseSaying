package com.ll;

import com.ll.domain.system.SystemController;
import com.ll.domain.wiseSaying.WiseSayingController;
import com.ll.domain.wiseSaying.WiseSayingRepository;
import com.ll.domain.wiseSaying.WiseSayingService;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppContext {
    public static final Scanner scanner = new Scanner(System.in);
    public static final DateTimeFormatter forPrintDateTimeFormatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
    public static final WiseSayingRepository wiseSayingRepository = new WiseSayingRepository();
    public static final WiseSayingService wiseSayingService = new WiseSayingService();
    public static final WiseSayingController wiseSayingController = new WiseSayingController();
    public static final SystemController systemController = new SystemController();
}


