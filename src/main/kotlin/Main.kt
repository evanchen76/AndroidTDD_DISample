
fun main() {
    val weather:IWeather = Weather()
    val umbrella = Umbrella()
    umbrella.totalPrice(weather, 1, 600)
}