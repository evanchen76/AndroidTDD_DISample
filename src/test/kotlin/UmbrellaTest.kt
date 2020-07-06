import org.junit.Assert
import org.junit.Test

class UmbrellaTest {

    @Test
    fun totalPrice_sunnyDay(){
        val umbrella = Umbrella()
        //create a fake weather
        val weather = StubWeather()
        //let fakeWeather is always return sunny day
        weather.fakeIsSunny = true

        //test case of sunny day
        val actual = umbrella.totalPrice(weather, 3,100)
        val expected = 270
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun totalPrice_rainingDay(){
        val umbrella = Umbrella()
        //create a fake weather
        val weather = StubWeather()
        //let fakeWeather is always return not sunny day
        weather.fakeIsSunny = false

        //test case of not sunny day
        val actual = umbrella.totalPrice(weather, 3,100)
        val expected = 300
        Assert.assertEquals(expected, actual)
    }
}