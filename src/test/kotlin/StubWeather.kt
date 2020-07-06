class StubWeather :IWeather{
    //create a property that can set a fake weather
    var fakeIsSunny = false

    override fun isSunny(): Boolean {
        //return fake weather
        return fakeIsSunny
    }
}
