package com.exam.onlineexamapi.service;

import com.exam.onlineexamapi.domain.entity.Paper;
import com.exam.onlineexamapi.page.PageRequest;
import com.exam.onlineexamapi.page.PageResult;
import com.exam.onlineexamapi.result.RestResult;

public interface PaperService  extends CurdService<Paper>{
     PageResult findPageBySubjectId(PageRequest pageRequest);
}
