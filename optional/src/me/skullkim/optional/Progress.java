package me.skullkim.optional;

import java.time.Duration;

/**
 * <h1>과목을 수료한 기간, 수료완료 여부 저장</h1>
 *
 * @author yunkiKim
 * @version 1.0
 * @since 2021-11-22
 */

public class Progress {

    /**수강 기간*/
    private Duration studyDuration;

    /**수강 완료 여부*/
    private boolean finished;

    /**
     * 수강 기간을 가져온다
     * @return Duration 수강 기간
     */
    public Duration getStudyDuration() {
        return studyDuration;
    }

    /**
     * 수강 기간을 set한다
     * @param studyDuration 수강 기간
     */
    public void setStudyDuration(Duration studyDuration) {
        this.studyDuration = studyDuration;
    }
}
