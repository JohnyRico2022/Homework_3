import org.junit.Test
import kotlin.test.assertEquals

class Task2KtTest {

    @Test
    fun commissionVKPay1() {
        val paySystem: String = "VK Pay"
        val payIntoMonth: Int = 0
        val pay: Int = 200
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

       val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(00.00,result)
    }
    @Test
    fun commissionVKPay2() {
        val paySystem: String = "VK Pay"
        val payIntoMonth: Int = 0
        val pay: Int = 160000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }

    @Test
    fun commissionVKPay3() {
        val paySystem: String = "VK Pay"
        val payIntoMonth: Int = 50_000
        val pay: Int = 30_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem,payIntoMonth, pay)

        assertEquals(-33.33,result)
    }
    @Test
    fun commissionVKPay4() {
        val paySystem: String = "VK Pay"
        val payIntoMonth: Int = 50_000
        val pay: Int = 300
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem,payIntoMonth, pay)

        assertEquals(-33.33,result)
    }
    @Test
    fun commissionVisa1() {
        val paySystem: String = "Visa"
        val payIntoMonth: Int = 0
        val pay: Int = 1000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(35.00,result)
    }
    @Test
    fun commissionVisa2() {
        val paySystem: String = "Visa"
        val payIntoMonth: Int = 30_000
        val pay: Int = 5000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(37.50,result)
    }
    @Test
    fun commissionVisa3() {
        val paySystem: String = "Visa"
        val payIntoMonth: Int = 800_000
        val pay: Int = 100_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }
    @Test
    fun commissionVisa4() {
        val paySystem: String = "Visa"
        val payIntoMonth: Int = 300_000
        val pay: Int = 170_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }

    @Test
    fun commissionVisa5() {
        val paySystem: String = "Visa"
        val payIntoMonth: Int = 800_000
        val pay: Int = 170_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }


    @Test
    fun commissionMaestro1() {
        val paySystem: String = "Maestro"
        val payIntoMonth: Int = 0
        val pay: Int = 30_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(0.00,result)
    }
    @Test
    fun commissionMaestro2() {
        val paySystem: String = "Maestro"
        val payIntoMonth: Int = 0
        val pay: Int = 78_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(488.00,result)
    }
    @Test
    fun commissionMaestro3() {
        val paySystem: String = "Maestro"
        val payIntoMonth: Int = 0
        val pay: Int = 180_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }

    @Test
    fun commissionMaestro4() {
        val paySystem: String = "Maestro"
        val payIntoMonth: Int = 800_00
        val pay: Int = 180_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }

    @Test
    fun commissionMaestro5() {
        val paySystem: String = "Maestro"
        val payIntoMonth: Int = 800_000
        val pay: Int = 3_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }

    @Test
    fun commissionMastercard1() {
        val paySystem: String = "Mastercard"
        val payIntoMonth: Int = 0
        val pay: Int = 30_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(0.00,result)
    }
    @Test
    fun commissionMastercard2() {
        val paySystem: String = "Mastercard"
        val payIntoMonth: Int = 0
        val pay: Int = 78_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(488.00,result)
    }
    @Test
    fun commissionMastercard3() {
        val paySystem: String = "Mastercard"
        val payIntoMonth: Int = 0
        val pay: Int = 180_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }

    @Test
    fun commissionMastercard() {
        val paySystem: String = "Mastercard"
        val payIntoMonth: Int = 800_00
        val pay: Int = 180_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }

    @Test
    fun commissionMastercard5() {
        val paySystem: String = "Mastercard"
        val payIntoMonth: Int = 800_000
        val pay: Int = 3_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }

    @Test
    fun commissionMir1() {
        val paySystem: String = "Mir"
        val payIntoMonth: Int = 0
        val pay: Int = 1000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(35.00,result)
    }
    @Test
    fun commissionMir2() {
        val paySystem: String = "Mir"
        val payIntoMonth: Int = 30_000
        val pay: Int = 5000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(37.50,result)
    }
    @Test
    fun commissionMir3() {
        val paySystem: String = "Mir"
        val payIntoMonth: Int = 800_000
        val pay: Int = 100_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }
    @Test
    fun commissionMir4() {
        val paySystem: String = "Mir"
        val payIntoMonth: Int = 300_000
        val pay: Int = 170_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }

    @Test
    fun commissionMir5() {
        val paySystem: String = "Mir"
        val payIntoMonth: Int = 800_000
        val pay: Int = 170_000
        val monthPay = payIntoMonth + pay
        val limitMonthMax = 600_000
        val limitMonthVkMax = 40_000
        val limitDayMax = 150_000
        val limitDayVkMax = 15_000

        val result = commission(paySystem, payIntoMonth, pay)

        assertEquals(-33.33,result)
    }


}