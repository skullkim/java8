package me.skullkim.optional;

import org.w3c.dom.ls.LSProgressEvent;

import java.util.Optional;

/**
 * <h1>온라인 수업에 대한 정보</h1>
 * stream api 실습을 위한 클래스
 *
 * @author yunki kim
 * @version 1.0
 * @since 2021-11-21
 */

public class OnlineClass {

    /** 수업 고유 번호 */
    private Integer classId;

    /** 수업 제목 */
    private String title;

    /** 수업 종료 여부 */
    private boolean closed;

    /** 수업을 수강한 기간 */
    private Progress progress;

    /**
     * OnelineClass 생성자
     * @param classId 수업 고유 번호
     * @param title 수업 제목
     * @param closed 수업 종료 여부
     */
    public OnlineClass(Integer classId, String title, boolean closed) {
        this.classId = classId;
        this.title = title;
        this.closed = closed;
    }

    /**
     * 수업 고유 번호를 반환
     * @return Integer 수업 고유 번호
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * 수업 제목을 반환
     * @return String 수업 제목 반환
     */
    public String getTitle() {
        return title;
    }

    /**
     * 수업 종료 여부 반환
     * @return boolean 수업 종료 여부
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * 수업을 수강한 기간을 반환
     * @reutrn Progress 수업을 들은 기간 정보
     */
    public Optional<Progress> getProgress() {
        return Optional.ofNullable(progress);
    }

}