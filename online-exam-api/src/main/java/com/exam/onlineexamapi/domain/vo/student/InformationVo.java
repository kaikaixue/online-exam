package com.exam.onlineexamapi.domain.vo.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InformationVo {
    private Integer subjectNum;
    private Integer paperNum;
    private Integer finishPaperNum;
    private Integer wrongQuestionNum;
}
