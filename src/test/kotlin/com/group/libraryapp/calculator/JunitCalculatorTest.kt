package com.group.libraryapp.calculator

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class JunitCalculatorTest {

    @Test
    fun addTest(){
        //given

        val calulator = Calculator(5)

        //when
        calulator.add(3)
        //then
        assertThat(calulator.number).isEqualTo(8)
    }

    @Test
    fun divideExceptionTest(){
        //given

        val calculator = Calculator(5)


        //when

        val message = assertThrows<IllegalArgumentException> {
            calculator.divide(0)
        }.message



        //then
        assertThat(message).isEqualTo("0으로 나눌 수 없습니다.")
    }

}