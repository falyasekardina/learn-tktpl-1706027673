package id.ac.ui.cs.mobileprogramming.myapp

import org.junit.Assert.*
import org.junit.Test

class MainActivityUnitTest {
    private val count : Int = 0
    private val mainActivity = MainActivity()

    @Test
    fun returnsIncrementNumber() {
        val resultIncrement = mainActivity.changeNumber(count, "plus")
        assertEquals(resultIncrement.num, 1 )
    }

    @Test
    fun returnsDecrementNumber() {
        val resultDecrement = mainActivity.changeNumber(count, "minus")
        assertEquals(resultDecrement.num, -1 )
    }
}