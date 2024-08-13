package com.performance.aop

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.springframework.stereotype.Component

/**
 * 시간 측정
 */
@Component
class TakeTime {

    @Around(value = "")
    fun targetTimes(proceedingJoinPoint: ProceedingJoinPoint) {


    }

}