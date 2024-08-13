package com.performance.event.rdbms.controller

import com.performance.event.rdbms.dto.RdbmsParam
import com.performance.event.rdbms.service.RdbmsService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * RDBMS 부하 테스트 Port
 */
@RequestMapping("/api/rdbms")
@RestController
class SQLController(
    private val rdbmsService: RdbmsService
) {

    @PostMapping
    fun createData(@RequestBody rdbmsParam: RdbmsParam) {
        rdbmsService.createData(rdbmsParam)
    }
}