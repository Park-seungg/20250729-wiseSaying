package com.ll.domain.wiseSaying;

import com.ll.WiseSaying;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class WiseSayingRepository {
    private  final List<WiseSaying> wiseSayingList = new ArrayList<>();
    int lastId = 0;

    public List<WiseSaying> getWiseSayingList() {
        return wiseSayingList;
    }

    public void delete(WiseSaying wiseSaying) {
        wiseSayingList.remove(wiseSaying);
    }

    void modify(WiseSaying wiseSaying, String content, String author) {
        LocalDateTime modifyTime = LocalDateTime.now();
        wiseSaying.setContent(content);
        wiseSaying.setAuthor(author);
        wiseSaying.setModifiyDate(modifyTime);
    }

    WiseSaying findById(int id) {
        return wiseSayingList.stream()
                .filter(ws -> ws.getId() == id)
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("해당 아이디는 존재하지 않습니다.");
                    return null;
                });
    }

    public WiseSaying write(String author, String content) {
        WiseSaying wiseSaying = new WiseSaying(++lastId, author, content);

        LocalDateTime now = LocalDateTime.now();
        wiseSaying.setCreateDate(now);
        wiseSaying.setModifiyDate(now);

        wiseSayingList.add(wiseSaying);

        return wiseSaying;
    }
}