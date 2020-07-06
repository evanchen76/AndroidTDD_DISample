class Umbrella {

    //calculate price
    fun totalPrice(weather:IWeather, quantity: Int, price: Int): Int {
        // to get weather is sunny?
        val isSunny = weather.isSunny()
        var price = quantity * price

        if (isSunny) {
            // sunny day -> 90% discount
            price = (price * 0.9).toInt()
        }

        return price
    }

}