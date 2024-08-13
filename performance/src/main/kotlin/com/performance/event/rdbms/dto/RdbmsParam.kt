package com.performance.event.rdbms.dto

import com.performance.event.rdbms.domain.TargetTable

data class RdbmsParam(
    val threadCount : Int, //스레드 개수
    val targetTable: TargetTable //대상 테이블
)


